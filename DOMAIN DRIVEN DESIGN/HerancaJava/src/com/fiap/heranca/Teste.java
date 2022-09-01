package com.fiap.heranca;

public class Teste {

	public static void main(String[] args) {
		Animal animal = new Animal ();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se lomocomove");

		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ração de cachorro");
		cachorro.setLocomove("Cachorro usa 4 patas");
		cachorro.setLatido("Cachorro faz au au");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Poodle come ração de cachorro");
		poodle.setLocomove("Poodle usa 4 patas");
	}

}
