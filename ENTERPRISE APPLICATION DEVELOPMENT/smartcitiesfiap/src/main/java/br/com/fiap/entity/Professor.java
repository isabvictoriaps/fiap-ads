package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_professor")
public class Professor {
	
	@Id
	@SequenceGenerator(name="professor",sequenceName="sq_tbl_professor",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="professor")
	@Column(name="id_professor")
	private int id;
	
	@Column(name="nome_professor",length = 100)
	private String nome;
	
	@Column(name="qtd_turmas")
	private int qntTurmas;
	
	@Column(name="nmr_telefone")
	private int telefone;

	@Column(name="dt_admissao")
	private Calendar dataAdmissao;

	public Professor() {
		super();
	}

	public Professor(int id, String nome, int qntTurmas, int telefone, Calendar dataAdmissao) {
		super();
		this.id = id;
		this.nome = nome;
		this.qntTurmas = qntTurmas;
		this.telefone = telefone;
		this.dataAdmissao = dataAdmissao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQntTurmas() {
		return qntTurmas;
	}

	public void setQntTurmas(int qntTurmas) {
		this.qntTurmas = qntTurmas;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
}


