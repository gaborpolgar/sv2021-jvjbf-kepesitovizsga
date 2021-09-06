package training360.guinessapp.worldrecord;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;

@Service
@AllArgsConstructor
public class WorldRecordService {

    private WorldRecordRepository worldRecordRepository;
    private ModelMapper modelMapper;

    public WorldRecordDto createWorldRecord(WorldRecordCreateCommand command) {
        WorldRecord worldRecord = new WorldRecord(command.getDescription(), command.getValue(), command.getUnitOfMeasure(), command.getDateOfRecord(), command.getRecordId());
        worldRecordRepository.save(worldRecord);
        return modelMapper.map(worldRecord, WorldRecordDto.class);
    }


}
