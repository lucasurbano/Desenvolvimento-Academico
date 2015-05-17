package br.com.academiavit.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.academiavit.dao.AlunoDAO;
import br.com.academiavit.domain.Aluno;

public class AlunoDAOTest {
	@Test
	@Ignore
	public void salvar() {

		Aluno a1 = new Aluno();
		a1.setNome("Lucas Urbano");

		a1.setCpf("999.999.999-99");
		a1.setEndereco("Rua Sebastiao da Rocha");
		a1.setBairro("Centro");
		a1.setCidade("Feira Nova");
		a1.setEstado("Pernambuco");
		a1.setTelefone("3645-1612");
		a1.setCelular("9874-1290");
		a1.setEmail("lucasurbano@hotmail.com.br");

		Aluno a2 = new Aluno();
		a2.setNome("Edna Maria");
		a2.setCpf("12345678910014");
		a2.setEndereco("Rua Ilha do Retiro");
		a2.setBairro("Vila do Ouro");
		a2.setCidade("Feira Nova");
		a2.setEstado("Pernambuco");
		a2.setTelefone("9478-2215");
		a2.setCelular("983232-6454");
		a2.setEmail("ednalove-jesus@hotmail.com");

		Aluno a3 = new Aluno();
		a3.setNome("Levi Urbano da Silva");
		a3.setCpf("10987654321");
		a3.setEndereco("Rua Santa Rosa");
		a3.setBairro("Centro");
		a3.setCidade("Feira Nova");
		a3.setEstado("Pernambuco");
		a3.setTelefone("3614-0114");
		a3.setCelular("3645-1612");
		a3.setEmail("leviurbano@hotmail.com");

		AlunoDAO dao = new AlunoDAO();
		dao.salvar(a1);
		dao.salvar(a2);
		dao.salvar(a3);
	}

	@Test
	@Ignore
	public void listar() {
		AlunoDAO dao = new AlunoDAO();

		List<Aluno> alunos = dao.listar();

		System.out.println(alunos);

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a1 = dao.buscarPorCodigo(1L);
		Aluno a2 = dao.buscarPorCodigo(3L);

		System.out.println(a1);
		System.out.println(a2);

	}

	@Test
	@Ignore
	public void excluir() {
		AlunoDAO dao = new AlunoDAO();

		Aluno aluno = dao.buscarPorCodigo(3L);

		dao.excluir(aluno);
	}

	@Test
	@Ignore
	public void editar() {
		AlunoDAO dao = new AlunoDAO();

		Aluno aluno = dao.buscarPorCodigo(1L);

		aluno.setCidade("Limoeiro");

		dao.editar(aluno);
	}
}
