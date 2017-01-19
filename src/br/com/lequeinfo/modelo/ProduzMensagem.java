package br.com.lequeinfo.modelo;

import java.util.Collection;
//import java.util.HashSet;
//import java.util.LinkedList;

public class ProduzMensagem implements Runnable {
	private int comeco;
	private int fim;
	private Collection<String> mensagens;// Método add não synchronized

	// private LinkedList<String> mensagens; // Método add não synchronized
	// private HashSet<String> mensagens; // Método add não synchronized
	// private Vector<String> mensagens; //Ao utilizar a Class Vector temos o
	// método add que é synchronized
	public ProduzMensagem(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	public void run() {
		for (int i = comeco; i < fim; i++) {
			synchronized (mensagens) { // foi necessário o uso do synchronized
										// pois apenas no caso da Class Vector o
										// método add é synchronized por padrão
				mensagens.add("Mensagem " + i);
			}
		}
	}
}