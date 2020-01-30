package br.com.callegari.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.callegari.curso.model.Curso;
import br.com.callegari.curso.services.ICursoService;

@RestController
@CrossOrigin("*")
public class CursoController {

	@Autowired
	private ICursoService servico;
	
	@PostMapping("/curso/novo")
	public ResponseEntity<Curso> incluirNovo(@RequestBody Curso curso) {
		servico.adicionarNovoCurso(curso);
		return ResponseEntity.ok(curso);
	}
	
	@GetMapping("/curso/todos")
	public ResponseEntity<List<Curso>> listarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/curso/{id}")
	public ResponseEntity<Curso> listarDetalhes(@PathVariable int id) {
		Curso curs = servico.recuperarDetalhes(id);
		
		if (curs != null) {
			return ResponseEntity.ok(curs);
		}
		return ResponseEntity.notFound().build();
	}
}
