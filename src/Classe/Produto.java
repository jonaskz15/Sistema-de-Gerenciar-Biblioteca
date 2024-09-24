package Classe;

public class Produto {
	private String marca;
	private String nome;
	private int quantidade;
	private int codigoProduto;
	private double preco;
	
	public Produto(String nome, String marca, int quantidade, int codigoProduto, double preco) {
		this.setNome(nome);
		this.setMarca(marca);
		this.setQuantidade(quantidade);
		this.setCodigoProduto(codigoProduto);
		this.setPreco(preco);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
