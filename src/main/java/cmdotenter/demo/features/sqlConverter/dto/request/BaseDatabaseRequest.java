package cmdotenter.demo.features.sqlConverter.dto.request;

public class BaseDatabaseRequest {
    private String schemaText;
    private String dataText;
    private Long chatId;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public BaseDatabaseRequest(String schemaText, String dataText, Long chatId) {
        this.schemaText = schemaText;
        this.dataText = dataText;
        this.chatId = chatId;
    }

    public String getSchemaText() {
        return schemaText;
    }

    public void setSchemaText(String schemaText) {
        this.schemaText = schemaText;
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
    }

    public BaseDatabaseRequest() {
    }

}
