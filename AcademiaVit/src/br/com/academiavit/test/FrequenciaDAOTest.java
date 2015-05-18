package br.com.academiavit.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.academiavit.dao.FuncionarioDAO;
import br.com.academiavit.domain.Funcionario;

public class FrequenciaDAOTest {
	@Test
	@Ignore
	public void salvar() {

		
	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO dao = new FuncionarioDAO();

		List<Funcionario> funcionarios = dao.listar();

		System.out.println(funcionarios);

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario f1 = dao.buscarPorCodigo(2L);
		// Funcionario f2 = dao.buscarPorCodigo(3L);

		System.out.println(f1);
		// System.out.println(f2);

	}

	@Test
	@Ignore
	public void excluir() {
		FuncionarioDAO dao = new FuncionarioDAO();

		Funcionario funcionario = dao.buscarPorCodigo(3L);

		dao.excluir(funcionario);
	}

	@Test
	@Ignore
	public void editar() {
		FuncionarioDAO dao = new FuncionarioDAO();

		Funcionario funcionario = dao.buscarPorCodigo(1L);

		funcionario.setCidade("Limoeiro");

		dao.editar(funcionario);
	}
}
