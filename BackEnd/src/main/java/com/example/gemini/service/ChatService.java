package com.example.gemini.service;

import com.example.gemini.dto.ChatRequest;
import com.example.gemini.dto.ChatResponseDto;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    // Client will automatically pick API key from GOOGLE_API_KEY env variable
    private final Client client =new Client();

    public ChatResponseDto getChatResponse(ChatRequest request) {
        GenerateContentResponse response =
                client.models.generateContent("gemini-2.5-flash", request.getMessage(), null);

        return new ChatResponseDto(response.text());
    }
}
