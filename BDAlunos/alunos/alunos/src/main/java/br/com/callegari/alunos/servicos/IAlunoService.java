package br.com.callegari.alunos.servicos;

import br.com.callegari.alunos.model.Aluno;

public interface IAlunoService {

	public void gravarAlunoNoBanco(Aluno aluno);
	public void atualizarAlunoNoBanco(Aluno aluno);
	public Aluno recuperarAlunoPorId(int id);
}
