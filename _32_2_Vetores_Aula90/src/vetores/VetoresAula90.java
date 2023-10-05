package vetores;

import java.util.Scanner;

public class VetoresAula90 {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número inteiro positivo N \n"
				+ "(máximo = 10) e depois N números inteiros e armazene-os em um vetor. \n"
				+ "Em seguida, mostrar na tela todos os números negativos lidos. ");

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int qtnumeros;
		System.out.print("Quantos numeros voce vai digitar? ");
		qtnumeros = sc.nextInt();
		int [] vetor = new int[qtnumeros];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();	
		}
		
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		sc.close();
	}
}
