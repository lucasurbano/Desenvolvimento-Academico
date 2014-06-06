package TelaCadastro;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import dados.UsuarioRepositorio;
import modelo.Usuario;
//import java.util.Scanner;
import negocio.UsuarioControlador;

//import modelo.Usuario;

/**
 //@author Lucas Urbano
 * 
 */
public class Application {

	
	static int opcao, op=1, numero;

	public static void main(String[] args) {

		System.out.println("Seja bem vindo ao Projeto Java II UNIDADE");
		System.out.println("Elaborado por Lucas Urbano");

		Scanner entrada = new Scanner(System.in);
		// menu principal
		do {
			UsuarioControlador.menu();

			opcao = entrada.nextInt();
			
			switch (opcao) {
			
			case 1:
								
				System.out.println("Informe os dados a ser Cadastro do usuario");
				System.out.println("Nome:");
				String nome = entrada.next();

				System.out.println("Login:");
				String login = entrada.next();

				System.out.println("Idade:");
				int idade = entrada.nextInt();

				Usuario user = new Usuario();
				user.setnome(nome);
				user.setlogin(login);
				user.setidade(idade);
				
				
				UsuarioControlador controlador = new UsuarioControlador();
				controlador.cadastrar(user);
				
				op = entrada.nextInt();  
								
				
				break;

			case 2:
//	           	UsuarioControlador.menu();
				UsuarioRepositorio imprimir = new UsuarioRepositorio();
				imprimir.listar();
//
//				UsuarioRepositorio imprimir = new UsuarioRepositorio();
//				imprimir.listar();
//				break;
			/*
			 * case 3: Usuario[x].excluirUsuario(); x++; break;
			 */
			case 0:
				System.out.println("Obrigado, será que passo da Disciplina ? ");
				System.out.println("Meu E-mail: lucasurbano@hotmail.com.br ");
				System.exit(0);
			default:
				System.out.println(" Comando desconhecido ");
			}

		} while (numero != 100);

		entrada.close();
		
	}
}