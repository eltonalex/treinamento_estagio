package br.com.lequeinfo.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.lequeinfo.modelo.ContaCorrente;
import br.com.lequeinfo.modelo.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contas Correntes
		
		ContaCorrente c1 = new ContaCorrente("Elton",1,0);
		c1.deposita(500);

		ContaCorrente c2 = new ContaCorrente("Felipe",2,0);
		c2.deposita(200);

		ContaCorrente c3 = new ContaCorrente("Alex",3,0);
		c3.deposita(150);

		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c3);
		contas.add(c2);

		Collections.sort(contas); // qual seria o critério para esta ordenação?
		
		for(ContaCorrente c : contas){
			System.out.println(c.getNumero()+" - "+c.getSaldo());
		}
		
		
		//Contas Poupanças
		
		ContaPoupanca c11 = new ContaPoupanca("Helena",11,0);
		c11.deposita(1500);

		ContaPoupanca c12 = new ContaPoupanca("Daniele",12,0);
		c12.deposita(3200);

		ContaPoupanca c13 = new ContaPoupanca("Cristiane",13,0);
		c13.deposita(2150);
		
		 List<ContaPoupanca> contasp = new LinkedList<>();
		//List<ContaPoupanca> contasp = new ArrayList<>();
		contasp.add(c11);
		contasp.add(c12);
		contasp.add(c13);

		Collections.sort(contasp); // qual seria o critério para esta ordenação?
		Collections.shuffle(contasp);
		
		for(ContaPoupanca c : contasp){
			System.out.println(c.getNumero()+" - "+c.getSaldo());
		}
		
	}

}
