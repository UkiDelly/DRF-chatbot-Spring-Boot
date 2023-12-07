package com.example.drfchatbotspringboot.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="system_prompt")
public class SystemPrompt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prompt;

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;

    @Column(name="created_at")
    private LocalDateTime createdAt;
}
