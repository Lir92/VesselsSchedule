package myApp.service;

import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;

import javax.validation.Valid;
import java.util.Optional;

public interface ScheduleService {

//    List<ScheduleDto> findAll();
    SchedulePageDto findVessels();
    SchedulePageDto findSailedVessels();
//    SchedulePageDto getPage(Pageable pageable);
    Optional<ScheduleDto> getByID(Integer id);
    ScheduleDto save(@Valid ScheduleDto scheduleDto);
    void deleteById(Integer id);
}
