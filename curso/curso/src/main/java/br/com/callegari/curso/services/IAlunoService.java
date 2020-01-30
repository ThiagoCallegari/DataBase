package br.com.callegari.curso.services;

import java.util.List;

import br.com.callegari.curso.model.Aluno;

public interface IAlunoService {

	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorId(int id);
}
