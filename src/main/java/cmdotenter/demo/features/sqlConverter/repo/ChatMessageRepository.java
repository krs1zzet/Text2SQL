package cmdotenter.demo.features.sqlConverter.repo;

import cmdotenter.demo.features.sqlConverter.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    public List<ChatMessage> findAllByChatId(Long chatId);
}
