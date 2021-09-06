package training360.guinessapp.recorder;

import ch.qos.logback.classic.pattern.ThrowableHandlingConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.worldrecord.ValidDate;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("api/recorders")
public class RecorderController {

    private final RecorderService recorderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecorderDto createRecorder(@Valid @RequestBody RecorderCreateCommand command){
        return recorderService.createRecorder(command);
    }



}
