package aula_85;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que leia N números reais e armazene-os em \n"
				+ "um vetor. Em seguida, mostrar na tela o maior número do vetor (supor \n"
				+ "não haver empates). Mostrar também a posição do maior elemento, \n"
				+ "considerando a primeira posição como 1 (um)");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
				
		System.out.print("Quantos números vai digitar: ");
		n = sc.nextInt();
		
		double[] numero = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite o número: ");
			numero[i] = sc.nextDouble();
		}
		System.out.println("\nMAIOR NÚMERO");
	
		maior = numero[0];
		posmaior = 1;
		
		for(int i=1; i<n; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
				posmaior = i + 1;
			}
		}
		System.out.printf("Maior valor = %.1f\n", maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n ", posmaior);
		
		sc.close();
	}
}
