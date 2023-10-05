package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		System.out.println("Aula 70 - Fazer um programa para ler um valor numérico qualquer, \n"
				+ "e daí mostrar quanto seria o valor de uma circunferência e do volume de \n "
				+ "uma esfera para um raio daquele valor. Informar também o valor de PI com duas \n"
				+ "casas decimais");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf(" Circunferência	: %.2f%n ", c);
		System.out.printf("Volume		: %.2f%n ", v);
		System.out.printf("PI		: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
