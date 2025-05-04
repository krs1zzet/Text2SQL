package cmdotenter.demo.features.sqlConverter.dto.request;

public class BaseChatRequest {

    private String chatTitle;
    private Long userId;

    public String getChatTitle() {
        return chatTitle;
    }

    public void setChatTitle(String chatTitle) {
        this.chatTitle = chatTitle;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }



    public BaseChatRequest() {
    }

    public BaseChatRequest(String chatTitle, Long userId) {
        this.chatTitle = chatTitle;
        this.userId = userId;
    }
}
