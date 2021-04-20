package com.example.OAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String Primeiro() {
		return "primeiro";
	}
	
	@GetMapping("/seguro")
	public String Segundo() {
		return "segundo com google";
	}

}
