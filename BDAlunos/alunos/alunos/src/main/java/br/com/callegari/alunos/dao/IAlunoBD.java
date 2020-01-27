package br.com.callegari.alunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.callegari.alunos.model.Aluno;
// CrudRepository é do JPA e traz pronto todas as operações do CRUD / Integer refere-se ao tipo de dado da PK
public interface IAlunoBD extends CrudRepository<Aluno, Integer>{
// Já existem as 4 operações básicas. Nomes já definidos.
}
