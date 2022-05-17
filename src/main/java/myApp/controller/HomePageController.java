package myApp.controller;

import lombok.RequiredArgsConstructor;
import myApp.dto.SchedulePageDto;
import myApp.service.ScheduleService;
import myApp.validator.PositiveOrZero;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Positive;

@Controller
@Validated
@RequiredArgsConstructor
public class HomePageController {

    private final ScheduleService scheduleService;

    @GetMapping("/")
    public String index(Model model,
                        @PositiveOrZero(originValue = 20) @RequestParam(required = false,defaultValue = "0") Integer page,
                        @Positive @RequestParam(required = false, defaultValue = "15") Integer size) {
        SchedulePageDto fullSchedule = scheduleService.getPage(PageRequest.of(page,size));
        model.addAttribute("schedule", fullSchedule);
        return "/index";
    }
}
