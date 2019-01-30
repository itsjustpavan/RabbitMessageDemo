package com.message.messagedemo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.messagedemo.sender.Sender;

@RestController
public class SenderResource {
	
	@Autowired
	
	private Sender sender;
	
	@GetMapping
	public void send() {
		sender.send("Pavan");
	}

}
