package aula53;

import java.util.Scanner;

public class aula53 {

	public static void main(String[] args) {

		System.out.println("Exercico 2 - Leia um valor inteiro N. Este valor será a quantidade de \n "
				+ "valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X \n"
				+ "estão dentro do intervalo [10,20} e quantos estão fora do intervalo, \n"
				+ "mostrando essas informações.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vai desejar? ");
		int n = sc.nextInt();
		int em = 0;
		int fora = 0;
		
		System.out.println("Digite um número: ");
		for (int i=0; i<n; i++) {
			int b = sc.nextInt();
			if (b >= 10 && b <= 20) {
				em = em + 1; 
			}
			else {
				fora = fora + 1;
			}
		}
		System.out.println(em + " - Dentro do intervalo");
		System.out.println(fora + " - Fora do intervalo" );
		
		sc.close();
	}
}