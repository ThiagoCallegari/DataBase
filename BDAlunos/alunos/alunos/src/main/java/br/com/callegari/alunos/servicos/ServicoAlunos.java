package br.com.callegari.alunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.callegari.alunos.dao.IAlunoBD;
import br.com.callegari.alunos.model.Aluno;

@Component
public class ServicoAlunos implements IAlunoService {

	@Autowired // O Springboot inicializa a variável (Injeta esta dependência no BD)
	IAlunoBD repo; // Repositório -> Alusão ao BD

	@Override
	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno!");
		}
	}

	@Override
	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao atualizar aluno no banco");
		}
	}

	@Override
	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();
	}
}
