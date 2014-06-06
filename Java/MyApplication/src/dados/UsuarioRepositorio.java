package dados;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioRepositorio {
	private List<Usuario> bancoDeUsuario = new ArrayList<Usuario>();

	// int i;

	public void cadastrar(Usuario usuario) {
		// Processamento
		bancoDeUsuario.add(usuario);
		System.out.println("\tUsuario Cadastro :");
		System.out.println("\tNome: " + usuario.getnome());
		System.out.println("\tLogin: " + usuario.getlogin());
		System.out.println("\tIdade: " + usuario.getidade() + "\n");
	}

	public void listar() {
		if (bancoDeUsuario.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < bancoDeUsuario.size(); i++) {
				Usuario u = bancoDeUsuario.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + u.getnome());
				System.out.println("\tLogin: " + u.getlogin());
				System.out.println("\tIdade: " + u.getidade() + "\n");
			}
			System.out.println("\nFim da lista\n");
		}
	}

	public void remover(Usuario usuario) {
		// processamento
	}

}
