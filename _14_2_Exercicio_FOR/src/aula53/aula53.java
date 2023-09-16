package aula53;

import java.util.Scanner;

public class aula53 {

	public static void main(String[] args) {
		
		System.out.println("Exercico 3 - Leia 1 valor inteiro N, que representa o número de casos \n"
				+ "de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, \n"
				+ "cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes \n"
				+ "conuntos de 3 valores, sendo que o primeiro valor tem peso 2, "
				+ "o segundo peso 3 e o terceiro valor tem peso 5.");
		System.out.println();
		
		System.out.println("Digite os valores");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: ");
		int cc = sc.nextInt();
		
		for (int i = 0; i < cc; i++ ) {
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			
			double mp = ( c * 2 + d * 3 + e * 5) / 10;
		
			System.out.printf("%.1f%n ", mp);
			System.out.println("");
			System.out.println("----------");
		}
		sc.close();
	}
}				