package aula;

import java.util.Scanner;

public class aula_38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa para ler um valor inteiro de 1 a 7 representando \n"
				+ "um dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante.\n"
				+ " Escrever na tela o dia da semana correspondente, conforme exemplos");
		
		System.out.println();
		
		System.out.print("Digite um número (1 - 7) e veja qual é o dia da semana: ");
		String dia;
		int x;
		x = sc.nextInt();
		
		if (x == 1) {
			dia = "domingo";
		}
		else if (x == 2) {
			dia = "segunda-feira";
		}
		else if (x == 3) {
			dia = "terça feira";
		}
		else if (x == 4) {
			dia = "quarta-feira";
		}
		else if (x == 5) {
			dia = "quinta-feira";
		}
		else if (x == 6) {
			dia = "sexta-feira";
		}
		else if (x == 7) {
			dia = "sábado";
		}
		else {
			dia = "valor inválido";
		}
		System.out.println("");
		System.out.println("Resolvendo com IF e ELSE");
		System.out.println("Dia da semana: " + dia);
		
		System.out.println("");
		System.out.println("Outra maneira de resolver wuith-case:");
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quita-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sábado";
			break;
		default: {
			dia = "valor inválido";
			break;
	}
}
		System.out.println("Dia da semana é: " + dia);
		
		sc.close();
	}
}