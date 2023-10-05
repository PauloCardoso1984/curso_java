package vetores;

import java.util.Scanner;

import entidades.Produtos;

public class VetorAula89 {

	public static void main(String[] args) {
		System.out.println("AULA 89 - VETORES - Faça um progrma para ler um número inteiro N \n"
				+ "e os dados (nome e preço)de N produtos. Armazene os N produtos em um vetor. \n"
				+ "Em seguida, mostrar o preço médio dos produtos.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe quantos produtos serão apreçados: ");
		int qtprodutos = sc.nextInt();
		Produtos[] vetor = new Produtos[qtprodutos]; // [] significa um vetor

		for (int i = 0; i < vetor.length; i++) {  // Pode usar assim ou o da linha de baixo
//		for (int i = 0; i < qtprodutos; i++) { // IRÁ PERCORRER TODAS AS POSIÇÕES DO VETOR
			sc.nextLine();
			System.out.print("Digite o produto: ");
			String produto = sc.nextLine();
			System.out.print("Digite o preço R$ ");
			double preco = sc.nextDouble();
			System.out.println();

			// Instanciar o produto
			vetor[i] = new Produtos(produto, preco);
		}
		
		double soma = 0;
		for (int i=0; i<qtprodutos; i++) {
			soma += vetor[i].getPreco();  // Irá buscar o preço de cada produto
		}
		double media = soma / qtprodutos;
		
		System.out.printf("A média dos valores é de R$ %.2f%n", media);

		sc.close();
	}
}
