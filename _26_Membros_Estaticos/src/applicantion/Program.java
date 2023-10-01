package applicantion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159;  /* FINAL não deixa mudar o valor do PI
												constante sempre com letras maiusculas */
	public static void main(String[] args) {
		
		System.out.println("Fazer um programa para ler um valor numérico qualquer, \n"
				+ " e daí mostrar quanto seria o valor de uma circunferência e \n"
				+ "do volume de uma esfera para um raio daquele valor. \n"
				+ "Informar também o valor de PI com duas casas decimais.");
		
		System.out.println();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferência	: %.2f%n ", c);
		System.out.printf("Volume		: %.2f%n ", v);
		System.out.printf("PI		: %.2f%n", PI);
	
		sc.close();
	}
	
	// MÉTODOS
	public static double circunferencia (double raio) {
		return (2 * PI * raio);
	}
	public static double volume (double raio) {
		return 4 * PI * (raio * raio * raio) / 3;
	}
}