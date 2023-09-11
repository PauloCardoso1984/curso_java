package aula;

import java.util.Scanner;

public class aula_31 {

	public static void main(String[] args) {

		/*
		 * OPERADORES COMPARATIVOS > maior; < menor, >= maior o igual, <= menor ou
		 * igual, == igual, != diferente.
		 * 
		 * OPERADORES LÓGICOS && → e - TODAS as condições tem que ser verdadeiras || →
		 * ou - SE ao menos UMA for verdadeira, será verdadeiro ! → não
		 */

		// ESTRUTURA CONDICIONAL SIMPLES => IF

		Scanner sc = new Scanner(System.in);

		int x = 5;

		System.out.println("QUAL SERÁ O MOMENTO DO DIA:");
		System.out.println("Bom dia!");
		System.out.println("Boa noite!");
		System.out.println("Boa madrugada");
		System.out.println();

		if (x < 0) { // AQUI IRÁ PULAR POR SER FALSA
			System.out.println("Boa tarde!");
		}

		// ESTRUTURA CONDICIONAL COMPOSTA => IF e ELSE

		int hora;
		System.out.print("Qual é a hora agora? ");
		x = sc.nextInt();

		if (x >= 6 && x <= 12) {
			System.out.println("Bom dia!!");
			System.out.println("Saúde, Paz e Muita Fé!");
		} 
		else if (x >= 13 && x <= 17) {
			System.out.println("Boa tarde!!");
			System.out.println("Já almçou? Desejo tudo de bom!");
		} 
		else if (x >= 18 && x <= 24) {
			System.out.println("Boa noite!!");
			System.out.println("Bom descanço!!");
		} 
		else {
			System.out.println("Boa madrugada!!");
			System.out.println("Bons sonhos!!");
		}
			
		sc.close();
	}
}