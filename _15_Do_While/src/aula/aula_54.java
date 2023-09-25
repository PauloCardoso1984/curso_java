package aula;

import java.util.Locale;
import java.util.Scanner;

public class aula_54 {

	public static void main(String[] args) {
		System.out.println("Conhecendo o DO WHILE");
		System.out.println("Exercicio 1 - Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. "
				+ "Perguntar se o usuário deseja repetir (s/n). Caso o usuario digite S, repetir o programa");
		
		System.out.println("FORMULA   F = 9C/5 + 32");
		
		System.out.println("Verificar no código as diversas maneiras de resolver:");
		System.out.println();
		// 1ª FORMULA
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*		
		System.out.print("Digite a temperatura em Celsius: ");
		double a = sc.nextDouble();
		double b = ((9*a / 5) + 32);
		System.out.printf("Este valor em Fahrenheit é: %.1f%n", b);
				
		System.out.print("Deseja repetir a pesquisa? (s/n): ");
		char resp = sc.next().charAt(0);
		
		while (resp != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			a = sc.nextDouble();
			b = ((9*a / 5) + 32);
			System.out.printf("Este valor em Fahrenheit é: %.1f%n ", b);
			
			System.out.print("Deseja repetir a pesquisa? (s/n");
			resp = sc.next().charAt(0);

		}
		System.out.println("");
		System.out.println("Pesquisa FINALIZADA");
		
		 2ª e 3ª FORMULA
		 char resp = 's';
		
		 while (resp != 'n') {
*/		
				
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double a = sc.nextDouble();
			double b = ((9*a / 5) + 32);
			System.out.printf("Este valor em Fahrenheit é: %.1f%n", b);
			System.out.println();
			System.out.print("Deseja repetir a pesquisa? (s/n): ");
			sc.nextLine();
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		System.out.println("");
		System.out.println("Pesquisa FINALIZADA.");

		sc.close();
	}
}