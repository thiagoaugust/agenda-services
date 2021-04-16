package br.com.projeto.agendaservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.agendaservices.models.Empresa;
import br.com.projeto.agendaservices.repositories.EmpresaRepository;

@RestController
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository repository;
	
	@GetMapping("/empresa/todas")
	public List<Empresa> getEmpresas() {
		return repository.findAll();
	}
	
	@PostMapping("/empresa/nova")
	public void cadastrarEmpresa(Empresa empresa) {
		repository.save(empresa);
	}

}
