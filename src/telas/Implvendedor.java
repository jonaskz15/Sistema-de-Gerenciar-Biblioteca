package telas;

import Classe.Vendedor;

public class VendedorImpl implements Vendedor {
    private String nome;
    private String email;
    private String senha;

    public VendedorImpl(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha= senha;
    }

      @Override
    public void vender(Produto produto, Cliente cliente) {
        System.out.println("O vendedor " + nome + " vendeu o produto " + produto.getNome() + " para o cliente " + cliente.getNome());
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEmail() {
        return email;
    }
}