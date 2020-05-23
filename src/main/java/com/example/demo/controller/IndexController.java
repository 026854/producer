package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sender.MessageSending;

@RestController
@RequestMapping(value = "/test")
public class IndexController {
	
	@Autowired
	MessageSending sending;
	
	@GetMapping(value="/producer")
	public void producer() {
		
		sending.sendingMessage("tut.topic","quick.orange.rabbit", "Hello to quick.orange.rabbit");
		
	}
	@GetMapping(value="/jieun")
	public void jieunproducer() {
		
		sending.sendingMessage("tut.topic","jieun.blabla", "Hello to jieun");
		
	}
	
	
	

}
