package br.com.lequeinfo.teste;

import br.com.lequeinfo.modelo.BarraDeProgresso;
import br.com.lequeinfo.modelo.CopiadorDeAquivo;

public class TestaThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		CopiadorDeAquivo copiador = new CopiadorDeAquivo();
		Thread t2 = new Thread(copiador);
		t2.start();

	}

}
