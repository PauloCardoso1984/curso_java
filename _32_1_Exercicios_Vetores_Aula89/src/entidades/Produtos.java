package entidades;

public class Produtos {
	
	private String produto;
	private double preco;
	
	// CONSTRUTOR PADRÃO
	public Produtos() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Produtos(String produto, double preco) {
		this.produto = produto;
		this.preco = preco;
	}

	// GET e SETTERS
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
