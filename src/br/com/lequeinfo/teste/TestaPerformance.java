package br.com.lequeinfo.teste;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");

		// Collection<Integer> teste = new ArrayList<Integer>();

		// Trocamdo a ArrayList por um HashSet podemos ver o tempo que vai
		// demorar:

		Collection<Integer> teste = new HashSet<>();

		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		

		// No caso das listas (ArrayList e LinkedList), a inserção é bem rápida
		// e a busca muito lenta!
		
		// No caso dos conjuntos (TreeSet e HashSet), a inserção ainda é rápida,
		// embora um pouco mais lenta do que a das listas. E a busca é muito
		// rápida!
		
	}
}