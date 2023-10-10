package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Fazer um programa para ler um número inteiro N e \n"
				+ "depois um vetor de N números reais. Em seguida, mostrar na \n"
				+ "tela a média aritmética de todos elementos com três casas \n"
				+ " decimais. Depois mostrar todos os elementos do vetor que \n"
				+ "estejam abaixo da média, com uma casa decimal cada.");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos números vai digitar no vetor? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite o numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		
		for (int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		media = soma / n;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f\n ", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		
		for (int i=0; i<n; i++) {
			if (vetor[i] < media) {
				System.out.printf(" %.1f\n", vetor[i]);
			}
		}
		sc.close();
	}
}