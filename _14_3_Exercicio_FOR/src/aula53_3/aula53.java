package aula53_3;

import java.util.Scanner;

public class aula53 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 5 - Ler um valor N. Calcular e escrever seu respectivo fatorial. \n"
				+ "Fatorial = M*(n1)* (n-2)* )n-3 * ...1.) Lembramdo que, por definição, fatorial de 0 é 1 ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Digite o número: ");
		
		int g = sc.nextInt();
		int fat = 1;
		
		for ( int i=1; i <= g; i++) {
			fat = fat * i;
		}
		System.out.println("Fatorial de " + g + " é: " + fat);
		System.out.println("----------");
	
		sc.close();
	}
}