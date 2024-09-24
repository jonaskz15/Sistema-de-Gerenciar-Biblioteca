package Classe;

import java.util.Random;
import java.util.Scanner;

import Interface.Mercado;

//CLASSE HERDA AS VARIAVEIS DE PESSOA
public class Vendedor extends Pessoa{
	private int codigoVendedor;
	
	public Vendedor(String nome, String senha, String Email) {
		super(nome, senha, Email);
	}
	
	public int getCodigoVendedor() {
		return codigoVendedor;
	}
	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	
	// MÉTODOS
	@Override
	public void consultaDados() {
		System.out.printf("Codigo: %-13s\n", this.getCodigoVendedor());
		System.out.printf("Nome: %-13s\n", this.getNome());
		System.out.printf("Email: %-13s\n", this.getEmail());
		System.out.printf("Senha: %-13s\n\n", this.getSenha());
	}
	
	//Cadastro de vendedores
	@Override
	public void setDados() {
		Scanner scanner = new Scanner(System.in);
		Random codvendedor = new Random();
		System.out.println("bem-vindo ao cadastro de vendedor\n");
		
		System.out.print("Digite o seu username: ");
		String nome = scanner.nextLine();
		for(int i = 0; i < Mercado.getvendedores().size(); i++) {
			while(Mercado.getvendedores().get(i).getNome().equals(nome)) {
				System.out.print("\nJa existe um usuario com este username, por favor digite outro: ");
				nome = scanner.nextLine();
			}
		}
		
		System.out.print("Digite o seu email: ");
		String email = scanner.nextLine();
		for(int i = 0; i < Mercado.getvendedores().size(); i++) {
			while(Mercado.getvendedores().get(i).getEmail().equals(email)) {
				System.out.print("\nJa existe um usuario com este email, por favor digite outro: ");
				email = scanner.nextLine();
			}
		}
		
		System.out.print("Digite sua senha: ");
		String senha  = scanner.nextLine();
		
		Vendedor vendedor = new Vendedor(nome, senha, email);
		int codigo = codvendedor.nextInt(100);
		vendedor.setCodigoVendedor(codigo);
		
		Mercado.getvendedores().add(vendedor);
		System.out.println("\nVendedor cadastrado com sucesso!\n");
	}
	
	//Editar dados do vendedor
	@Override
	public void editarDados(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu username para prosseguir:");
		String nome = scanner.nextLine();
		System.out.println("Digite sua senha para prosseguir:");
		String senha = scanner.nextLine();
		
		int position = 0;
		for(int i = 0; i < Mercado.getvendedores().size(); i++) {
			if(Mercado.getvendedores().get(i).getSenha().equals(senha) && Mercado.getvendedores().get(i).getNome().equals(nome)) {
				position = i;
				System.out.println("------Editar seus dados------");
				
				System.out.print("Digite o seu nome: ");
				String nomes = scanner.nextLine();
				
				System.out.print("Digite o seu email: ");
				String email = scanner.nextLine();
				
				System.out.print("Digite sua senha: ");
				String senhas  = scanner.nextLine();
				
				Mercado.getvendedores().get(position).setEmail(email);
				Mercado.getvendedores().get(position).setNome(nomes);
				Mercado.getvendedores().get(position).setSenha(senhas);
			} else {
				System.out.print("senha incorreta! Digite novamente \n");
				senha = scanner.nextLine();
			}
		}
	}
	//Retorna a posicao do vendedor na lista
	@Override
	public int posicao(String nome, String senha) {
		int aux = 0;
		for(int i = 0; i < Mercado.getvendedores().size(); i++) {
			if(Mercado.getvendedores().get(i).getSenha().equals(senha) && Mercado.getvendedores().get(i).getNome().equals(nome)) {
				aux = i;
			}
		}
		return aux;
	}
}
