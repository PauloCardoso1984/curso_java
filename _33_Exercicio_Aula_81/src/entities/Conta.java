package entities;

public class Conta {

	private int number;
	private String name;
	private double saldo;

	public Conta() {
	}

	public Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Conta(int number, String name, double depositoInicial) {
		this.number = number;
		this.name = name;
		deposito(depositoInicial);
	}

	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldo() {
		return saldo;
	}

	// MÉTODOS
	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	public String toString() {
		return "Conta: " + number
				+ ", Titular: " + name 
				+ ", Saldo: R$ " + String.format("%.2f", saldo);
				
	}
}
