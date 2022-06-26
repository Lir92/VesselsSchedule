package myApp.controller;

import lombok.RequiredArgsConstructor;
import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;
import myApp.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Validated
@RequiredArgsConstructor
public class SchedulePageController {

    private final ScheduleService scheduleService;

//    @GetMapping("/schedule")
//    public String index(Model model,
//                        @PositiveOrZero(originValue = 20) @RequestParam(required = false,defaultValue = "0") Integer page,
//                        @Positive @RequestParam(required = false, defaultValue = "15") Integer size) {
//        SchedulePageDto fullSchedule = scheduleService.getPage(PageRequest.of(page,size));
//        model.addAttribute("schedule", fullSchedule);
//        return "/schedule";
//    }

    @GetMapping("/")
    public String index(Model model) {
        SchedulePageDto fullSchedule = scheduleService.findVessels();
        model.addAttribute("schedule", fullSchedule);
        return "/index";
    }

    @GetMapping("/schedule")
    public String schedule(Model model) {
        SchedulePageDto fullSchedule = scheduleService.findVessels();
        model.addAttribute("schedule", fullSchedule);
        return "/schedule";
    }

    @GetMapping("/portcall/add")
    public String newPortCall(){
        return "/portcall";
    }

    @GetMapping("/portcall/edit")
    public String currentPortCall(@RequestParam("id") Integer id, Model model) {
        ScheduleDto currentPortCall = scheduleService.getByID(id)
                .orElseThrow(() -> new IllegalArgumentException("There is no such port of call"));
        model.addAttribute("portcall", currentPortCall);
        return "/portcall";
    }

    @PostMapping("/portcall/save")
    public String savePortCall(ScheduleDto schedule) {
        scheduleService.save(schedule);
        return "redirect:/schedule";
    }
}