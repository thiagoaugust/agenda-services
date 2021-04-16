package br.com.projeto.agendaservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.agendaservices.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
