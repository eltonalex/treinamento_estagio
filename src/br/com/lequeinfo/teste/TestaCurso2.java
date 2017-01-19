package br.com.lequeinfo.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.lequeinfo.modelo.Aula;
import br.com.lequeinfo.modelo.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Lógica de Programação", "Elton Alex Silva");

		// javaColecoes.getAulas().add(new Aula("LP", 60));
		javaColecoes.adiciona(new Aula("LPT", 40));
		javaColecoes.adiciona(new Aula("LP", 60));
		javaColecoes.adiciona(new Aula("ESP", 55));

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		// Collections.sort(aulasImutaveis);// não funciona devido a restrição
		// unmodifiableList da Class Curso
		System.out.println(aulasImutaveis);

		List<Aula> aulasMutaveis = new ArrayList<Aula>(aulasImutaveis);// Fazemos
																		// uma
																		// cópia
																		// da
																		// lista
																		// para
																		// realizar
																		// o
																		// sort
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);

		System.out.println(javaColecoes.getTempoTotal());
		// List<Aula> aulas = javaColecoes.getAulas();
		// //Formas de adicionar aulas ao curso
		// aulas.add(new Aula("LPT", 40));
		// System.out.println(aulas);
		// System.out.println(javaColecoes.getAulas() == aulas);

	}

}
