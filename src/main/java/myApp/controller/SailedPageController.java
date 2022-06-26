package myApp.controller;

import lombok.RequiredArgsConstructor;
//import myApp.dto.SailedPageDto;
import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;
//import myApp.service.SailedVesselService;
import myApp.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Validated
@RequiredArgsConstructor
public class SailedPageController {

    private final ScheduleService service;

    @GetMapping("/sailed")
    public String sailedVessels(Model model){
        SchedulePageDto sailedPageDto = service.findSailedVessels();
        model.addAttribute("sailed", sailedPageDto);
        return "/sailed";
    }

//    @GetMapping("/portcall/edit")
//    public String currentPortCall(@RequestParam("id") Integer id, Model model) {
//        ScheduleDto currentPortCall = service.getByID(id)
//                .orElseThrow(() -> new IllegalArgumentException("There is no such port of call"));
//        model.addAttribute("portcall", currentPortCall);
//        return "/portcall";
//    }
//
//    @PostMapping("/portcall/save")
//    public String saveSailedPortCall(ScheduleDto schedule) {
//        service.save(schedule);
//        return "redirect:/sailed";
//    }
}
