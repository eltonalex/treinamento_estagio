package br.com.lequeinfo.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		// cursos.remove(1);//remove elemento
		//System.out.println(cursos.get(0));
		//System.out.println(cursos);
		
		Collections.sort(cursos);
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Aula : " + cursos.get(i));
		}
		

		List<String> nomes = new ArrayList<String>();

		nomes.add("Java e persistência");
		nomes.add("Boas práticas em Java");
		nomes.add("Certificação Java");

		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
