package br.com.fiap.projetoEducacional.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.projetoEducacional.model.Usuarios;
import br.com.fiap.projetoEducacional.repository.usuarioRepository;

//anotação que vai receber as requisições para desenvolvermos nossos endpoints
@RestController

// Receber requisições c o endpoint que queremos 
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private usuarioRepository usuarioRepository;

	//quando chegar uma requisição usando o get, vai retornar isso
	@GetMapping
	public List<Usuarios> listarUsuarios() {
		return usuarioRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuarios> buscarPorId(@PathVariable Long id) {
	Optional<Usuarios> usuario = usuarioRepository.findById(id);
	return usuario.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	
	public Usuarios adicionar(@RequestBody Usuarios usuarios) {
		return usuarioRepository.save(usuarios);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuarios> atualizar(@PathVariable Long id, @RequestBody Usuarios usuariosAtualizado) {
	Optional<Usuarios> usuarioExistente = usuarioRepository.findById(id);
	 if (usuarioExistente.isPresent()) {
		 	Usuarios usuario = usuarioExistente.get();
		 	usuario.setNomeCompleto(usuariosAtualizado.getNomeCompleto());
		 	usuario.setEndereco(usuariosAtualizado.getEndereco());
		 	usuario.setTelefone(usuariosAtualizado.getTelefone());
		 	usuarioRepository.save(usuario);
		 	return ResponseEntity.ok(usuario);
		 } else {
		 	return ResponseEntity.notFound().build();
		 }
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuarios> excluir(@PathVariable Long id) {
	Optional<Usuarios> usuario = usuarioRepository.findById(id);
	 if (usuario.isPresent()) {
		 	usuarioRepository.delete(usuario.get());
		 	return ResponseEntity.ok().build();
		 } else {
		 	return ResponseEntity.notFound().build();
		 }
	}
}
