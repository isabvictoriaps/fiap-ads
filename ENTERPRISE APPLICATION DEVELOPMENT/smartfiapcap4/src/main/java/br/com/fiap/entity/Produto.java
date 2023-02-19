package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tb_produto")
public class Produto{
	
	@Id
	@SequenceGenerator(name="produto",sequenceName="sq_tb_produto",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto")
	@Column(name="cd_produto")
	private int id;
	
	@Column(name="nm_produto",nullable=false,length=100)
	private String nome;
	
	@Column(name="vl_produto")
	private double preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_data_validade")
	private Calendar dataValidade;
	
	@Column(name="dt_cadastro")
	@CreationTimestamp
	private Calendar dataCadastro;
	
	@Column(name="dt_modificacao")
	@UpdateTimestamp
	private Calendar dataModificacao;
	
	@Formula("vl_preco*0.9")
	private double precoDesconto;
	

	public int getId() {
		return id;
	}

	public void setd(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
	public double getPrecoDesconto() {
		return precoDesconto;
	}
	
	public void setPrecoDesconto(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}
	
	

	public Produto() {
		super();
	}

	public Produto(int id, String nome, double preco, Calendar dataValidade, Calendar dataCadastro,
			Calendar dataModificacao, double precoDesconto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.dataCadastro = dataCadastro;
		this.dataModificacao = dataModificacao;
		this.precoDesconto = precoDesconto;
	}
	

}




