package aula;

import java.util.Locale;
import java.util.Scanner;

public class aula_63 {

	public static void main(String[] args) {
	
		System.out.println("Exercicio 1 - AULA - Fazer um programa para ler as medidas dos lados de \n"
				+ "dois triangulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas \n"
				+ "dos dois triangulos e dizer qual dos dois triangulos possui a maior área. A formula \n"
				+ " para calcular a area de um triangulo a partir das medidas de seus lados a, b, c \n"
				+ "é a seguinte (formula de Heron): area = raiz quadrada(p(p-a)(p-b)(p-c) onde p = a+b+c/2");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC;
		double yA, yB, yC;
		
		System.out.println("Digite as três medidas do triangulo X : ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as três medidas do triangulo Y : ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// CALCULANDO AREA DO TRIANGULO X
		double p = (xA + xB + xC) / 2.0; 
		double areaX = Math.sqrt(p* (p - xA)* (p -xB) * (p - xC));
		
		// CALCULANDO AREA DO TRIANGULO Y
		p = (yA + yB + yC) / 2.0; 
		double areaY = Math.sqrt(p* (p - yA)* (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if ( areaX > areaY ) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}
}
