package br.com.lequeinfo.teste;

import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList           
        //List<Integer> teste = new ArrayList<>();
        List<Integer> teste = new LinkedList<>();

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
        
		// A LinkedList � bem mais r�pida para fazer a inser��o na primeira
		// posi��o do que a ArrayList. Isso � uma caracter�stica dos algoritmos
		// dessas listas e estudada sob o t�pico de An�lise de algoritmos na
		// literatura.
    }
}
