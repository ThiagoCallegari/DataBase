package br.com.callegari.curso.services;

import java.util.List;

import br.com.callegari.curso.model.Curso;

public interface ICursoService {

	public void adicionarNovoCurso(Curso curs);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();
}
