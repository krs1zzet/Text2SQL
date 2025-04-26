package cmdotenter.demo.text2sql.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "chats")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "chat_title")
    private String chatTitle;

    @Column(name="created_at")
    @CreationTimestamp
    private LocalDateTime crated_at;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "chat", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ChatMessage> chatMessage;

    @OneToOne(mappedBy = "chat", cascade = CascadeType.ALL)
    private Database database;
}
