package cmdotenter.demo.features.sqlConverter.dto.request;

public class  BaseChatMessageRequest {
    private String sender;
    private String content;
    private Long chatId;
    private Long promptSettingId;

    public BaseChatMessageRequest() {
    }

    public BaseChatMessageRequest(String sender, String content, Long chatId, Long promptSettingId) {
        this.sender = sender;
        this.content = content;
        this.chatId = chatId;
        this.promptSettingId = promptSettingId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getPromptSettingId() {
        return promptSettingId;
    }

    public void setPromptSettingId(Long promptSettingId) {
        this.promptSettingId = promptSettingId;
    }
}
