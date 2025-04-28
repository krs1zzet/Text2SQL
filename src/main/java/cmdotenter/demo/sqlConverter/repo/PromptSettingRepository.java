package cmdotenter.demo.sqlConverter.repo;

import cmdotenter.demo.sqlConverter.entity.PromptSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromptSettingRepository extends JpaRepository<PromptSetting, Long> {
}
