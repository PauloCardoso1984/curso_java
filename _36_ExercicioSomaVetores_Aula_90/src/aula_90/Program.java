package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("AULA VETORES - Faça um programa para ler dois vetores A e B, \n"
				+ "contendo N elementos cada. Em seguida, gere um terceiro vetor C \n"
				+ "onde cada elemento de C é a soma dos elementos correspondentes de \n"
				+ "A e B. Imprima o vetor C gerado. ");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos número vai digitar? ");
		n = sc.nextInt();
		System.out.println();
		
		int [] vetorA = new int[n];
		int [] vetorB = new int[n];
		int [] vetorC = new int[n];
		int [] vetorD = new int[n];
		
		System.out.println("Digite os numeros do vetor A: ");
		
		for (int i=0; i<n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os numeros do vetor B: ");
		
		for (int i=0; i<n; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		// SOMA
		for (int i=0; i<n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		// MEDIA
		for (int i=0; i<n; i++) {
			vetorD[i] = (vetorA[i] + vetorB[i]) / n;
		}
		
		// IMPRIMIR A SOMA
		System.out.println();
		System.out.println("VETOR RESULTANTE: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n" , vetorC[i]);
		}
		
		// IMPRIMIR MEDIA
		System.out.println();
		System.out.println("VETOR MEDIA: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n" , vetorD[i]);
		}
		sc.close();
	}
}
