package br.com.lequeinfo.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.lequeinfo.modelo.Conta;
import br.com.lequeinfo.modelo.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		Random random = new Random();

		ContaPoupanca c1 = new ContaPoupanca("Ana", random.nextInt(2000), 0);
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca("Maria", random.nextInt(2000), 0);
		c2.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca("Helena", random.nextInt(2000), 0);
		c3.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c3);

		Collections.sort(contas);

		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}
