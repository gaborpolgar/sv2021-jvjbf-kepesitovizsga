package training360.guinessapp.recorder;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;

@Service
@AllArgsConstructor
public class RecorderService {

    private final RecorderRepository recorderRepository;
    private ModelMapper modelMapper;

    public RecorderDto createRecorder(RecorderCreateCommand command) {
        Recorder recorder = new Recorder(command.getName(), command.getDateOfBirth());
        recorderRepository.save(recorder);
        return modelMapper.map(recorder, RecorderDto.class);
    }
}
