package aula_29;

import java.util.Scanner;

public class aula {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x, y;		
		System.out.println("Exercicio 1 - Soma 1 ");
		System.out.print("Digite o 1º número: ");
		x = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		y = sc.nextInt();
		int r = x + y;
		System.out.println("A soma destes números é: " + r);
		System.out.println("----------");
		
		int a, b;		
		System.out.println("Soma 2");
		System.out.print("Digite o 1º número: ");
		a = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		b = sc.nextInt();
		int s = a + b;
		System.out.println("A soma destes números é: " + s);
		System.out.println("----------");
		
		System.out.println("Exercício 2 - Faça um programa para ler o valor de um circulo, "
				+ "e depois mostrar o valor da area com casas decimais");
		System.out.println("Atividade 1");
		double c;
		System.out.print("Digite um número: ");
		c = sc.nextDouble();
		double rr = (c * c) * 3.14159;
		System.out.printf("A area deste raio será de: %.4f\n", rr);
		System.out.println("----------");

		System.out.println("Atividade 2");
		double d;
		System.out.print("Digite um número (com virgula): ");
		d = sc.nextDouble();
		double rrs = (d * d) * 3.14159;
		System.out.printf("A area deste raio será de: %.4f\n", rrs);
		System.out.println("----------");
		
		System.out.println("Atividade 3");
		double e;
		System.out.print("Digite um número (com virgula): ");
		e = sc.nextDouble();
		double rrss = (e * e) * 3.14159;
		System.out.printf("A area deste raio será de: %.4f\n", rrss);
		System.out.println("----------");
		
		System.out.println("Exercicio 3 - Fazer um programa para ler quatro valores inteiros F, G, H, I. \n "
				+ "A seguir, calcule e mostre de F e G pelo produto de H e I segundo a formula  \n"
				+ "DIFERENÇA = (F*G - H*I)");
		System.out.println();
		
		int f, g, h, i;
		System.out.println("Digite 4 números: ");
		f = sc.nextInt();
		g = sc.nextInt();
		h = sc.nextInt();
		i = sc.nextInt();
		
		int aa = (f*g) - (h*i);
		System.out.println("O resultado da expressão é: " + aa);
		System.out.println("----------");
		
		System.out.println("Exercicio 4 - Fazer um programa que leia o número de um funcionário, \n"
				+ "seu número de horas trabalhadas e valor que recebe por hora e \n"
				+ "calcula o salário desse funcionário. A seguir, mostre o número do funcionário, \n"
				+ "com duas casas decimais.");
		
		int j, k;
		double l;
		System.out.print("Qual é o número da ficha do funcionário: ");
		j = sc.nextInt(); 
		System.out.print("Qual o salário do funcionário: ");
		k = sc.nextInt();
		System.out.print("Quantas horas trabalhadas: ");
		l = sc.nextDouble();
		
		double as = k * l;
		System.out.println("Number: " + j);
		System.out.printf("Salário R$: %.2f\n ", as);
		System.out.println("----------");
		
		System.out.println("Exercicio 5 - Fazer um programa para ler o código de uma peça 1, \n"
				+ "o numero de peças 1, o valor unitário de cada peça 1, \n"
				+ "o codigo de uma peça 2 e o valor unitário de cada peça 2. \n"
				+ "Calcule e ostre o valor a ser pago.");
		
		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		System.out.println("----------");
		
		System.out.println("Exercicio 6 - Fazer um programa que leia três valores com ponto \n"
				+ "fluatuante de dupla precisão: M, N e O. Em seguida, calcule e mostre: \n"
				+ "a) a area do triagulo retângulo que tem M por base e O por altura. \n"
				+ "b) a area do circulo de raio O. (pi= 3.14159). \n"
				+ "c) a área do trapezio que tem M e N por bases e O por altura. \n"
				+ "d) a área do quadrado que tem por lados N. \n"
				+ "e) a área do retângulo que tem lados M e N. ");
		
		double M, N, O;
		System.out.println("Digite três valores para serem calculados: ");
		double m = sc.nextDouble();
		double n = sc.nextDouble();
		double o = sc.nextDouble();
		
		double tri = (m * o) / 2;
		double cir= (o * o) * 3.14159;
		double tra = ((m + n) * o) / 2;
		double qua = n * n;
		double ret = m * n;
		
		System.out.printf("A area do triagulo retângulo é:  %.2f\n ", tri);
		System.out.printf("A area do circulo com raio de "+ o  + " é de: %.2f\n ", cir);
		System.out.printf("A área do trapezio é de: %.2f\n ", tra);
		System.out.printf("A  área do quadrado é de: %.2f\n ", qua);
		System.out.printf("A  área do retângulo é de: %.2f\n ", ret);
		
		sc.close();
	}
}
