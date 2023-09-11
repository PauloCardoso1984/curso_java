package aula27;

import java.util.Scanner;

public class FuncoesMatematica {

	public static void main(String[] args) {

		/*
		 * A = Math.sqrt(x) → variavel A recebe a raiz quadrada de x 
		 * A = Math.pow(x, y) → variavel A recebe o resultado de x elevado a y 
		 * A = Maths.abs(x) → variavel A recebe o valor absoluto de x
		 */
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada → Math.sqrt");
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		System.out.println();
		
		System.out.println("Potencia → Math.pow");
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("-5 elevado ao quadrado = " + C);
		System.out.println();
		
		System.out.println("Valor absoluto → Math.abs");
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ATENÇÃO - MUITO BACANA");
		System.out.println("Formula de BASKARA → d = b2 - 4.a.c");
		System.out.print("Digite b: ");
		int b = sc.nextInt();
		System.out.print("Digite a: ");
		int a = sc.nextInt();
		System.out.print("Digite c: ");
		int c = sc.nextInt();
		
		Double delta = Math.pow(b, 2)-4*a*c;
		
		System.out.println();
		double x1 = (-b + (Math.sqrt(delta)))/(2.0 * a);
		double x2 = (-b - (Math.sqrt(delta)))/(2.0 * a);
		
		System.out.println("Delta: " + delta);
		System.out.println("Raiz x1: " + x1);
		System.out.println("Raiz x2: " + x2);
		
		sc.close();
	}
}
