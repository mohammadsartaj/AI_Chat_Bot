package com.example.gemini.dto;

public class ChatResponseDto {
	private String reply;

    public ChatResponseDto(String reply) {
        this.reply = reply;
    }

    public String getReply() { return reply; }
    public void setReply(String reply) { this.reply = reply; }
}
