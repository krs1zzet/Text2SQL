package cmdotenter.demo.features.sqlConverter.service.Impl;

import cmdotenter.demo.features.sqlConverter.dto.PromptSettingDTO;
import cmdotenter.demo.features.sqlConverter.dto.converter.PrompSettingDTOConverter;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreatePromptSettingRequest;
import cmdotenter.demo.features.sqlConverter.entity.PromptSetting;
import cmdotenter.demo.features.sqlConverter.repo.PromptSettingRepository;
import cmdotenter.demo.features.sqlConverter.service.PromptSettingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromptSettingServiceImpl implements PromptSettingService {

    private final PromptSettingRepository promptSettingRepository;
    private final PrompSettingDTOConverter prompSettingDTOConverter;

    public PromptSettingServiceImpl(PromptSettingRepository promptSettingRepository, PrompSettingDTOConverter prompSettingDTOConverter) {
        this.promptSettingRepository = promptSettingRepository;
        this.prompSettingDTOConverter = prompSettingDTOConverter;
    }


    @Override
    public Long save(CreatePromptSettingRequest createPromptSettingRequest) {
        PromptSetting promptSetting = new PromptSetting();
        promptSetting.setExamples(createPromptSettingRequest.getExamples());
        promptSetting.setTechnique(createPromptSettingRequest.getTechnique());
        promptSetting.setnValue(createPromptSettingRequest.getnValue());
        promptSetting.setModelName(createPromptSettingRequest.getModel());
        promptSettingRepository.save(promptSetting);
        return promptSetting.getId();
    }

    @Override
    public PromptSettingDTO findById(Long id) {
        Optional<PromptSetting> promptSetting = promptSettingRepository.findById(id);
        PromptSetting promptSettingEntity = promptSetting.orElseThrow(() -> new RuntimeException("Prompt setting not found"));
        return prompSettingDTOConverter.convert(promptSettingEntity);
    }

    @Override
    public List<PromptSettingDTO> findAll() {
        return prompSettingDTOConverter.convert(promptSettingRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        Optional<PromptSetting> promptSetting = promptSettingRepository.findById(id);
        if (promptSetting.isPresent()) {
            promptSettingRepository.delete(promptSetting.get());
        } else {
            throw new RuntimeException("Prompt setting not found");
        }
    }

    @Override
    public PromptSetting findByIdReturnPromptSetting(Long id) {
        return promptSettingRepository.findById(id).orElseThrow(() -> new RuntimeException("Prompt setting not found"));
    }
}
