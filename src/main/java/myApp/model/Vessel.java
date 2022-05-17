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
@Table(name = "VESSELS")
public class Vessel {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "NAME_EN")
    private String nameEn;

    @NotEmpty
    @Column(name = "NAME_RU")
    private String nameRu;

    @NotEmpty
    @Column(name = "FLAG_EN")
    private String flagEn;

    @NotEmpty
    @Column(name = "FLAG_RU")
    private String flagRu;
}
