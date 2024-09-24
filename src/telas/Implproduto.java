package telas;

import Classe.Produto;

 public class ProdutoImpl implements Produto{
    private String marca;
	private Double preco;
	private int quantidade;

    public ProdutoImpl(String nome, Double preco, int quantidade){
         this.nome = nome;
         this.preco = preco;
         this.quantidade = quantidade;

    }

      @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int getQuantidade(){
        return quantidade;
    }
 }
