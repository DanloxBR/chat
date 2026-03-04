package br.com.danieldev.chat;

import java.time.LocalDateTime;

public class ChatMessage {
    private String from;
    private String content;
    private String type;
    private LocalDateTime timestamp;

    public ChatMessage(String from, String content, String type, LocalDateTime timestamp) {
        this.from = from;
        this.content = content;
        this.type = type;
        this.timestamp = timestamp;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}