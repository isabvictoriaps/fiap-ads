package br.com.fiap.projetoEducacional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.projetoEducacional.model.Usuarios;

@Repository
public interface usuarioRepository extends JpaRepository<Usuarios, Long>{
	
}
