package br.com.callegari.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.callegari.curso.dao.CursoRepo;
import br.com.callegari.curso.model.Curso;

@Component
public class CursoService implements ICursoService{

	@Autowired
	CursoRepo repo;
	
	@Override
	public void adicionarNovoCurso(Curso curs) {
		repo.save(curs);
	}

	@Override
	public Curso recuperarDetalhes(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Curso> recuperarTodos() {
		return (List<Curso>)repo.findAll();
	}
}
