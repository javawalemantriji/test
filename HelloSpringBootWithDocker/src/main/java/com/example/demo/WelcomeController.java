package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String sayWelcome() {
		return "<H1>HELLO INFOBEANS.called by other microservices---------------------..!!!";
	}
}
