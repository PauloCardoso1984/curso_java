package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		System.out.println("Em um banco, para se cadastrar uma conta bancária, \n"
				+ "é necessário informar o número da conta, o nome do titular da \n"
				+ "conta, e o valor de depósito inicial que o titular depositou \n"
				+ "ao abrir a conta. Este valor de depósito inicial, entretanto, \n"
				+ "é opcional, ou seja: se o titular não tiver dinheiro a depositar \n"
				+ "no momento de abrir sua conta, o depósito inicial não será feito e \n"
				+ "o saldo inicial da conta será, naturalmente, zero.\r\n"
				+ "Importante: uma vez que uma conta bancária foi aberta, o número da conta \n"
				+ " nunca poderá ser alterado. Já o nome do titular pode ser alterado \n"
				+ "(pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo). " + "\r\n"
				+ "Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver \n"
				+ "um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, \n"
				+ "e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma \n"
				+ "taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for \n"
				+ "suficiente para realizar o saque e/ou pagar a taxa.\r\n"
				+ "Você deve fazer um programa que realize o cadastro de uma conta, dando opção \n"
				+ "para que seja ou não informado o valor de depósito inicial. Em seguida, \n"
				+ "realizar um depósito e depois um saque, sempre mostrando os dados da conta \n"
				+ "após cada operação.");
		
		System.out.println("----------");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("ENTRE COM OS DADOS");
		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
	
		System.out.print("Nome do Titular: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Deseja entrar com um saque: (s/n) ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Entre com o valor do depósito: R$ ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(number, name, depositoInicial);
		}
		else {
			conta = new Conta(number, name);
		}
		
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Entre com o valor para depósito R$: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Dados atualizado da conta!!");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Entre con valor para saque R$: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados atualizado da conta");
		System.out.println(conta);
		
		sc.close();
	}
}
