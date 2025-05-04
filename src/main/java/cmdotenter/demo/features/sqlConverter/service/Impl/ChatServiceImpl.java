package cmdotenter.demo.features.sqlConverter.service.Impl;

import cmdotenter.demo.features.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.features.sqlConverter.dto.converter.ChatDtoConverter;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateChatRequest;
import cmdotenter.demo.features.sqlConverter.entity.Chat;
import cmdotenter.demo.features.sqlConverter.repo.ChatRepository;
import cmdotenter.demo.features.sqlConverter.service.ChatService;
import cmdotenter.demo.features.sqlConverter.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;
    private final ChatDtoConverter chatDTOConverter;
    private final UserService userService;

    public ChatServiceImpl(ChatRepository chatRepository, ChatDtoConverter chatDTOConverter, UserService userService) {
        this.chatRepository = chatRepository;
        this.chatDTOConverter = chatDTOConverter;
        this.userService = userService;
    }

    @Transactional
    @Override
    public void save(CreateChatRequest createChatRequest) {
        Chat chat = new Chat();
        chat.setChatTitle(createChatRequest.getChatTitle());
        chat.setUser(userService.findByIdReturnUser(createChatRequest.getUserId()));
        chatRepository.save(chat);
    }

    @Override
    public ChatDTO findById(Long id) {
        Chat chat = chatRepository.findById(id).orElse(null);
        if (chat == null) {
            throw new RuntimeException("Chat not found");
        }
        return chatDTOConverter.convert(chat);

    }

    @Override
    public List<ChatDTO> findAll() {
        return chatDTOConverter.convert(chatRepository.findAll());
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        Chat chat = chatRepository.findById(id).orElse(null);
        if (chat != null) {
            chatRepository.delete(chat);
        } else {
            throw new RuntimeException("Chat not found");
        }

    }
    @Override
    public Chat findByIdReturnChat(Long id) {
        return chatRepository.findById(id).orElse(null);
    }
}
