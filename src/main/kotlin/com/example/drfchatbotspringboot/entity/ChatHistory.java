package com.example.drfchatbotspringboot.entity;


import common.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "chat_history")
public class ChatHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;

    @Column
    private String message;

    @Enumerated(EnumType.STRING)
    private Role role;
}
