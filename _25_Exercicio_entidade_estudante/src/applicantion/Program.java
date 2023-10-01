package applicantion;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		System.out.println("Fazer um programa para ler o nome de um aluno \n"
				+ "e as três notas que ele obteve nos três trimestres do ano \n"
				+ "(primeiro trimestre vale 30 e o segundo e terceiro valem \n"
				+ "35 cada). Ao final, mostrar qual a nota final do aluno no \n"
				+ "ano. Dizer também se o aluno está aprovado (PASS) ou não \n"
				+ "(FAILED) e, em caso negativo, quantos pontos faltam para o \n"
				+ "aluno obter o mínimo para ser aprovado (que é 60% da nota). \n"
				+ "Você deve criar uma classe Studentpara resolver este problema.");
		
		System.out.println();
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.print("Nome do aluno: ");
		aluno.name = sc.nextLine();
	
		System.out.println("Digite 3 notas: Sendo 1ª até 30.0 e 2ª e 3ª até 35.0");
		System.out.print("1ª nota: ");
		aluno.grade1 = sc.nextDouble();
		System.out.print("2ª nota: ");
		aluno.grade2 = sc.nextDouble();
		System.out.print("3ª nota: ");
		aluno.grade3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		if (aluno.notaFinal() < 60) {
			System.out.println("***REPROVADO***");
			System.out.printf("Faltaram " + aluno.notaRestante() + " pontos para aprovação.");
		}
		else {
			System.out.println("APROVADO - PARABÉNS !!!");
		}
		sc.close();
	}
}
