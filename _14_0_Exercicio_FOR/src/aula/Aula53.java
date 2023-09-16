package aula;

import java.util.Scanner;

public class Aula53 {

	public static void main(String[] args) {
		
		System.out.println("Aula 53");
		System.out.println("Exercicio 1 - Leia um valor inteiro (1 <= X <= 1000). \n"
				+ "Em seguida mostre os impares de 1 até X, um valor por linha, \n"
				+ "inclusive o X, se for o caso");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("NÚMEROS ÍMPARES");
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("NÚMEROS PARES");
		for (int i=1; i<=a; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}