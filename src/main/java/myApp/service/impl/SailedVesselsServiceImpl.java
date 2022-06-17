package myApp.service.impl;

import lombok.RequiredArgsConstructor;
import myApp.dto.SailedPageDto;
import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;
import myApp.mapper.ScheduleMapper;
import myApp.model.Schedule;
import myApp.repository.ScheduleRepository;
import myApp.service.SailedVesselService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SailedVesselsServiceImpl implements SailedVesselService {

    private final ScheduleRepository repository;
    private final ScheduleMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public SailedPageDto findSailedVessels() {
        return new SailedPageDto(mapper.toDtos(repository.findSailedVessels()));
    }

//    @Override
//    public SailedPageDto getPage(Pageable pageable) {
//        Page<Schedule> currentPage = repository.findAll(pageable);
//        return new SailedPageDto(mapper.toDtos(currentPage.getContent()),
//                currentPage.getNumber(),
//                currentPage.getTotalPages(),
//                currentPage.hasNext(),
//                currentPage.hasPrevious());
//    }

    @Override
    public Optional<ScheduleDto> getByID(Integer id) {
        return Optional.empty();
    }

    @Override
    public ScheduleDto save(ScheduleDto scheduleDto) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
