package br.com.callegari.curso.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.callegari.curso.model.Aluno;

public interface AlunoRepo extends CrudRepository<Aluno, Integer>{

}
