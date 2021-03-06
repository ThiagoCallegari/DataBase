package br.com.callegari.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.callegari.curso.model.Aluno;
import br.com.callegari.curso.services.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private IAlunoService servico;
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> mostrarPorId(@PathVariable int id) {
		Aluno a = servico.recuperarPorId(id);
		
		if (a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> incluirNovo(@RequestBody Aluno aluno) {
		servico.adicionarNovoAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
	@PutMapping("/aluno/atualizar")
	public ResponseEntity<Aluno> atualizarAluno(@RequestBody Aluno aluno) {
		servico.atualizaAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
}
