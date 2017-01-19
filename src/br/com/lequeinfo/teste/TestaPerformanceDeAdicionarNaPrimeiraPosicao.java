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
        
		// A LinkedList é bem mais rápida para fazer a inserção na primeira
		// posição do que a ArrayList. Isso é uma característica dos algoritmos
		// dessas listas e estudada sob o tópico de Análise de algoritmos na
		// literatura.
    }
}
