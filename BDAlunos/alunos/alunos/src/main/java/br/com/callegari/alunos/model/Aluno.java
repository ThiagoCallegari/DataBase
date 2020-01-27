package br.com.callegari.alunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Cria uma tabela no BD com nome aluno e variáveis virando colunas. Define a classe aluno como persistível (Atributos são gravados e recuperados.)
@Table(name="tbl_aluno") // Nome da tabela;
public class Aluno {

	@Column(name="ra") // Define a variável como coluna
	@Id // Indica que está variável será a PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o RA será gerado automaticamente.
	private int ra;
	
	@Column(name="nome", length = 100) // define o nome e o tamanho da coluna.
	private String nome;
	@Column(name="email", length = 100, unique = true) // não permite colocar 2 emails iguais.
	private String email;
	@Column(name="telefone", length = 20)
	private String telefone;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
