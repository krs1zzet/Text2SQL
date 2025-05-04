package cmdotenter.demo.features.sqlConverter.service;

import cmdotenter.demo.features.sqlConverter.dto.ChatMessageDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateChatMessageRequest;

import java.util.List;

public interface ChatMessageService {
    public void save(CreateChatMessageRequest createChatMessageRequest);
    public ChatMessageDTO findById(Long id);
    public List<ChatMessageDTO> findAll();
    public void deleteById(Long id);
    public List<ChatMessageDTO> findByChatId(Long chatId);
}
