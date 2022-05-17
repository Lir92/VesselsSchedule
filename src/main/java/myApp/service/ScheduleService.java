package myApp.service;

import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface ScheduleService {

    List<ScheduleDto> findAll();
    SchedulePageDto getPage(Pageable pageable);
    Optional<ScheduleDto> getByID(Integer id);
    ScheduleDto save(@Valid ScheduleDto scheduleDto);
    void deleteById(Integer id);
}
