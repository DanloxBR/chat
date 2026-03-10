package br.com.danieldev.chat;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    private String from;
    private String content;
    private MessageType type;
    private LocalDateTime timestamp;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
