package aula_90;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Fazer um programa para ler um conjunto de N nomes de alunos, bem como as \n"
				+ "notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser \n"
				+ "armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando \n"
				+ "aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis). ");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		System.out.print("Quantos alunos serão inscritos? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite o nome do aluno: ", i+ 1);
			sc.nextLine();
			nomes[i] = sc.nextLine();			

			// PRIMEIRA NOTA
			System.out.printf("Digite primeira nota do %do aluno: ", i+ 1);
			double x = sc.nextDouble();
			while (x < 0 || x > 10) {
				System.out.print("ERRO - Nota TEM QUE ESTAR ENTRE 0 E 10 \n");
				System.out.println();
				System.out.printf("Digite primeira nota do %do aluno: ", i+ 1);
				x = sc.nextDouble();
				System.out.println();			
			}
			nota1[i] = x;
			
			// SEGUNDA NOTA						
			System.out.printf("Digite segunda nota do %do aluno: ", i+ 1);
			double y = sc.nextDouble();
			while (y < 0 || y > 10) {
				System.out.print("ERRO - Nota TEM QUE ESTAR ENTRE 0 E 10");
				System.out.println();
				System.out.printf("Digite segunda nota do %do aluno: ", i+ 1);
				y = sc.nextDouble();				
			}			
			nota2[i] = y;
			
			System.out.println();
		}
		
		// APROVADO ou REPROVADO
		for (int i=0; i<n; i++) {
			media = (nota1[i]+ nota2[i]) / 2;
						
			if (media >= 6.0) {
				System.out.println("Alunos APROVADO: ");
				System.out.printf("Aluno:	%s%n ", nomes[i]);
				System.out.printf("Média:	%.2f%n ", media);
			} else {
				System.out.println("Alunos REPROVADO");
				System.out.printf("Aluno:	%s%n ", nomes[i]);
				System.out.printf("Média:	%.2f%n ", media);
			}
			System.out.println();
		}
		sc.close();
	}
}