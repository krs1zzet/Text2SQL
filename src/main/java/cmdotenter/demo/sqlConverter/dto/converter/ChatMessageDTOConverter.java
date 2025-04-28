package cmdotenter.demo.sqlConverter.dto.converter;

import cmdotenter.demo.sqlConverter.dto.ChatMessageDTO;
import cmdotenter.demo.sqlConverter.entity.ChatMessage;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChatMessageDTOConverter {
    public ChatMessageDTO convert(ChatMessage from) {
        return new ChatMessageDTO(
                from.getId(),
                from.getSender(),
                from.getContent(),
                from.getCreatedAt(),
                from.getChat().getId(),
                from.getPromptSetting().getId()
        );

    }
    public List<ChatMessageDTO> convert(List<ChatMessage> from) {
        return from.stream().map(this::convert).toList();
    }
}
