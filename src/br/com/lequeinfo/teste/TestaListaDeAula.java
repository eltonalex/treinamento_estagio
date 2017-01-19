package br.com.lequeinfo.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.lequeinfo.modelo.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula a1 = new Aula("LPT", 40);
		Aula a2 = new Aula("LP", 60);
		Aula a3 = new Aula("EST", 45);
		Aula a4 = new Aula("MAT", 50);

		ArrayList<Aula> aulas = new ArrayList<>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		//Collections.sort(aulas);//Ordenando Comparando pelo nome do título 
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // Ordenando comparando com o tempo de aula
		
		//outra forma de ordenação
		//aulas.sort(Comparator.comparing(Aula::getTempo));
		//aulas.sort(Comparator.comparing(Aula::getTitulo));
		
		System.out.println(aulas);

		for (Aula aula : aulas) {
			System.out.println(aula.getTitulo());
		}
	}

}
