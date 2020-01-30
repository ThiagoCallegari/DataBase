package br.com.callegari.curso.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.callegari.curso.model.Curso;

public interface CursoRepo extends CrudRepository<Curso, Integer> {
	
}
