package training360.guinessapp.worldrecord;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "world_record")
public class WorldRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String description;

    @NotNull
    private Double value;

    @NotBlank
    @Column(name = "unit_of_measure")
    private String unitOfMeasure;

    @NotNull
    @Column(name = "date_of_record")
    private LocalDate dateOfRecord;

    @NotNull
    @Column(name = "record_id")
    private Long recordId;

    public WorldRecord(String description, Double value, String unitOfMeasure, LocalDate dateOfRecord, Long recordId) {
        this.description = description;
        this.value = value;
        this.unitOfMeasure = unitOfMeasure;
        this.dateOfRecord = dateOfRecord;
        this.recordId = recordId;
    }
}
