package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela \n"
				+ "a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for \n"
				+ " digitado, mostrar a mensagem \"NENHUM NUMERO PAR\" ");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, somapares = 0, pares=0;
		double mediapares;
		
		System.out.print("Quantos numeros terá no vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				somapares = somapares + vetor[i];
				pares++;
		}
	}
		if (pares == 0) {
			System.out.println();
			System.out.println("NENHUM NÚMERO PAR ");
		}
		else {
			System.out.println();
			mediapares = (double) somapares / pares;
			System.out.printf("MÉDIA DOS PARES = %.1f\n ", mediapares);
		}
		sc.close();
	}
}