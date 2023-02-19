package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_aluno")
public class Aluno {

	@Id
	@SequenceGenerator(name="aluno",sequenceName="sq_tbl_aluno",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluno")
	@Column(name = "rm_aluno")
	private int rm;
	
	@Column(name="nome_aluno",length = 100)
	private String nome;
	
	@Column(name="nmr_telefone")
	private int telefone;
	
	@Column(name="email_aluno")
	private String email;
	

	public Aluno() {
		super();
	}

	public Aluno(int rm, String nome, int telefone, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
