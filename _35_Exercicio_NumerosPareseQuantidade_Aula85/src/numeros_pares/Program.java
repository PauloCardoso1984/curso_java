package numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia N números inteiros e armazene-os \n"
				+ "em um vetor. Em seguida, mostre na tela todos os números pares, e \n"
				+ "também a quantidade de números pares. ");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, pares;
		
		System.out.println("Digite a quantidade de numeros: ");
		n = sc.nextInt();
		
		int[] numero = new int[n];
		
		for (int i=0; i<numero.length; i++) {
			System.out.println("Digite um número: ");
			numero[i] = sc.nextInt();
		}
			
		System.out.println("\nNÚMEROS PARES: ");
		
		pares = 0;
		for(int i=0; i<n; i++) {
			if (numero[i] % 2 == 0) {
				System.out.printf("%d ", numero[i]);
				pares++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", pares);
		
		sc.close();
	}
}
