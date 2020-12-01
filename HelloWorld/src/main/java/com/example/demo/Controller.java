package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
		
	@GetMapping
	public String hello () {
		return "Habilidades e mentalidades usadas foram, persistencia, atençao aos detalhes e proatividade ";
	}
}
