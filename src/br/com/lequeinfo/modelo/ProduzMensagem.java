package br.com.lequeinfo.modelo;

import java.util.Collection;
//import java.util.HashSet;
//import java.util.LinkedList;

public class ProduzMensagem implements Runnable {
	private int comeco;
	private int fim;
	private Collection<String> mensagens;// M�todo add n�o synchronized

	// private LinkedList<String> mensagens; // M�todo add n�o synchronized
	// private HashSet<String> mensagens; // M�todo add n�o synchronized
	// private Vector<String> mensagens; //Ao utilizar a Class Vector temos o
	// m�todo add que � synchronized
	public ProduzMensagem(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	public void run() {
		for (int i = comeco; i < fim; i++) {
			synchronized (mensagens) { // foi necess�rio o uso do synchronized
										// pois apenas no caso da Class Vector o
										// m�todo add � synchronized por padr�o
				mensagens.add("Mensagem " + i);
			}
		}
	}
}