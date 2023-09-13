package while_Exercicio1;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Exercicio 1 - Faça um programa que lê números inteiros até que um zero seja lido. \n"
				+ " Ao final mostra a soma dos números lidos: ");
		
		System.out.println();
		
		System.out.print("Número: ");

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			System.out.print("Número: ");
			soma += x; // isso é igual a → (soma = soma + x;)
			x = sc.nextInt();
		}
		System.out.println("Valor somado dos números digitados é de: " + soma);
		System.out.println("===================");
		
		sc.close();
	}
}