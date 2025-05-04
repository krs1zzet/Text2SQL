package cmdotenter.demo.features.sqlConverter.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "chat_messages")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sender")
    private String sender;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "prompt_id")
    private PromptSetting promptSetting;


    public ChatMessage() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public PromptSetting getPromptSetting() {
        return promptSetting;
    }

    public void setPromptSetting(PromptSetting promptSetting) {
        this.promptSetting = promptSetting;
    }

    public ChatMessage(Long id, String sender, String content, LocalDateTime createdAt, Chat chat, PromptSetting promptSetting) {
        this.id = id;
        this.sender = sender;
        this.content = content;
        this.createdAt = createdAt;
        this.chat = chat;
        this.promptSetting = promptSetting;
    }
}
