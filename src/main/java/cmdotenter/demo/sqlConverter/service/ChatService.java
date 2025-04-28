package cmdotenter.demo.sqlConverter.service;

import cmdotenter.demo.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.sqlConverter.dto.UserDTO;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateChatMessageRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateChatRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateUserRequest;
import cmdotenter.demo.sqlConverter.entity.Chat;

import java.util.List;

public interface ChatService {
    public void save(CreateChatRequest createChatRequest);
    public ChatDTO findById(Long id);
    public List<ChatDTO> findAll();
    public void deleteById(Long id);
    public Chat findByIdReturnChat(Long id);
}
