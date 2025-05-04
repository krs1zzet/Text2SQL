package cmdotenter.demo.features.sqlConverter.repo;

import cmdotenter.demo.features.sqlConverter.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
