package br.com.lequeinfo.modelo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal(){
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo(); 
		}
		return tempoTotal;
	}

}
