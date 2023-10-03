package com.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetsController {
	
	@GetMapping("/greets")
	public String greets() {
		return "Hello Welcome to Spring boot app";
	}

}
