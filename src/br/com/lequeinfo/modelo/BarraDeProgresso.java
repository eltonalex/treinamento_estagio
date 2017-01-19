package br.com.lequeinfo.modelo;

public class BarraDeProgresso implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50000 ; i++){
			
			System.out.println("Estou imprimindo a barra de progresso!");
		}
	}

}
