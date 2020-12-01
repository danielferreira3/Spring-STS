package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManutencaoController {

	@GetMapping("/get1")
	public String hello1() {
		return "Hey Get1 Hello World";
		
		
	}
	@GetMapping("/get2")
	public String hello2() {
		return "Hey Daniel Hello World";
	}
}
