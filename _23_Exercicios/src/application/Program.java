package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		System.out.println("Fazer um programa para ler os valores da largura e altura \n"
				+ "de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro \n"
				+ " e diagonal. Usar uma classe como mostrado no projeto ao lado.");
		System.out.println();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.print("Entre com a altura: ");
		rectangle.width = sc.nextDouble();

		System.out.print("Entre com a largura: ");
		rectangle.height = sc.nextDouble();

		System.out.println();
		System.out.println("Área: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter() + ", Diagnoal: "
				+ rectangle.diagonal());

		sc.close();
	}
}
