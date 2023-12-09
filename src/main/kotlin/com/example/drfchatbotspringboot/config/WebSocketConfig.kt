package com.example.drfchatbotspringboot.config

import com.example.drfchatbotspringboot.controller.MyHandlerInterceptor
import com.example.drfchatbotspringboot.controller.MyWebSocketHandler
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry


@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {
	override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
		registry.addHandler(MyWebSocketHandler(), "/ws/chat/{chatRoomId}")
			.setAllowedOrigins("*")
			.addInterceptors(MyHandlerInterceptor())
			.withSockJS()
	}
}