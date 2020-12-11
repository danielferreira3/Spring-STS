package com.example.demo.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Tema;
import com.example.demo.repository.TemaRepository;


//deireciona o localhost:8080 para o index
@Controller
public class ControllerGeral {

	
	@Autowired
	private TemaRepository repository;

	// localhost:0808 <- direciona p a index
	@GetMapping(value = "/")
	public String login() {
		return "index";
	}

	@GetMapping(value = "/cadastrarTema")
	public String form() {
		return "formTema";
	}

	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema){			
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
}