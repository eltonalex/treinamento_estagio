package br.com.lequeinfo.teste;

import br.com.lequeinfo.modelo.Aula;
import br.com.lequeinfo.modelo.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Lógica de Programação", "Elton Alex Silva");
		
		//javaColecoes.getAulas().add(new Aula("LP", 60));
		javaColecoes.adiciona(new Aula("LP", 60));
		javaColecoes.adiciona(new Aula("LPT", 50));
		javaColecoes.adiciona(new Aula("SO", 55));
		
		System.out.println(javaColecoes.getAulas());
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		//Formas de adicionar aulas ao curso
//		aulas.add(new Aula("LPT", 40));
//		System.out.println(aulas);
//		System.out.println(javaColecoes.getAulas() == aulas);
		
		
	}

}
