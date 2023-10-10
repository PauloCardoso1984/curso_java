package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Fazer um programa para ler um conjunto de nomes de pessoas e suas \n"
				+ "respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades \n"
				+ " em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha. ");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int n, maioridade, posicaomaior;
		
		System.out.print("Quantas pessoas vai digitar? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i]= sc.next();
			
			System.out.print("Idade: ");
			idades [i] = sc.nextInt();
			System.out.println();
		}
		
		maioridade = 0;
		posicaomaior = 0;
		
		for (int i=0; i<n; i++) {
			if (idades[i] > maioridade) {
				maioridade = idades[i];
				posicaomaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA DO GRUPO É : %s\n", nomes[posicaomaior] );
		
		sc.close();
	}
}
