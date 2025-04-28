package cmdotenter.demo.sqlConverter.dto;

import cmdotenter.demo.sqlConverter.entity.ChatMessage;
import cmdotenter.demo.sqlConverter.entity.Database;
import cmdotenter.demo.sqlConverter.entity.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

public class ChatDTO {

    private Long id;

    private String chatTitle;

    private LocalDateTime created_at;

    private Long userId;

    public ChatDTO(Long id, String chatTitle, LocalDateTime created_at, Long userId) {
        this.id = id;
        this.chatTitle = chatTitle;
        this.created_at = created_at;
        this.userId = userId;
    }

    public ChatDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChatTitle() {
        return chatTitle;
    }

    public void setChatTitle(String chatTitle) {
        this.chatTitle = chatTitle;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


}
