// controller/ChatController.java
package com.example.gemini.controller;

import com.example.gemini.dto.ChatRequest;
import com.example.gemini.dto.ChatResponseDto;
import com.example.gemini.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "http://localhost:5173")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ChatResponseDto chat(@RequestBody ChatRequest request) {
        return chatService.getChatResponse(request);
    }
}
