package aula53_4;

import java.util.Scanner;

public class Aula53 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio - Ler um número inteiro N e calcular todos os seus divisores");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Digite o número: ");
		int h = sc.nextInt();
		
		for ( int i = 1; i <= h; i++) {
			if (h % i == 0) {
				System.out.println(i);
		}
		sc.close();
		}
	}
}