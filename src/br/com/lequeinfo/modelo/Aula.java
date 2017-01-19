package br.com.lequeinfo.modelo;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;

	public Aula() {
		// TODO Auto-generated constructor stub
	}

	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aula: " + this.titulo + " - Tempo: " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(outraAula.titulo);
	}

}
