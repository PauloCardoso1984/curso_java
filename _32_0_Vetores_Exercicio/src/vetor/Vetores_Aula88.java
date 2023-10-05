package vetor;

import java.util.Scanner;

public class Vetores_Aula88 {

	public static void main(String[] args) {
		
		System.out.println("AULA 88 - VETORES - Faça um programa para ler um número N \n"
				+ "e a Altura N pessoas. Armazene as N alturas em um vetor. Em seguida, \n"
				+ "mostrar a altura média dessas pessoas.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão medidas? ");
		int quantpessoas = sc.nextInt();
		double [] vetor = new double [quantpessoas]; // CRIA VETOR DESTA FORMA
		
		System.out.print("Altura: ");
		for (int i=0; i<quantpessoas; i++) {
			vetor[i] = sc.nextDouble();	
			System.out.print("Altura: ");
		}
		
		double soma = 0;
		for (int i=0; i<quantpessoas; i++ ) {
			soma += vetor[i];
		}
		double media = soma / quantpessoas;
		
		System.out.printf("Média de altura é de: %.2f%n", media);
		
		sc.close();
	}
}
