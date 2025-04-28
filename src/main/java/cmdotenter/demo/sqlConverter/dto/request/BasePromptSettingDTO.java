package cmdotenter.demo.sqlConverter.dto.request;

public class BasePromptSettingDTO {
    private String technique;
    private Integer nValue;
    private String examples;

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

    public BasePromptSettingDTO(String technique, Integer nValue, String examples) {
        this.technique = technique;
        this.nValue = nValue;
        this.examples = examples;
    }
}
