package aula53_5;

import java.util.Scanner;

public class aula53 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio - Fazer um programa para ler um número inteiro positivo N. \n"
				+ "O programa deve então mostrar na tela N linhas. Começando da 1 até N. Para cada linha. \n"
				+ "Mostrar o número da linha, depois o quadrado e o cubo do valor");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Digite o valor: ");
		
		int j = sc.nextInt();
		
		for (int i = 1; i <= j; i ++) {
			int j1 = i;
			int j2 = i * i;
			int j3 = i * i * i;
			
			System.out.printf("%d %d %d%n", j1, j2, j3 );
		}
		sc.close();
	}
}