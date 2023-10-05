package vetores_Aula90;

import java.util.Scanner;

public class Aula90 {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: \r\n"
				+ "- Imprimir todos os elementos do vetor \r\n"
				+ "- Mostrar na tela a soma e a média dos elementos do vetor");

		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int qtnumero = 0;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		qtnumero = sc.nextInt();
		double [] vetor = new double[qtnumero];
		
		for (int i=0; i< vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		for (int i=0; i<qtnumero; i++) {
			soma = soma + vetor[i];
		}
		
		media = soma / qtnumero;
		System.out.println();
		System.out.print("VALORES = ");
		for (int i=0; i<qtnumero; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.println();
		System.out.printf("\nSOMA = %.2f\n ", soma);
		System.out.printf("MEDIA= %.2f\n ", media);
		
		sc.close();
	}
}
