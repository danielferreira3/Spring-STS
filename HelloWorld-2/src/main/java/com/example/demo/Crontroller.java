package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class Crontroller {
	
	@GetMapping
	public String hello2() {
		return "Objetivo de aprendizagem para essa semana é: Estudar Spring até dominar...";
	}
}
