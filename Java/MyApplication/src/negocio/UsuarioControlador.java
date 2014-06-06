package negocio;

import java.util.List;

import TelaCadastro.Application;
import dados.UsuarioRepositorio;
import modelo.Usuario;

public class UsuarioControlador {

	
	public static void menu (){
		System.out.println("=======================");
		System.out.println("Sistema de Cadastro");
		System.out.println("=======================");
		System.out.println("Digite o numero da op√ß√£o desejada:");
		System.out.println("1. Cadastro de usuario");
		System.out.println("2. Consulta");
		System.out.println("3. Excluir usuario");
		System.out.println("0. Sair do programa");
		System.out.println("Opcao:");
	}
	
	public void cadastrar(Usuario usuario) {
		
		
		if (usuario.getnome().length() < 5) {
			System.out.println("O nome deve conter no mÌnimo 5 caracteres");
		} else {
		}
		
		if (usuario.getlogin().length() < 5 || usuario.getlogin().length() > 10) {
			System.out.println("O login deve conter no mÌnimo 5 caracteres e no m·ximo 10");
		} else {
		}
		
		if (usuario.getnome().length() >= 5 && (usuario.getlogin().length() >= 5 || usuario.getlogin().length() <= 10)) {
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			repositorio.cadastrar(usuario);
			System.out.println("Digite 1 para continuar cadastrando usu√°rios ou 0 para listar !");
		}else{
			Application.main(null);
		}
		
	}

	/*public List<Usuario> listar(){
	UsuarioRepositorio repositorio = new UsuarioRepositorio();
	List<Usuario> listaDeUsuarios = repositorio.listar();
	
	return null;
	}
*/
	public void remover(Usuario usuario) {
		// processamento
	}

}
