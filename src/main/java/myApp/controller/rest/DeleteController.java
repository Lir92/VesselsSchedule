package myApp.controller.rest;

import lombok.RequiredArgsConstructor;
import myApp.service.ScheduleService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeleteController {

    private final ScheduleService service;

    @DeleteMapping("/delete/{id}")
    public void deletePortCall(@PathVariable("id") Integer id) {
        service.deleteById(id);
    }
}
