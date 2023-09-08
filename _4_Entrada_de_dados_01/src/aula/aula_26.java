package aula;

import java.util.Scanner;

public class aula_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Digite algum número: ");
		x = sc.nextInt();
		sc.nextLine();    // → para consumir uma quebra de linha pendente
		
					// nextLine - com quebra de linha
		String s1, s2, s3;
		System.out.println("Digite algo: ");
		s1 = sc.nextLine();
		System.out.println("Digite mais algo: ");
		s2 = sc.nextLine();
		System.out.println("Digite mais alguma coisa: ");
		s3 = sc.nextLine();
		
		System.out.println();
		
					// sem quebra de linha
		String s4, s5, s6;
		System.out.print("Digite algo: ");
		s4 = sc.nextLine();
		System.out.print("Digite mais algo: ");
		s5 = sc.nextLine();
		System.out.print("Digite mais alguma coisa: ");
		s6 = sc.nextLine();
		
					// impressão 
		
		System.out.println();
		System.out.println("Dados digitados com quebra de linha");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		
		System.out.println("Dados digitados sem quebra de linha ");
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		sc.close();
	}
}

