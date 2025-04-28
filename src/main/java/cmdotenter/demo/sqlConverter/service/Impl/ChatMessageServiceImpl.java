package cmdotenter.demo.sqlConverter.service.Impl;

import cmdotenter.demo.sqlConverter.dto.ChatMessageDTO;
import cmdotenter.demo.sqlConverter.dto.converter.ChatMessageDTOConverter;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateChatMessageRequest;
import cmdotenter.demo.sqlConverter.entity.ChatMessage;
import cmdotenter.demo.sqlConverter.entity.PromptSetting;
import cmdotenter.demo.sqlConverter.repo.ChatMessageRepository;
import cmdotenter.demo.sqlConverter.service.ChatMessageService;
import cmdotenter.demo.sqlConverter.service.ChatService;
import cmdotenter.demo.sqlConverter.service.PromptSettingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageServiceImpl implements ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;
    private final ChatMessageDTOConverter chatMessageDTOConverter;
    private final ChatService chatService;
    private final PromptSettingService promptSettingService;

    public ChatMessageServiceImpl(ChatMessageRepository chatMessageRepository, ChatMessageDTOConverter chatMessageDTOConverter, ChatService chatService, PromptSettingService promptSettingService) {
        this.chatMessageRepository = chatMessageRepository;
        this.chatMessageDTOConverter = chatMessageDTOConverter;
        this.chatService = chatService;
        this.promptSettingService = promptSettingService;
    }


    @Override
    public void save(CreateChatMessageRequest createChatMessageRequest) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setChat(chatService.findByIdReturnChat(createChatMessageRequest.getChatId()));
        chatMessage.setContent(createChatMessageRequest.getContent());
        chatMessage.setSender(createChatMessageRequest.getSender());
        chatMessage.setPromptSetting(promptSettingService.findByIdReturnPromptSetting(createChatMessageRequest.getPromptSettingId()));
        chatMessageRepository.save(chatMessage);
    }

    @Override
    public ChatMessageDTO findById(Long id) {
        ChatMessage chatMessage = chatMessageRepository.findById(id).orElse(null);
        if (chatMessage == null) {
            throw new RuntimeException("Chat message not found");
        }
        return chatMessageDTOConverter.convert(chatMessage);
    }

    @Override
    public List<ChatMessageDTO> findAll() {
        return chatMessageDTOConverter.convert(chatMessageRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        ChatMessage chatMessage = chatMessageRepository.findById(id).orElse(null);
        if (chatMessage != null) {
            chatMessageRepository.delete(chatMessage);
        } else {
            throw new RuntimeException("Chat message not found");
        }

    }
}
