package br.com.lequeinfo.modelo;

public class CopiadorDeAquivo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50000 ; i++){
			
			System.out.println("Estou imprimindo o copiador de arquivo!");
		}
	}


}
