package cmdotenter.demo.sqlConverter.dto;

import java.time.LocalDateTime;

public class DatabaseDTO {

    private Long id;
    private String schemaText;
    private String dataText;
    private LocalDateTime createdAt;
    private Long chatId;

    public DatabaseDTO(Long id, String schemaText, String dataText, LocalDateTime createdAt, Long chatId) {
        this.id = id;
        this.schemaText = schemaText;
        this.dataText = dataText;
        this.createdAt = createdAt;
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DatabaseDTO() {
    }

}
