package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.\n"
				+ " Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de \n"
				+ " altura das mulheres, e o número de homens. ");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, homens, mulheres;
		double menoraltura, maioraltura, alturaFemMedia, alturaFemTotal;
		
		System.out.print("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();
		
		double[]alturas = new double[n];
		char[]generos = new char[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: M ou H: ", i+ 1);
			generos[i] = sc.next().charAt(0);
			System.out.println();
		}
		
		// MAIOR E MENOR ALTURA
		menoraltura = alturas[0];
		maioraltura = alturas[0];
		
		for (int i=1; i<n; i++) {
			if(alturas[i] > maioraltura) {
				maioraltura = alturas[i];
			}
			if (alturas[i] < menoraltura) {
				menoraltura = alturas[i];
			}
		}
		
		// SOMA DA ALTURA DAS MULHERES
		homens = 0;
		mulheres = 0;
		alturaFemTotal = 0;
		
		for (int i=0; i<n; i++) {
			if(generos[i] == 'M') {
				mulheres++;
			alturaFemTotal += alturas[i];	
			}
			else
				homens++;
		}
	
		alturaFemMedia = alturaFemTotal / mulheres; 
		
		System.out.printf("Menor altura 				= %.2f\n", menoraltura);
		System.out.printf("Maior altura 				= %.2f\n", maioraltura);
		System.out.printf("Media das altura das mulheres		= %.2f\n", alturaFemMedia);
		System.out.printf("Numero de homens 			= %d\n" , homens);
		
		sc.close();
	}
}