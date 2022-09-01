package com.java;

/**
* Classe que abstrai uma conta bancária
* @author isabvictoriaps
* @version 1.0
*/

public class Conta {
	
	/**
	 * Número da conta
	 */
	private int numero;
	/**
	 * Saldo da conta
	 */
	private double saldo; 
	/**
	 * Número da Agência
	 */
	private int agencia;
	
	public Conta (){
		
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.setNumero(numero); 
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}
	
	/**
	 * Acrescenta valor ao saldo da conta
	 * @param valor que será depositado
	 */
	
	public void depositar (double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	/**
	 * Retira valor do saldo da conta
	 * @param valor 
	 * @see depositar
	 */
	
	public void retirar (double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return valor do saldo da conta
	 */
	
	public double verificarSaldo () {
		return this.getSaldo();
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}
