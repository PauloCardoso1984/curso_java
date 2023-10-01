package aula69;

import java.util.Scanner;

public class Aula69 {

	public static void main(String[] args) {
		
		System.out.println("Fazer um programa para ler os dados de um funcionário \n"
				+ "(nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário \n"
				+ "(nome e salário líquido). Em seguida, aumentar o salário do funcionário com \n "
				+ "base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) \n"
				+ "e mostrar novamente os dados do funcionário.Use a classe projetada abaixo");
		System.out.println();
		
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do funcionario: ");
		func.nome = sc.nextLine();
		
		System.out.print("Sálario do funcionario R$ ");
		func.salario = sc.nextDouble();
		
		System.out.print("Taxa R$ ");
		func.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário " + func);
		
		System.out.println();
		System.out.print("Valor de percentual a ser acrescentado: ");
		double porcentagem = sc.nextDouble();
		func.AumentoSalario(porcentagem);
		
		 System.out.println();
		System.out.println("Salario aumentado: " + func);
		
		sc.close();;
	}
}
