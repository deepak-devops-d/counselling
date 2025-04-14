package com.example.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private ChatRepository chatRepo;

    @MessageMapping("/chat")
    public void send(ChatMessage message) {
        chatRepo.save(message);  // Persist message
        template.convertAndSend("/topic/messages/" + message.getRecipient(), message);
    }
}

