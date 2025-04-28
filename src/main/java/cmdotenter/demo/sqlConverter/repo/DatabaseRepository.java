package cmdotenter.demo.sqlConverter.repo;

import cmdotenter.demo.sqlConverter.entity.Database;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepository extends JpaRepository<Database, Long> {
}
