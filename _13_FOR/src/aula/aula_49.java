package aula;

import java.util.Scanner;

public class aula_49 {

	public static void main(String[] args) {

		// ESTRUTURA
		// For (inicio; condição; incremento);
		// comandos

		Scanner sc = new Scanner(System.in);

		System.out.println("Fazer um programa que lê um valor inteiro N e depois N \n"
				+ "números inteiros. Ao final, mostra a soma dos N números lidos");
		System.out.println();

		int a;
		int soma = 0;
		System.out.print("Digite quantos números vai querer, e digite os números: ");
		a = sc.nextInt();

		for (int i=0; i < a; i++) {
			System.out.print("Digite o próximo número: ");
			int x = sc.nextInt();
			soma += x;

			System.out.println("Soma: " + soma);
			System.out.println();
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("----------");

		System.out.println("Fazer um programa para fazer numeros crescente e decrescente:");
		System.out.println("Fazer um programa de contagem");
		System.out.println("CRESCENTE");

		for (int i = 0; i <= 5; i++) {
			System.out.println("Valor de = " + i);
		}
		System.out.println();
		System.out.println("DECRESCENTE");
		for (int i = 5; i >= 0; i--) {
			System.out.println("Valor de = " + i);
		}
		System.out.println("----------");
		System.out.println();
		
		System.out.println("Fazer um programa de contagem perguntando ao cliente");
		System.out.println("CRESCENTE");
		System.out.print("Digite até que número quer a contagem? ");
		int y = sc.nextInt();
		for (int i = 0; i <= y; i++) {
			System.out.println("Valor de = " + i);
		}
		System.out.println();
		System.out.println("DECRESCENTE");
		System.out.print("Digite a partir de qual número quer a contagem? ");
		int z = sc.nextInt();
		for (int i=z; i >= 0; i--) {
			System.out.println("Valor de = " + i);
		}
		sc.close();
	}
}
