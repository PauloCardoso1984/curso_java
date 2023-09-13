package while_Exercicio3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 3 - Escreva um programa para ler as coordenadas de uma quantidade \n"
				+ "indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante \n"
				+ "a que ele pertence O (zero) algoritimo será encerrado quando pelo menos uma das de \n"
				+ "duas coordenadas dor NULA");
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("Digite os dois números: ");
		a = sc.nextInt();
		b = sc.nextInt();

		while (a != 0 && b != 0) {
			if (a > 0 && b > 0) {
				System.out.println("Primeiro Quadrante");
			} else if (a < 0 && b > 0)  {
				System.out.println("Segundo Quadrante");
			} else if (a < 0 && b < 0) {
				System.out.println("Terceiro Quadrante");
			} else {
				System.out.println("Quarto Quadrante");

			}
			a = sc.nextInt();
			b = sc.nextInt();

		}
		sc.close();
	}
}