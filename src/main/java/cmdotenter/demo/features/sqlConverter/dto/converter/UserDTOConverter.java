package cmdotenter.demo.features.sqlConverter.dto.converter;

import cmdotenter.demo.features.sqlConverter.dto.UserDTO;
import cmdotenter.demo.features.sqlConverter.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDTOConverter {
    public UserDTO convert(User from) {
        return new UserDTO(
                from.getId(),
                from.getEmail(),
                from.getCreatedAt(),
                from.getStatus()
        );
    }
    public List<UserDTO> convert(List<User> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
