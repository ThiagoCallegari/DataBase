package br.com.callegari.curso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAluno")
	private int idAluno;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="cpf", length = 14)
	private String cpf;
	
	@Column(name="email", length = 50)
	private String email;
	
	@Column(name="fone", length = 14)
	private String fone;
	
	@Column(name="dataNasc", length = 10)
	private String dataNasc;
	
	@ManyToOne
	@JsonIgnoreProperties("aluno")
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int id) {
		this.idAluno = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}
