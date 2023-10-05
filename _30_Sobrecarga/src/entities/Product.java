package entities;

public class Product {
	
	private String name; 
	private double price; 
	private int quantity;
	
	// CONSTRUTOR USA-SE A COLOCAR DEPOIS DOS ATRIBUTOS E ANTES DOS MÉTODOS 
	
	public Product(String name, double price, int quantity) {   // COSTRUTOR - obriga na iniciação do sistema
		this.name = name;   // this vai referenciar ao atributo (la em cima)
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {   // COSTRUTOR - obriga na iniciação do sistema
		this.name = name;   // this vai referenciar ao atributo (la em cima)
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice (Double price) {
		this.price = price;
	}
	
	public  int getQuantity() {
		return quantity;
	}
	
	// MÉTODOS
	
	public double totalValueInStock(){ 
		return price * quantity; 
		}
	public void addProducts(int quantity) { 
		this.quantity += quantity; 
		}
	public void removeProducts(int quantity) { 
		this.quantity -= quantity; 
		}
	public String toString() { 
		return name + ", R$ " 
				+ String.format("%.2f", price) + ", " 
				+ quantity + " units, Total: R$ " 
				+ String.format("%.2f", totalValueInStock()); 
	}
}
