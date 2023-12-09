package com.example.drfchatbotspringboot.controller

import com.example.drfchatbotspringboot.service.ChatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.stereotype.Component
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.WebSocketMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.server.HandshakeInterceptor


@Component
class MyWebSocketHandler : WebSocketHandler {
	
	
	@Autowired
	lateinit var chatService: ChatService
	
	// 연결 직후
	override fun afterConnectionEstablished(session: WebSocketSession) {
	
	
	}
	
	
	// 메시지가 도착했을때
	override fun handleMessage(session: WebSocketSession, message: WebSocketMessage<*>) {
	
	}
	
	// 에러 처리
	override fun handleTransportError(session: WebSocketSession, exception: Throwable) {
	
	}
	
	// 연결 종료 이후
	override fun afterConnectionClosed(session: WebSocketSession, closeStatus: CloseStatus) {
	
	}
	
	override fun supportsPartialMessages(): Boolean {
		return false
	}
	
}


class MyHandlerInterceptor : HandshakeInterceptor {
	
	
	// 연결 수락 이전에
	override fun beforeHandshake(
		request: ServerHttpRequest,
		response: ServerHttpResponse,
		wsHandler: WebSocketHandler,
		attributes: MutableMap<String, Any>
	): Boolean {
		
		val path = request.uri.rawPath
		println(path)
		return true
	}
	
	
	// 연결 수락 이후에
	override fun afterHandshake(
		request: ServerHttpRequest,
		response: ServerHttpResponse,
		wsHandler: WebSocketHandler,
		exception: Exception?
	) {
	}
}
