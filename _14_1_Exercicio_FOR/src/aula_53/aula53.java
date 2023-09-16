package aula_53;

import java.util.Scanner;

public class aula53 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Exercicio 4 - Fazer um programa para ler um numero N. Depois leia N pares \n"
				+ "de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual \n"
				+ "a zero, mostrar DIVISÃO IMPOSSIVEL");
		
		int f = sc.nextInt();
		double div;
		
		for (int i = 0; i<f; i++ ) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			if (a2 == 0) {
				System.out.println("DIVISÃO IMPOSSIVEL");
			}
			else {
				div = a1 / a2; 
				System.out.println(div);
				System.out.println("----------");
			}
		}
		sc.close();
	}
}