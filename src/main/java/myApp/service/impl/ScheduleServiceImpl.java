package myApp.service.impl;

import lombok.RequiredArgsConstructor;
import myApp.dto.ScheduleDto;
import myApp.dto.SchedulePageDto;
import myApp.mapper.ScheduleMapper;
import myApp.model.Schedule;
import myApp.repository.ScheduleRepository;
import myApp.service.ScheduleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository repository;
    private final ScheduleMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<ScheduleDto> findAll() {
        return mapper.toDtos(repository.findAll());
    }

    @Override
    public SchedulePageDto getPage(Pageable pageable) {
        Page<Schedule> currentPage = repository.findAll(pageable);
        return new SchedulePageDto(mapper.toDtos(currentPage.getContent()),
                currentPage.getNumber(),
                currentPage.getTotalPages(),
                currentPage.hasNext(),
                currentPage.hasPrevious());
    }

    @Override
    public Optional<ScheduleDto> getByID(Integer id) {
        return mapper.toOptional(repository.findById(id));
    }

    @Override
    public ScheduleDto save(ScheduleDto scheduleDto) {
        return mapper.toDto(repository.save(mapper.toEntity(scheduleDto)));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
