package while_Exercicio2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 2 - Escreva um programa que repita a leitura de uma \n"
				+ "senha até que ela seja válida. Para cada leitura de senha incorreta informada, \n"
				+ "escrever a mensagem SENHA INVÁLIDA. Quando a senha for informada corrtetamente imprimir \n"
				+ "a mensagem ACESSO PERMITIDO, e o algoritmo encerrado. Considere que a senha correta seja 2002");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha:");
		int y = sc.nextInt();

		while (y != 2002) {
			System.out.println("SENHA INVALIDA!!");
			System.out.println();
			System.out.print("Digite a senha:");
			y = sc.nextInt();

		}
		System.out.println("ACESSO PERMITIDO!!");
		System.out.println("===================");
		
		sc.close();
	}
}
		