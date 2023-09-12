package aula;

import java.util.Locale;
import java.util.Scanner;

public class aula_37 {

	public static void main(String[] args) {

		System.out.println("Operadores de atribuição cumulativa:  "
				+ "a += b  =>  a = a + b, "
				+ "a -= b  =>  a = a - b, "
				+ "a *= b  =>  a = a * b, "
				+ "a /= b  =>  a = a / b, "
				+ "a %= b  =>  a = a % b");
		
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Uma operadora de telefonia cobra R$ 50.00 por um plano básico que \n"
				+ "dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia de \n"
				+ "100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos \n"
				+ "que uma pessoa consumiu, daí ostrar o valor a ser pago.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		
		int a;
		System.out.print("Quantos minutos foram consumidos: ");
		a = sc.nextInt();
		
		double b = 50.0;
		if (a <= 100) {
			System.out.println("Valor a pagar é R$ 50,00");
		}
		else if (a > 100) {
			b += (a - 100) * 2;
			System.out.printf("Valor a ser pagar é R$ %.2f%n ",  b);
		}
		System.out.println("");
		
		sc.close();
	}
}


