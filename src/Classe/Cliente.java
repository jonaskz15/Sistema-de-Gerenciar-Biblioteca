package Classe;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Interface.*;
//CLASSE HERDA AS VARIAVEIS DE PESSOA
public class Cliente extends Pessoa{
	private double saldo;
	private String cpf;

	//método que herda os dados da classe mãe
	public Cliente(String nome, String senha, String Email, double saldo, String cpf) {
		super(nome, senha, Email);
		this.setSaldo(saldo);
		this.setCpf(cpf);
	}

	// GETTERS E SETTERS

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// MÉTODOS
	
	//Consultar dados do cliente logado
	@Override
	public void consultaDados() {
		System.out.printf("CPF: %-13s\n", this.getCpf());
		System.out.printf("Nome: %-13s\n", this.getNome());
		System.out.printf("Email: %-13s\n", this.getEmail());
		System.out.printf("Saldo: %-13s\n", this.getSaldo());
		System.out.printf("Senha: %-13s\n\n", this.getSenha());
	}
	
	//Cadastrar novo cliente
	@Override
	public void setDados() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bem-vindo ao cadastro de cliente\n");
		
		System.out.print("Digite o seu cpf: ");
		String cpf = scanner.nextLine();
		for(int i = 0; i < Mercado.getclientes().size(); i++) {
			while(Mercado.getclientes().get(i).getCpf().equals(cpf)) {
				System.out.print("\nJa existe um usuario com este CPF, por favor digite outro: ");
				cpf = scanner.nextLine();
			}
		}
		
		System.out.print("Digite o seu username: ");
		String nome = scanner.nextLine();
		for(int i = 0; i < Mercado.getclientes().size(); i++) {
			while(Mercado.getclientes().get(i).getNome().equals(nome)) {
				System.out.print("\nJa existe um usuario com este username, por favor digite outro: ");
				nome = scanner.nextLine();
			}
		}
		
		System.out.print("Digite o seu email: ");
		String email = scanner.nextLine();
		for(int i = 0; i < Mercado.getclientes().size(); i++) {
			while(Mercado.getclientes().get(i).getEmail().equals(email)) {
				System.out.print("\nJa existe um usuario com este email, por favor digite outro: ");
				email = scanner.nextLine();
			}
		}
		
		System.out.print("Digite sua senha: ");
		String senha  = scanner.nextLine();
		
		System.out.print("Digite seu saldo: ");
		double saldo = scanner.nextDouble();
		
		Cliente cliente = new Cliente(nome, senha, email, saldo, cpf);
		Mercado.getclientes().add(cliente);
		System.out.println("\nCliente cadastrado com sucesso!\n");
	}
	
	//Editar dados do cliente logado
	@Override
	public void editarDados(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu username para prosseguir:");
		String nome = scanner.nextLine();
		System.out.println("Digite sua senha para prosseguir:");
		String senha = scanner.nextLine();
		int position = 0;
		for(int i = 0; i < Mercado.getclientes().size(); i++) {
			if(Mercado.getclientes().get(i).getSenha().equals(senha) && Mercado.getclientes().get(i).getNome().equals(nome)) {
				position = i;
				System.out.println("------Editar seus dados------");
				
				System.out.print("Digite o seu cpf: ");
				String cpf = scanner.nextLine();
				
				System.out.print("Digite o seu nome: ");
				String nomes = scanner.nextLine();
				
				System.out.print("Digite o seu email: ");
				String email = scanner.nextLine();
				
				System.out.print("Digite sua senha: ");
				String senhas  = scanner.nextLine();
				
				System.out.print("Digite a quantidade de saldo que deseja adicionar:");
				double saldo = scanner.nextDouble();
				double novo_saldo = Mercado.getclientes().get(position).getSaldo();
				Mercado.getclientes().get(position).setCpf(cpf);
				Mercado.getclientes().get(position).setEmail(email);
				Mercado.getclientes().get(position).setNome(nomes);
				Mercado.getclientes().get(position).setSaldo(novo_saldo+saldo);
				Mercado.getclientes().get(position).setSenha(senhas);
			} else {
				System.out.print("senha incorreta! Digite novamente \n");
				senha = scanner.nextLine();
			}
		}
	}
	
	//Retorna a posicao do cliente na lista
	@Override
	public int posicao(String nome, String senha) {
		int aux = 0;
		for(int i = 0; i < Mercado.getclientes().size(); i++) {
			if(Mercado.getclientes().get(i).getSenha().equals(senha) && Mercado.getclientes().get(i).getNome().equals(nome)) {
				aux = i;
			}
		}
		return aux;
	}
}
