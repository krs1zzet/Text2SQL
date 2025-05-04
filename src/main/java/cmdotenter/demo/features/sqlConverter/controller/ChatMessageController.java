package cmdotenter.demo.features.sqlConverter.controller;

import cmdotenter.demo.features.sqlConverter.dto.ChatMessageDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateChatMessageRequest;
import cmdotenter.demo.features.sqlConverter.service.ChatMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatMessageController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    private final ChatMessageService chatMessageService;
    public ChatMessageController(ChatMessageService chatMessageService) {
        this.chatMessageService = chatMessageService;
    }

    @GetMapping("/chat-messages")
    public ResponseEntity<List<ChatMessageDTO>> getChatMessages() {
        log.info("Find all chat messages");
        return ResponseEntity.ok(chatMessageService.findAll());
    }
    @GetMapping("/chat-messages/{id}")
    public ResponseEntity<ChatMessageDTO> getChatMessageById(@PathVariable Long id) {
        log.info("Find chat message by id");
        return ResponseEntity.ok(chatMessageService.findById(id));
    }
    @PostMapping("/chat-messages")
    public ResponseEntity<Void> createChatMessage(@RequestBody CreateChatMessageRequest createChatMessageRequest) {
        chatMessageService.save(createChatMessageRequest);
        log.info("Chat message saved");
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/chat-messages/{id}")
    public ResponseEntity<Void> deleteChatMessage(@PathVariable Long id) {
        chatMessageService.deleteById(id);
        log.info("Chat message deleted");
        return ResponseEntity.ok().build();
    }
    @GetMapping("/chat-messages/chat/{chatId}")
    public ResponseEntity<List<ChatMessageDTO>> getChatMessagesByChatId(@PathVariable Long chatId) {
        log.info("Find chat messages by chat id");
        return ResponseEntity.ok(chatMessageService.findByChatId(chatId));
    }
}
