package curso;

import java.util.Locale;

public class aula {

	public static void main(String[] args) {


		System.out.println("--- Aula 17 - PRIMEIRO PROGRAMA ----");
		System.out.println("Olá mundo!"); // println para quebra de linha
		System.out.println("Bom dia");
		System.out.println(""); // pula 1 linha

		System.out.println("----Aula 20 ----- OPERADORES LÓGICO");
		int a = 4;
		int b = 2;
		int c = 3;

		double soma = a + b;
		double multiplicacao = a * c;
		double mod = a % c; // nesse caso pegará apenas o resto da espressão
		double divisao = a / b;

		System.out.println("Soma de a + b = " + soma);
		System.out.println("Multiplicação a * c = " + multiplicacao);
		System.out.println("Mod, operador que pega o resto da divisão a % c = " + mod);
		System.out.println("Divisão de a / b = " + divisao);
		System.out.println();
		
		System.out.println("---- Aula 23 ---- SAÍDA DE DADOS");
		int y = 32;
		double x = 10.3483456;
		String w = "Paulo";
		int idade = 38;
		double renda = 19879.0;
		String nome = "Paulo";
		
		System.out.println("Numero original:" + x);
		System.out.println("Numero original:	" +y);
		System.out.println("Nome:			"  + w);
		System.out.printf("Numero formatado	 %.2f%n	", x); // "%.2f%n - define quantidade de casas decimais
		Locale.setDefault(Locale.US); // mudança de vircula para ponto
		System.out.println();
		System.out.printf("Numero formatado %.3f%n ", x);
		System.out.println("");
		System.out.printf("%s é um funcionário que tem %d anos e receberá R$ %.2f reais", nome, idade, renda);

		// ("%f = ponto flutuante,
		// %d = inteiro,
		// %s= texto,
		// %n = quebra de linha");

		System.out.println("");
		System.out.println("");
		String product1 = "Computer";
		String product2 = "Oficce desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products");
		System.out.printf("%s, which price is R$ %.2f%n", product1, price1);
		System.out.printf("%s, which price is R$ %.2f%n", product2, price2);
		System.out.println("");
		System.out.printf("Record: 30 years old, code %d and gender: %s\n", code, gender);
		System.out.println("");
		System.out.printf("Measue with eigth decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three dec; imal places): %.2f\n", measure);
		System.out.printf("US decimal point: %.3f\n", measure);
	}
}
