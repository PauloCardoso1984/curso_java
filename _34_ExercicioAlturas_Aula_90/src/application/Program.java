package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("AULA 90 - VETORES - Fazer um programa para ler nome, \n"
				+ "idade e altura de N pessoas, conforme exemplo. Depois, mostrar na \n"
				+ "tela a altura média das pessoas, e mostrar também a porcentagem de \n"
				+ "pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.");
		
		System.out.println();
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, menores;
		double alturaTotal, alturaMedia, percentualMenores;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double [n];
		
		for (int i=0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			System.out.println("");
		}
		
		menores = 0;
		alturaTotal = 0;
		
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				menores++;
			}
			
		alturaTotal = alturaTotal + alturas[i];
		}
		
		alturaMedia = alturaTotal / n;
		percentualMenores = ((double)menores / n) * 100;
		
		System.out.printf("\nAltura média = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		System.out.println();
		System.out.println("Pessoas menores de 16 anos");
		for(int i=0; i<n; i++) {
			if (idades[i] < 16) {
				System.out.printf("Nome: %s\n", nomes[i]);
			}
		}
		sc.close();
	}
}
