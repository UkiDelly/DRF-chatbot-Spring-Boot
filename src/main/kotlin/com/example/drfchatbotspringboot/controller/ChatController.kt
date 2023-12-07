package com.example.drfchatbotspringboot.controller

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/chat")
class ChatController {
	
	@GetMapping
	fun listChatRoom() {
	}
	
	@GetMapping("/{chatRoomId}")
	fun findChatRoom(@PathVariable chatRoomId: Long) {
	}
	@PostMapping
	fun createChatRoom() {
	}
	@DeleteMapping("/{chatRoomId}")
	fun deleteChatRoom(@PathVariable chatRoomId: Long) {
	}
	@PutMapping("/{chatRoomId}")
	fun updateChatRoom(@PathVariable chatRoomId: Long) {
	
	
	}
	@GetMapping("/{chatRoomId}/message")
	fun listChatRoomMessage(@PathVariable chatRoomId: Long) {
	}
	@GetMapping("/{chatRoomId}/system")
	fun listSystemPrompt(@PathVariable chatRoomId: Long) {
	}
	@PostMapping("/{chatRoomId}/system")
	fun createSystemPrompt(@PathVariable chatRoomId: Long) {
	}
	@DeleteMapping("/{chatRoomId}/system")
	fun deleteSystemPrompt(@PathVariable chatRoomId: Long) {
	}
	@PutMapping("/{chatRoomId}/system")
	fun updateSystemPrompt(@PathVariable chatRoomId: Long) {
	}
}