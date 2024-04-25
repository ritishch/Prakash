package com.sathya.security;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {

	@GetMapping("/welcome")
	public String info()
	{
		return "Welcome to Spring Security Application";
	}
	
}
