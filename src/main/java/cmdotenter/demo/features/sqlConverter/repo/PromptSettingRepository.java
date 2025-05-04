package cmdotenter.demo.features.sqlConverter.repo;

import cmdotenter.demo.features.sqlConverter.entity.PromptSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromptSettingRepository extends JpaRepository<PromptSetting, Long> {
}
