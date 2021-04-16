package br.com.projeto.agendaservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.agendaservices.models.Servico;
import br.com.projeto.agendaservices.repositories.ServicoRepository;

@RestController
public class ServicoController {

	@Autowired
	private ServicoRepository repository;
	
	@GetMapping("/servico/todos")
	public List<Servico> getServicos(){
		return repository.findAll();
	}
	
	@PostMapping("/servico/novo")
	public void cadastrarServico(Servico servico) {
		repository.save(servico);
	}
}
