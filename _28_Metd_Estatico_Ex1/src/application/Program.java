package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {

		System.out.println("Faça um programa para ler a cotação do dólar, e depois um \n"
				+ "valor em dólares a ser comprado por uma pessoa em reais. Informar \n"
				+ "quantos reais a pessoa vai pagar pelos dólares, considerando ainda \n"
				+ "que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar \n"
				+ " uma classe CurrencyConverter para ser responsável pelos cálculos");

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o valor do dolar:		U$$ ");
		double valorDolar = sc.nextDouble();

		System.out.print("Quantos DOLAR deseja compar? ");
		double amount = sc.nextDouble();

		double result = Calculator.valorReal(amount, valorDolar);
		System.out.printf("Valor a ser pago em reais é:	 R$ %.2f%n ", result);

		sc.close();
		
	}
}
