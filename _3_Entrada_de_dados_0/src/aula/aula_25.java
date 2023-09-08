package aula;

import java.util.Locale;
import java.util.Scanner;

public class aula_25 {

	public static void main(String[] args) {

		// sc.next() - Palavra
		// sc.nextInt() - Números
		// sc.nextDouble() - Ponto flutuante
		// sc.next().charAT(0); → irá pegar apenas o primeiro caracter

//		Locale.setDefault(Locale.US);  - Vai imprimir com ponto(.) ao invés de vircula 
		Scanner sc = new Scanner(System.in); // Fazer entrada de dados - ex: teclado
		// sc.close() encerrá o objeto sc, do exemplo.
		// sc.next() receberá o digitado.
		
		System.out.print("Digite seu nome: ");
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		System.out.println("");

		System.out.print("Digite sua idade: ");
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		System.out.println("");

		System.out.printf("Digite sua altura (com virgula): ");
		double w;
		w = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", w);
		System.out.println("");

		System.out.printf("Digite um caractere: ");
		char z;
		z = sc.next().charAt(0);
		System.out.printf("Você digitou: " + z);
		System.out.println("");
		System.out.println("");

		System.out.printf("Você digitou as seguintes informações: Nome: " + x + ", Idade: " + y + ", Altura: " + w
				+ ", Caractere: " + z + ".");

		sc.close();
	}
}
