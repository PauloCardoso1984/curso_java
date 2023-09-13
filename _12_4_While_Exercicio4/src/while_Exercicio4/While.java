package while_Exercicio4;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		System.out.println("Exercicio 4 - Um posto de combutiveis deseja determinar qual de seus \n"
				+ "produtos tem a preferencia de seus clientes. Esceva um algoritimo para ler o tipo \n"
				+ " de combustivel abastecido (codificando com 1 - Alcool, 2 - Gasolina, 3 - Diesel e 4 - Fim. \n"
				+ " Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um \n"
				+ " novo código até que seja válido). O programa será encerrado quando o código informado for o \n"
				+ "número 4. Deve ser escrito a mensagem. MUITO OBRIGADO e a quantidade de clientes que \n"
				+ " abasteceram cada tipo de combustível");
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int c;

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		System.out.println("Digite o combustivel abastecido: ");
		System.out.println("1 - Alcool.");
		System.out.println("2 - Gasolina.");
		System.out.println("3 - Diesel.");
		System.out.println("4 - Fim.");
		c = sc.nextInt();

		while (c != 4) {
			if (c == 1) {
				alcool += 1;
			} else if (c == 2) {
				gasolina += 1;
			} else if (c == 3) {
				diesel += 1;
			}
			c = sc.nextInt();
		}
		System.out.println("");
		System.out.println("MUITO OBRIGADO");
		System.out.println("Acool	: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel	: " + diesel);

		sc.close();
	}
}