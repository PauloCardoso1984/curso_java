package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class Program {

	public static void main(String[] args) {
		System.out.println("Exercicio 1 - AULA - Fazer um programa para ler as medidas dos lados de \n"
				+ "dois triangulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas \n"
				+ "dos dois triangulos e dizer qual dos dois triangulos possui a maior área. A formula \n"
				+ " para calcular a area de um triangulo a partir das medidas de seus lados a, b, c \n"
				+ "é a seguinte (formula de Heron): area = raiz quadrada(p(p-a)(p-b)(p-c) onde p = a+b+c/2");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangule x, y;
		x = new Triangule();
		y = new Triangule();
		System.out.println();
		
		System.out.println("Digite as três medidas do triângulo X : ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as três medidas do triângulo Y : ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// CALCULANDO AREA DO TRIÂNGULO X
		double p1 = (x.a + x.b + x.c);
		double p = (x.a + x.b + x.c) / 2.0; 
		double areaX = Math.sqrt(p* (p - x.a)* (p - x.b) * (p - x.c));
		
		// CALCULANDO AREA DO TRIÂNGULO Y
		double q1 = (y.a + y.b + y.c);
		double q = (y.a + y.b + y.c) / 2.0; 
		double areaY = Math.sqrt(q* (q - y.a)* (q - y.b) * (q - y.c));
		
		System.out.printf("Triângulo X area: 		%.4f%n", areaX);
		System.out.println("Perímetro do Triângulo X: 	" + p1);
		System.out.println();
		System.out.printf("Triângulo Y area:		 %.4f%n", areaY);
		System.out.println("Perímetro do Triângulo Y: 	" + q1);
		
		if ( areaX > areaY ) {
			System.out.println("Larger area: X");
		}
		else if ( areaX < areaY ) {
			System.out.println("Larger area: Y");
		}
		else {
			System.out.println();
			System.out.println("Tem o mesmo tamanho os Triângulos X e Y.");
		}
		sc.close();
	}
}