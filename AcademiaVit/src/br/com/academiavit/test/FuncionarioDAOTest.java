package br.com.academiavit.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.academiavit.dao.FuncionarioDAO;
import br.com.academiavit.domain.Funcionario;

public class FuncionarioDAOTest {
	@Test
	public void salvar() {

		Funcionario f1 = new Funcionario();
		f1.setNome("Lucas Urbano");
		f1.setCpf("888.888.888-88");
		f1.setEndereco("Rua Sebastiao da Rocha");
		f1.setBairro("Centro");
		f1.setCidade("Feira Nova");
		f1.setEstado("Pernambuco");
		f1.setSenha("36451612");
		f1.setCelular("98741290");
		f1.setfuncao("Administrador");

		Funcionario f2 = new Funcionario();
		f2.setNome("Edna Maria");
		f2.setCpf("777.777.777-77");
		f2.setEndereco("Rua Ilha do Retiro");
		f2.setBairro("Vila do Ouro");
		f2.setCidade("Feira Nova");
		f2.setEstado("Pernambuco");
		f2.setSenha("94782215");
		f2.setCelular("9832326454");
		f2.setfuncao("Atendente");

		Funcionario f3 = new Funcionario();
		f3.setNome("Levi Urbano da Silva");
		f3.setCpf("666.666.666-66");
		f3.setEndereco("Rua Santa Rosa");
		f3.setBairro("Centro");
		f3.setCidade("Feira Nova");
		f3.setEstado("Pernambuco");
		f3.setSenha("3614-0114");
		f3.setCelular("3645-1612");
		f3.setfuncao("Instrutor");

		FuncionarioDAO dao = new FuncionarioDAO();
		dao.salvar(f1);
		dao.salvar(f2);
		dao.salvar(f3);
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
