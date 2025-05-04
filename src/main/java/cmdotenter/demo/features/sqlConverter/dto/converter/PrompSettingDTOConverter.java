package cmdotenter.demo.features.sqlConverter.dto.converter;

import cmdotenter.demo.features.sqlConverter.dto.PromptSettingDTO;
import cmdotenter.demo.features.sqlConverter.entity.PromptSetting;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrompSettingDTOConverter {
    public PromptSettingDTO convert(PromptSetting from) {
        return new PromptSettingDTO(
                from.getId(),
                from.getTechnique(),
                from.getnValue(),
                from.getExamples(),
                from.getCreatedAt()
        );
    }
    public List<PromptSettingDTO> convert(List<PromptSetting> from) {
        return from.stream().map(this::convert).toList();
    }
}
