package cmdotenter.demo.sqlConverter.controller;

import cmdotenter.demo.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateChatRequest;
import cmdotenter.demo.sqlConverter.entity.Chat;
import cmdotenter.demo.sqlConverter.service.ChatService;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatController {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(ChatController.class);

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public ResponseEntity<List<ChatDTO>> getChat() {
        List<ChatDTO> chatDTOList = chatService.findAll();
        logger.info("Find all chat");
        return ResponseEntity.ok(chatDTOList);
    }
    @PostMapping("/chat")
    public ResponseEntity<Void> createChat(@RequestBody CreateChatRequest createChatRequest) {
        chatService.save(createChatRequest);
        logger.info("Chat saved");
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/chat/{id}")
    public ResponseEntity<Void> deleteChat(@PathVariable Long id) {
        chatService.deleteById(id);
        logger.info("Chat deleted");
        return ResponseEntity.ok().build();
    }
}
