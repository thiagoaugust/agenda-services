package br.com.projeto.agendaservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.agendaservices.models.Servico;

public interface ServicoRepository  extends JpaRepository<Servico, Long>{

}
