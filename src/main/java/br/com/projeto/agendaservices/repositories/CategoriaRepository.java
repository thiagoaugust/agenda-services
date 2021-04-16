package br.com.projeto.agendaservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.agendaservices.models.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
