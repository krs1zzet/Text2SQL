package cmdotenter.demo.features.sqlConverter.service;

import cmdotenter.demo.features.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateChatRequest;
import cmdotenter.demo.features.sqlConverter.entity.Chat;

import java.util.List;

public interface ChatService {
    public void save(CreateChatRequest createChatRequest);
    public ChatDTO findById(Long id);
    public List<ChatDTO> findAll();
    public void deleteById(Long id);
    public Chat findByIdReturnChat(Long id);
}
