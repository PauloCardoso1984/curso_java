package aula;

import java.util.Scanner;

public class aula_39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Aula 29 - CONDIÇÃO TERNÁRIA
		
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		System.out.println("Resolvendo de outra forma: IF e ELSE - Tradicional");
		System.out.println("Valor do desconto é R$: " + desconto);
		System.out.println("");
		
		System.out.println("Resolvendo de outra forma: CONDICAO TERNARIA");
		double taxa = 34.5;
		double desconte = (taxa < 20.0) ? taxa * 0.1 : taxa * 0.05;
		System.out.println("Valor do desconto é R$: " + desconte);
	}
}