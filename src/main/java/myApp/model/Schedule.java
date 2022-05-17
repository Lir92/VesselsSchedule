package myApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VesselsSchedule")
public class Schedule {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "JOB_NUMBER", nullable = false, unique = true)
    private String jobNumber;

    @NotEmpty
    @Column(name = "VESSEL_NAME", nullable = false)
    private String vesselName;

    @NotEmpty
    @Column(name = "CARGO", nullable = false)
    private String cargo;

    @NotEmpty
    @Column(name = "ETA", nullable = false)
    private String eta;

    @NotEmpty
    @Column(name = "ETB", nullable = false)
    private String etb;

    @NotEmpty
    @Column(name = "ETC", nullable = false)
    private String etc;

    @NotEmpty
    @Column(name = "ETD", nullable = false)
    private String etd;

//    @NotEmpty
    @Column(name = "VESSEL_STATUS", nullable = false)
    private String status;
}
