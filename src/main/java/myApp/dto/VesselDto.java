package myApp.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class VesselDto {

    private Integer id;

    @NotNull
    @Size(min = 1, max = 150)
    private String nameEn;

    @NotNull
    @Size(min = 1, max = 150)
    private String nameRu;

    @NotNull
    @Size(min = 1, max = 150)
    private String flagEn;

    @NotNull
    @Size(min = 1, max = 150)
    private String flagRu;
}
