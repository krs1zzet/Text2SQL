package cmdotenter.demo.features.sqlConverter.dto;

import java.time.LocalDateTime;

public class PromptSettingDTO {

    private Long id;

    private String technique;

    private Integer nValue;

    private String examples;

    private LocalDateTime createdAt;

    private String modelName;

    public PromptSettingDTO(Long id, String technique, Integer nValue, String examples, LocalDateTime createdAt, String modelName) {
        this.id = id;
        this.technique = technique;
        this.nValue = nValue;
        this.examples = examples;
        this.createdAt = createdAt;
        this.modelName = modelName;
    }

    public PromptSettingDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExamples() {
        return examples;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

    public Integer getnValue() {
        return nValue;
    }

    public void setnValue(Integer nValue) {
        this.nValue = nValue;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
