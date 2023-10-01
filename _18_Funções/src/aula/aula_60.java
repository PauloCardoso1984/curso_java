package aula;

import java.util.Scanner;

public class aula_60 {

	public static void main(String[] args) {

		System.out.println(
				"Exercicio 1 - AULA - Fazer um programa para ler três numeros inteiros \n"
				+ "e mostrar o maior deles");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 numeros e veja qual é o maior: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

/*		//MANEIRA TRADICIONAL 
		 System.out.println("METODO TRADICIONAL");
		 
		  if (a > b && a > c ) { 
		  	System.out.println("Higher = " + a); 
		  	} else if ( b > c) { 
		  		System.out.println("Higher = " + b); 
		  		} else {
		  			System.out.println("Higher = " + c); 
		  			} 
		  System.out.println("--- --- ---");
*/
		System.out.println("Maneira MAX");
		int higher = max(a, b, c);
		showResult(higher);
	}

	// Inicio da Função Max
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	// Inicio da Função showResult
	public static void showResult(int value) {
		System.out.println("Maior número é → Higher = " + value);
	}
}
