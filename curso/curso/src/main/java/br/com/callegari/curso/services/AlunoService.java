package br.com.callegari.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.callegari.curso.dao.AlunoRepo;
import br.com.callegari.curso.model.Aluno;

@Component
public class AlunoService implements IAlunoService {

	@Autowired
	private AlunoRepo repo;
	
	@Override
	public List<Aluno> recuperarTodos() {
		return (List<Aluno>)repo.findAll();
	}

	@Override
	public Aluno recuperarPorId(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void adicionarNovoAluno(Aluno aluno) {
		repo.save(aluno);
	}

	@Override
	public void atualizaAluno(Aluno aluno) {
		repo.save(aluno);
	}	
}
