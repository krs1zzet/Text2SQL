package cmdotenter.demo.sqlConverter.repo;

import cmdotenter.demo.sqlConverter.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
