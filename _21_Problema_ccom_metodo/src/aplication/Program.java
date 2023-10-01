package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Exercicio 1 - AULA 65 - Fazer um programa para ler as medidas dos lados de \n"
				+ "dois triangulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas \n"
				+ "dos dois triangulos e dizer qual dos dois triângulos possui a maior área. A formula \n"
				+ " para calcular a area de um triangulo a partir das medidas de seus lados a, b, c \n"
				+ "é a seguinte (formula de Heron): area = raiz quadrada(p(p-a)(p-b)(p-c) onde p = a+b+c/2");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangule x, y;
		x = new Triangule();
		y = new Triangule();
		
		System.out.println();
		System.out.println("Digite as três medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as três medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// CALCULANDO AREA DO TRIANGULO X
		double areaX = x.area();

		// CALCULANDO AREA DO TRIANGULO Y
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else if (areaX < areaY) {
			System.out.println("Larger area: Y");
		} else {
			System.out.println();
			System.out.println("Os triângulos tem o mesmo tamanho!!!");
		}
		sc.close();
	}
}
