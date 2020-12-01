package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/pagina")
public class Controller implements WebMvcConfigurer{

	//quando o usuario digitar localhost:8080 o sistema le como localhost:8080/
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}

	@Autowired // injeção
	private ManutencaoRepository repository; //caminhão que leva os dados na tabela
	
	//insert ----- localhot;8080/pagina/manutencoes
	@PostMapping("/manutencoes")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetinho) {
		repository.save(objetinho);
		return objetinho;							//insert into tb_manutencao "oque a pessoa digitar no body"
	}
		
	@GetMapping("/manutencoes/{id}")
	public Optional<ManutencaoTable> encontrarUm(@PathVariable long id) {
		return repository.findById(id);				//select * from tb_manutencao where id = {id}
	}
	
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> pesquisarTodos(){
		return repository.findAll();				//select * from tb_manutencao
	}
	
}
