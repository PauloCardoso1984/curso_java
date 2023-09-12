package aula37;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		/* 
		 * OPERADORES DE ATRIBUIÇÃO CUMULATIVA
		 * a+=b		a = a+b
		 * a-=b		a = a-b;
		 * a*=b		a = a*b;
		 * a/=b		a = a/b;
		 * a%=b		a = a%b
		 */
		
		System.out.println("Uma operadora de telefonia cobra R$ 50.00 por um plano báscio que dá direito \n"
				+ "na 100 minutos de telefone. Cada mnuto que exceder a franquia de 100 minutos custa \n"
				+ "R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, \n"
				+ "daí mostrar o valor a ser pago.");
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos minutos de telefone foi utilizado: ");
		int x = sc.nextInt();
		if (x <= 100) {
			System.out.print("Valor a ser pago é de R$ 50,00");
		} else {
			if (x > 100) {
				double b = (x - 100) * 2 + 50;
				System.out.printf("Valor a se pago é de %.2f\n", b);
		}	
	}
		sc.close();
	}
}
