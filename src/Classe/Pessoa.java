package Classe;

//CLASSE QUE PASSA A HERANÇA PARA AS CLASSES CLIENTE E VENDEDOR
public abstract class Pessoa {
	private String nome;
	private String senha;
	private String Email;

	//Construtor da classe mãe
	public Pessoa(String nome, String senha, String Email) {
		this.setNome(nome);
		this.setSenha(senha);
		this.setEmail(Email);
	}
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	// MÉTODOS
	public abstract void consultaDados();
	public abstract void setDados();
	public abstract void editarDados();
	public abstract int posicao(String nome, String senha);
}
