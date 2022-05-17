package myApp.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ScheduleDto {

    private Integer id;

    @NotNull
    @Size(min = 1, max = 255)
    private String jobNumber;

    @NotNull
    @Size(min = 1, max = 255)
    private String vesselName;

    @NotNull
    @Size(min = 1, max = 100)
    private String cargo;

    @NotNull
    @Size(min = 1, max = 50)
    private String eta;

    @NotNull
    @Size(min = 1, max = 50)
    private String etb;

    @NotNull
    @Size(min = 1, max = 50)
    private String etc;

    @NotNull
    @Size(min = 1, max = 50)
    private String etd;

//    @NotNull
    @Size(min = 1, max = 15)
    private String status;
}
