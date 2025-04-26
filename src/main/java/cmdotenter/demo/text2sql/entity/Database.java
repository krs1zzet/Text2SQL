package cmdotenter.demo.text2sql.entity;

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
    @JoinColumn(name = "chat_id", referencedColumnName = "id")
    private Chat chat;
}
