package cmdotenter.demo.features.sqlConverter.repo;

import cmdotenter.demo.features.sqlConverter.entity.Database;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepository extends JpaRepository<Database, Long> {
}
