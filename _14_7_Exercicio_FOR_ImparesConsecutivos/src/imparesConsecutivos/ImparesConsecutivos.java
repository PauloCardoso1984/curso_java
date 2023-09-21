package imparesConsecutivos;

import java.util.Scanner;

public class ImparesConsecutivos {

	public static void main(String[] args) {
		
		System.out.println("Fazer um programa que leia 2 valores inteiros X e Y. A seguir, \n "
				+ "calcule e mostre a soma dos números impares entre eles.");
		System.out.println("O arquivo de entrada contém dois valores inteiros");
		System.out.println("O programa deve imprimir um valor inteiro. Este valor é a soma dos \n"
				+ "valores impares que estão entre os valores fornecidos na entrada que deverá caber um inteiro");
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1º número: ");
		int x = sc.nextInt();
		
		System.out.print("2º número: ");
		int y = sc.nextInt();
		
		// VERIFICAR QUEM É O MENOR E ALINHAR x - y → SENDO O PRIMEIRO MAIOR
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.print("Valor da soma é " + soma);
		
		sc.close();
	}
}