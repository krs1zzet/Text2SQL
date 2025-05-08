package cmdotenter.demo.features.sqlConverter.controller;

import cmdotenter.demo.features.sqlConverter.dto.PromptSettingDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreatePromptSettingRequest;
import cmdotenter.demo.features.sqlConverter.service.PromptSettingService;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PromptSettingController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(PromptSettingController.class);

    private final PromptSettingService promptSettingService;

    public PromptSettingController(PromptSettingService promptSettingService) {
        this.promptSettingService = promptSettingService;
    }

    @GetMapping("/prompt-setting")
    public ResponseEntity<List<PromptSettingDTO>> getAllPromptSettings() {
        List<PromptSettingDTO> promptSettingDTOList = promptSettingService.findAll();
        log.info("Find all prompt settings");
        return ResponseEntity.ok(promptSettingDTOList);
    }

    @PostMapping("/prompt-setting")
    public ResponseEntity<Long> createPromptSetting(@RequestBody CreatePromptSettingRequest createPromptSettingRequest) {
        Long id = promptSettingService.save(createPromptSettingRequest);
        log.info("Prompt setting saved");
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/prompt-setting/{id}")
    public ResponseEntity<Void> deletePromptSetting(@PathVariable Long id) {
        promptSettingService.deleteById(id);
        log.info("Prompt setting deleted");
        return ResponseEntity.ok().build();
    }
}
