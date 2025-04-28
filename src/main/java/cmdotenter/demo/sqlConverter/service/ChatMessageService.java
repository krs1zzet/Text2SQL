package cmdotenter.demo.sqlConverter.service;

import cmdotenter.demo.sqlConverter.dto.ChatMessageDTO;
import cmdotenter.demo.sqlConverter.dto.UserDTO;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateChatMessageRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateUserRequest;

import java.util.List;

public interface ChatMessageService {
    public void save(CreateChatMessageRequest createChatMessageRequest);
    public ChatMessageDTO findById(Long id);
    public List<ChatMessageDTO> findAll();
    public void deleteById(Long id);
}
