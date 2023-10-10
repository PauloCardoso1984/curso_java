package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que leia N números reais e armazene-os \n"
				+ " em um vetor. Em seguida: Imprimir todos os elementos do vetor "
				+ "- Mostrar na tela a soma e a média dos elementos do vetor");
		
		System.out.println("");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma, media;
		
		System.out.println("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
			
		for (int i=0; i <n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println("NUMEROS DIGITADOS: ");
		for (int i=0; i<n; i++) {
			if (vetor[i] < 0 && vetor[i] > 0) {
				System.out.printf("%d\n", vetor[i]);
			}
			soma = 0;
		for (i=0; i<n; i++) {
			soma = soma + vetor[i];
			
			}
		media = soma / n;
		System.out.println("");
		System.out.print("Valores = ");
		for (i=0; i<n; i++) {
			System.out.printf("%.1f - ", vetor[i]);
		}
	    System.out.printf("\nSOMA	= %.2f\n", soma);
	    System.out.printf("MEDIA	= %.2f\n", media);
		}
	}
}
