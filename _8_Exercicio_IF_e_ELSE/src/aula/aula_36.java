package aula;

import java.util.Locale;
import java.util.Scanner;

public class aula_36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercicio 1 - Fazer um programa para ler um número inteiro e, \n"
				+ "depois dizer se este número é negativou ou positivo");
		double x;
		
		System.out.println("Digite um número: ");
		x = sc.nextDouble();
		if (x < 0) {
			System.out.println("Este número é NEGATIVO");
		}
		else {
			System.out.println("Este número é POSITIVO");
		}
		System.out.println("----------");
		
		System.out.println("Exercicio 2 - Digite e verifique se é PAR ou IMPAR");
		
		double y;
		System.out.println("Digite um número e verifique se é PAR ou ÍMPAR");
		y = sc.nextDouble();
		if (y % 2 == 0) {
			System.out.println("Esse número é PAR");
		}
		else {
			System.out.println("Esse número é IMPAR");
		}
		System.out.println("");
		System.out.println("----------");
		
		System.out.println("Exercico 3 -Leia 2 valores inteiros  (C e D). "
				+ "Após, programa deve mostrar uma mensagem SÃO MULTIPLOS ou NÃO SÃO MULTIPLUS, "
				+ "indicando se os valores lidos são múltiplos entre si. "
				+ "Atenção: os números devem poder ser digitados em ordem crescente ou decrescente");
		
		int c, d;
		System.out.println("Digite dois(2) números para saberem se são multiplos: ");
		c = sc.nextInt();
		d = sc.nextInt();
				
		if ( c % d == 0 || d % c == 0 ) {
			System.out.println("Esses  números SÃO MULTIPLOS.");
		}
		else {
			System.out.println("Esses números NÃO SÃO MULTIPLOS.");
		}
		System.out.println("");
		System.out.println("----------");
		
		System.out.println("Exercicio 4 - Leia a hora inicial e hora final de um jogo. "
				+ "A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia "
				+ "e terminar em outro, tendo a duração minima de 1 hora e máxima de 24 horas.");
		int e, f;
		
		
		System.out.println("Digite a hora de inicio do jogo: ");
		e = sc.nextInt();
		System.out.println("Digite a hora do término do jogo: ");
		f = sc.nextInt();
		
		int dura;
		if (e < f) {
			dura = f - e;
		} 
		else {
			dura = 24 - e + f;
		}		
		System.out.println("O jogou durou " + dura + " hora (s).");
		System.out.println("----------");


		System.out.println("Exercicio 5 - Com base na tabela abaixo, escreva um programa que leia o "
				+ "código de um item e a quintade deste item. "
				+ "A seguir, calcule e mostre o valor da conta a pagar.");
		double g, h;
		
		System.out.println("");
		System.out.println("Veja o cardápio e escolha o código e aquantidade: ");
		System.out.println("1 - Cachorro quente 		R$ 4,00 ");
		System.out.println("2 - X-Salada 			R$ 4,50 ");
		System.out.println("3 - X-Bacon 			R$ 5,00 ");
		System.out.println("4 - Torrada simples 		R$ 2,00 ");
		System.out.println("5 - Refrigerante 		R$ 1,50");
		System.out.println("");
		
		System.out.println("Digite o código do pedido: ");
		g = sc.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		h = sc.nextDouble();
		System.out.println("");
		
		double total;
		if (g == 1) {
			total = h * 4.00;
		}
		else if (g == 2) {
			total = h * 4.50;
		}
		else if (g == 3) {
			total = h * 5;
		}
		else if (g == 4) {
			total = h * 2;
		}
		else if (g == 5){
			total = h * 1.50;
		}
			else {
				total = 0;
				System.out.println("CODIGO ERRADO, VOLTE E CONFIRA!!!");
		}
		System.out.printf("O valor da compra é de R$  %.2f\n ", total);
		System.out.println(""); 
		System.out.println("----------");
		
		System.out.println("Exercicio 6 - Fazer um programa que leia um valor qulquer e "
				+ "apresente uma mensagem dizendo em qual dos seguintes intervalos "
				+ "[(0,25), (25,50), (50,75), (75,100)] este valor se encontra. "
				+ "Obviamente se o valor não estiver em nenhum destes intervalos, "
				+ "deverá ser impressa a mensagem FOR DE INTERVALO");
		
		double l;
		Locale.setDefault(Locale.US);
		System.out.println("Digite ums número e verifique os intervalos:");
		System.out.println("Digite o primeiro número: ");
		l = sc.nextDouble();
		
		if (l > 0 && l <= 25.0) {
			System.out.println("intervalo [0 , 25]");
		}
		else if (l > 26.0 && l <= 50.0) {
			System.out.println("Intervalo [25, 50]");
		}
		else if (l > 51.0 && l <= 75.0) {
			System.out.println("Intervalo [50, 75]");
		}
		else if (l > 76.0 && l < 100.0) {
			System.out.println("Intervalo [75, 100");
		}
		else {
			System.out.println("Fora de intervalo!!!");
		}
		System.out.println("");
		System.out.println("----------");
		
		System.out.println("Leia 2 valores com uma casa decimal (m, o) [=> como (x, y)], "
				+ "que devem repreentar as coordenadas de um ponto em um plano. A seguir, "
				+ "determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos "
				+ "eixos cartesiano ou na origem = 0. Se o ponto estiver na oriegem, escreva a mensagem ORIGEM. "
				+ "Se o ponto estiver sobre um dos eixos escreva Eixo M ou Eixo O. ");
		
		
		double m, o;
		System.out.println("Digite 2 numéros e veja em qual quadrante se enconta o ponto.");
		System.out.println("Digite o primeiro número: ");
		m = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		o = sc.nextDouble();
		
		if (m == 0 && o == 0) {
			System.out.println("Oigem!!");
		}
		else if (m == 0) {
			System.out.println("Eixo Y");
		}
		else if (o == 0) {
			System.out.println("Eixo X");
		}
		else if (m > 0 && o > 0) {
			System.out.println("Q1");
		}
		else if (m < 0 && o > 0) {
			System.out.println("Q2");
		}
		else if (m < 0 && o < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		System.out.println("");
		System.out.println("----------");
		
		System.out.println("Exercico 8 - Faça um programa para que realize o calculo sobre o imposto de renda: ");
		System.out.println("R$ 0,0		a	R$ 2000,00		isento");
		System.out.println("R$ 2001.01	a	R$ 3000,00		8%");
		System.out.println("R$ 3001,01	a	R$ 4500,00		18%");
		System.out.println("Acima de 		R$ 4500,01		28%");
		System.out.println("");
		
		System.out.println("Lembre que, se o salário dor R$ 3002,00 a taxa que incide é de 8% apenas sobre R$ 1000,00, "
				+ "pois a taxa de salário que fica de R$ 0,00 até R$ 2000,00 é isenta de Imposto de Renda. "
				+ "No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 100,00 + 18% sobre R$ 2,00, o que resulta "
				+ "em R$ 80,36 no total. O valor deve ser impresso com duas casas decimais.");
			
		double salario;
		System.out.println("Qual o sálario do funcionário: R$ ");
		salario = sc.nextDouble();
		
		double salario1;
		
		if ( salario < 2000 ) {
			System.out.println("Isento de IR");
		}
		else if ( salario > 2000.01 && salario < 3000) {
		 	salario1 = (salario - 2000) * 0.08;
		 	System.out.printf("Valor a pagar de imposto será: %.2f\n", salario1);
		}
		else if ( salario > 3000.01 && salario < 4500) {
		 	salario1 = (salario - 3000) * 0.18 + 1000 * 0.08;
		 	System.out.printf("Valor a pagar de imposto será: %.2f\n", salario1);
		}
		else if ( salario > 4500) {
		 	salario1 = (salario - 4500) * 0.28 + 1500 * 0.18;
		 	System.out.printf("Valor a pagar de imposto será: %.2f\n", salario1);
		}
		sc.close();
	}	
}	
