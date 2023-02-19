package br.com.fiap.teste;

import javax.persistence.Persistence;

public class Teste {
			
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("smartcitiesfiap").createEntityManager();
		
		}	

	}
