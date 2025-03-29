package cmdotenter.text2sql.repo;

import cmdotenter.text2sql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
