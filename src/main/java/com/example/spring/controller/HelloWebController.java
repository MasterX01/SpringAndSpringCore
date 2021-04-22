package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

	@GetMapping("/web")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message");
		return "message";
	}
}
