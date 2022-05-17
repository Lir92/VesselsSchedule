package myApp.mapper;

import myApp.dto.VesselDto;
import myApp.model.Vessel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface VesselMapper {

    @Mapping(target = "nameEn", source = "vessel.nameEn")
    @Mapping(target = "nameRu", source = "vessel.nameRu")
    @Mapping(target = "flagEn", source = "vessel.flagEn")
    @Mapping(target = "flagRu", source = "vessel.flagRu")
    VesselDto toDto(Vessel vessel);

    @Mapping(target = "nameEn", source = "vessel.nameEn")
    @Mapping(target = "nameRu", source = "vessel.nameRu")
    @Mapping(target = "flagEn", source = "vessel.flagEn")
    @Mapping(target = "flagRu", source = "vessel.flagRu")
    Vessel toEntity(VesselDto vessel);

    default List<VesselDto> toDtos(List<Vessel> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<VesselDto> toOptional(Optional<Vessel> entity) {
        return entity.map(this::toDto);
    }
}
