package telas;
import Classe.Cliente;

public class ClienteImpl implements Cliente {
   private String nome;
   private String email;
   private String senha;
   private String cpf;
   private Double saldo;
   


   public ClienteImpl(String nome, String email, String senha, Double saldo, String cpf){
    this.nome=nome;
    this.email=email;
    this.senha=senha;
    this.cpf=cpf;
    this.saldo=saldo;

   }

   @Override
   public Void comprar(Produto produto){
    System.out.println("o cliente" + nome + "comprou o produto" + produto.getNome);
   }

   @Override
   public String getNome(){
    return nome;
   }

   @Override
   public String getEmail(){
    return email;
   }

   @Override
   public double getSaldo(){
    return saldo;
   }
}


