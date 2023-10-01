package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
/* 		Toda classe em Java é uma subclasse da classe Object.
		 * getClass: retorna o tipo do objeto;
		 * equals: compara se o objeto é igual a outro;
		 * hashCode: retorna im código hash do objeto;
		 * toString: converte o objeto para String
*/
		
		System.out.println("Fazer um progrma para ler os dados de um produto em estoque \n"
				+ "(nome, preço e quantidade). Em seguida: Mostrar os dados do produto \n"
				+ "(nome, preço, quantidade no estoque, valor no estoque). \n"
				+ "Realizar uma entrada no estoque e mostrar novamente os dados do produto. \n"
				+ "Realizar uma saída no estoque e mostrar novament os dados do produto");
		System.out.println();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();  // INSTANCIANDO O Product
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("");
		System.out.println("MANEIRA DENTRO DO PRINCIPAL");
/*		System.out.println("Produto: " + product.name 
							+ ", Preço: " + product.price 
							+ ", Quantidade: " + product.quantity 
							+ ", Valor Total R$ TV "
							+ product.totalValueInStock());
*/
		System.out.println("Product data: " + product);
		System.out.println("");
		
		System.out.println("DENTRO DA CLASSE");
		System.out.println(product);
		
		System.out.println("");
		System.out.print("Enter the number od produts to be added is stock; ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);
	
		System.out.println("");
		System.out.print("Enter the number od produts to be removed from stock; ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);

		sc.close();
	}
}

