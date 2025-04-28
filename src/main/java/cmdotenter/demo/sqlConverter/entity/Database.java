package cmdotenter.demo.sqlConverter.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "databases")
public class Database {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "schema_text")
    private String schemaText;

    @Column(name = "data_text")
    private String dataText;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "chat_id")  // FK burada
    private Chat chat;

    public String getSchemaText() {
        return schemaText;
    }

    public void setSchemaText(String schemaText) {
        this.schemaText = schemaText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Database() {
    }

    public Database(Long id, String schemaText, String dataText, LocalDateTime createdAt, Chat chat) {
        this.id = id;
        this.schemaText = schemaText;
        this.dataText = dataText;
        this.createdAt = createdAt;
        this.chat = chat;
    }
}
