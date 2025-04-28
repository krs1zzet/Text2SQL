package cmdotenter.demo.sqlConverter.service;

import cmdotenter.demo.sqlConverter.dto.PromptSettingDTO;
import cmdotenter.demo.sqlConverter.dto.UserDTO;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreatePromptSettingRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateUserRequest;
import cmdotenter.demo.sqlConverter.entity.PromptSetting;

import java.util.List;

public interface PromptSettingService {
    public void save(CreatePromptSettingRequest createPromptSettingRequest);
    public PromptSettingDTO findById(Long id);
    public List<PromptSettingDTO> findAll();
    public void deleteById(Long id);
    public PromptSetting findByIdReturnPromptSetting(Long id);
}
