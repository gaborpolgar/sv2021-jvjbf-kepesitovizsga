package training360.guinessapp.worldrecord;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;

@RestController
@RequestMapping("/api/worldrecords")
@AllArgsConstructor
public class WorldRecordController {

    private final WorldRecordService worldRecordService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WorldRecordDto createWorldRecord(@RequestBody WorldRecordCreateCommand command) {
return worldRecordService.createWorldRecord(command);
    }


}
