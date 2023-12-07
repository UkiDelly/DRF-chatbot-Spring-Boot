package com.example.drfchatbotspringboot.controller

import com.example.drfchatbotspringboot.entity.User
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/account")
class AccountController {
	
	
	@PostMapping("/login")
	fun login(){}
	
	@PostMapping("/register")
	fun register(){}
	
	
	@RequestMapping("/myinfo" , method = [ RequestMethod.GET, RequestMethod.PATCH])
	fun myInfo( request: HttpServletRequest)  {

	}
	
	
	
	@PostMapping("/autoLogin")
	fun autoLogin(){}
	
	@PostMapping("/refresh")
	fun refresh(){}
}