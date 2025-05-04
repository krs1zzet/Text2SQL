package cmdotenter.demo.features.sqlConverter.repo;

import cmdotenter.demo.features.sqlConverter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
