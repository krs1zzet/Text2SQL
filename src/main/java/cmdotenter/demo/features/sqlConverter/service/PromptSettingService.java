package cmdotenter.demo.features.sqlConverter.service;

import cmdotenter.demo.features.sqlConverter.dto.PromptSettingDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreatePromptSettingRequest;
import cmdotenter.demo.features.sqlConverter.entity.PromptSetting;

import java.util.List;

public interface PromptSettingService {
    public void save(CreatePromptSettingRequest createPromptSettingRequest);
    public PromptSettingDTO findById(Long id);
    public List<PromptSettingDTO> findAll();
    public void deleteById(Long id);
    public PromptSetting findByIdReturnPromptSetting(Long id);
}
