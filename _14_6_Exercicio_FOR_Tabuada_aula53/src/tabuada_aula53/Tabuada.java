package tabuada_aula53;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		System.out.println("Fazer um programa para fazer uma TABUADA, ler 1 valor inteiro N \n"
				+ "(2 < N < 1000). A seguir, mostre a tabuada de N: (de 1 a 10");
		System.out.println("A entrada contém um valor inteiro N (2 < N < 1000.");
		System.out.println("Imprime a tabuada de N");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Digite o valor que deseja a tabuada: ");
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		sc.close();
	}
}