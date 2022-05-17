package myApp.mapper;

import myApp.dto.ScheduleDto;
import myApp.model.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {

    @Mapping(target = "jobNumber", source = "schedule.jobNumber")
    @Mapping(target = "vesselName", source = "schedule.vesselName")
    @Mapping(target = "cargo", source = "schedule.cargo")
    @Mapping(target = "eta", source = "schedule.eta")
    @Mapping(target = "etb", source = "schedule.etb")
    @Mapping(target = "etc", source = "schedule.etc")
    @Mapping(target = "etd", source = "schedule.etd")
    @Mapping(target = "status", source = "schedule.status")
    ScheduleDto toDto(Schedule schedule);

    @Mapping(target = "jobNumber", source = "schedule.jobNumber")
    @Mapping(target = "vesselName", source = "schedule.vesselName")
    @Mapping(target = "cargo", source = "schedule.cargo")
    @Mapping(target = "eta", source = "schedule.eta")
    @Mapping(target = "etb", source = "schedule.etb")
    @Mapping(target = "etc", source = "schedule.etc")
    @Mapping(target = "etd", source = "schedule.etd")
    @Mapping(target = "status", source = "schedule.status")
    Schedule toEntity(ScheduleDto schedule);

    default List<ScheduleDto> toDtos(List<Schedule> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<ScheduleDto> toOptional(Optional<Schedule> entity) {
        return entity.map(this::toDto);
    }
}
