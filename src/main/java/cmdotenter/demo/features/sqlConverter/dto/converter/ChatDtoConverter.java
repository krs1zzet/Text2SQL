package cmdotenter.demo.features.sqlConverter.dto.converter;

import cmdotenter.demo.features.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.features.sqlConverter.entity.Chat;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ChatDtoConverter {
    public ChatDTO convert(Chat from) {

        return new ChatDTO(
                from.getId(),
                from.getChatTitle(),
                from.getCreated_at(),
                from.getUser().getId()
        );
    }
    public List<ChatDTO> convert(List<Chat> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}

