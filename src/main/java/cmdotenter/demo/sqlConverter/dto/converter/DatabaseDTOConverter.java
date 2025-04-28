package cmdotenter.demo.sqlConverter.dto.converter;

import cmdotenter.demo.sqlConverter.dto.DatabaseDTO;
import cmdotenter.demo.sqlConverter.entity.Database;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DatabaseDTOConverter {
    public DatabaseDTO convert(Database from) {
        return new DatabaseDTO(
                from.getId(),
                from.getSchemaText(),
                from.getDataText(),
                from.getCreatedAt(),
                from.getChat().getId()
        );
    }
    public List<DatabaseDTO> convert(List<Database> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
