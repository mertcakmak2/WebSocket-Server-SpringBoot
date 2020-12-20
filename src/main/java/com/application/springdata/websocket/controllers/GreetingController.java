package com.application.springdata.websocket.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GreetingController {
	
	
	
	@MessageMapping("/websocket")
	@SendTo("/topic")
	public String greeting(String message) throws InterruptedException {
		Thread.sleep(1000);
		return message;
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}

}
