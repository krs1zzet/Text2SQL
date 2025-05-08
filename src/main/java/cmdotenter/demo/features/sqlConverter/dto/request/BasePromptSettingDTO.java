package cmdotenter.demo.features.sqlConverter.dto.request;

public class BasePromptSettingDTO {
    private String technique;
    private Integer nValue;
    private String examples;
    private String model;

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public Integer getnValue() {
        return nValue;
    }

    public void setnValue(Integer nValue) {
        this.nValue = nValue;
    }

    public String getExamples() {
        return examples;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

    public BasePromptSettingDTO() {
    }

    public BasePromptSettingDTO(String technique, String examples, Integer nValue, String model) {
        this.technique = technique;
        this.examples = examples;
        this.nValue = nValue;
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

}
