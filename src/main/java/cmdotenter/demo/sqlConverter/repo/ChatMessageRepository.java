package cmdotenter.demo.sqlConverter.repo;

import cmdotenter.demo.sqlConverter.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
