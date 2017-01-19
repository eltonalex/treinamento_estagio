package br.com.lequeinfo.modelo;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private String titular;
	private int agencia;
	protected int numero;
	private static int totalDeContas = 0;

	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	public Conta(String titular, int numero, double saldoInicial) {
		this.setTitular(titular);
		this.setNumero(numero);
		this.deposita(saldoInicial);
		totalDeContas++;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor;
		}
	}


	public abstract void atualiza(double taxa);

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int compareTo(Conta outra) {
        return this.getNumero() - outra.getNumero();
    }

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", agencia=" + agencia + ", numero=" + numero + "]";
	}

	


}
