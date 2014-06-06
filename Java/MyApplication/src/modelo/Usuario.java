package modelo;

public class Usuario {

	// Dados estruturais do cadastro usuario
	private String nome;
	private String login;
	private int idade;

	public void setnome(String nome) { // construtores gets e sets
		this.nome = nome;
	}

	public String getnome() {
		return this.nome;
	}

	public void setlogin(String login) {
		this.login = login;
	}

	public String getlogin() {
		return this.login;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public int getidade() {
		return this.idade;
	}

//	public void CadastrarUsuario() { // metodo cadastrar cliente
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Cadastrar Usuário");
//
//		entrada.next();
//	}

}