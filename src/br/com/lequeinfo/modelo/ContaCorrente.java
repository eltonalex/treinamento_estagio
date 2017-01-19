package br.com.lequeinfo.modelo;

public class ContaCorrente extends Conta {
	
	//A interface é como um contrato e 
	//sem "assiná-lo" a existência do método é só uma coincidência 
	//e não dá a certeza para a JVM de que a intenção era mesmo assinar aquele contrato.
	
	int numero;
	double saldoInicial;
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String titular, int numero, double saldoInicial) {
		super(titular, numero, saldoInicial);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

//	@Override
//	 public int compareTo(ContaCorrente outra) {
//        if (this.saldo < outra.saldo) {
//          return -1;
//        }
//
//        if (this.saldo > outra.saldo) {
//          return 1;
//        }
//
//        return 0;
//      }
//	
	
}
