package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class RecorderCreateCommand {

    private String name;
    private LocalDate dateOfBirth;
}
