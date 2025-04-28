package cmdotenter.demo.sqlConverter.dto;

import cmdotenter.demo.sqlConverter.entity.Chat;
import cmdotenter.demo.sqlConverter.entity.PromptSetting;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class ChatMessageDTO {

    private Long id;

    private String sender;

    private String content;

    private LocalDateTime createdAt;

    private Long chatId;

    private Long promptSettingId;

    public ChatMessageDTO(Long id, String sender, String content, LocalDateTime createdAt, Long chatId, Long promptSettingId) {
        this.id = id;
        this.sender = sender;
        this.content = content;
        this.createdAt = createdAt;
        this.chatId = chatId;
        this.promptSettingId = promptSettingId;
    }

    public ChatMessageDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
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
