package myApp.service;

import myApp.dto.SailedPageDto;
import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface SailedVesselService {

    SailedPageDto findSailedVessels();
//    SailedPageDto getPage(Pageable pageable);
    Optional<ScheduleDto> getByID(Integer id);
    ScheduleDto save(@Valid ScheduleDto scheduleDto);
    void deleteById(Integer id);
}
