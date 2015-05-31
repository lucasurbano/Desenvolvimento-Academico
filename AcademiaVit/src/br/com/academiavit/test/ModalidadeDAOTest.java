package br.com.academiavit.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.academiavit.dao.AlunoDAO;
import br.com.academiavit.dao.FuncionarioDAO;
import br.com.academiavit.dao.ModalidadeDAO;
import br.com.academiavit.domain.Aluno;
import br.com.academiavit.domain.Funcionario;
import br.com.academiavit.domain.Modalidade;

public class ModalidadeDAOTest {
	@Test
		public void salvar() {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscarPorCodigo(1L);

		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno aluno = alunoDAO.buscarPorCodigo(2L);

		Modalidade modalidade = new Modalidade();
		modalidade.setNome("ana");
		modalidade.setValor(new BigDecimal(180.00D));
		modalidade.setHoraIncial(new Date());
		modalidade.setHoraFinal(new Date());

		modalidade.setFuncionario(funcionario);
		modalidade.setAluno(aluno);

		ModalidadeDAO modalidadeDAO = new ModalidadeDAO();
		modalidadeDAO.salvar(modalidade);

	}

	@Test
	@Ignore
	public void listar() {
		ModalidadeDAO dao = new ModalidadeDAO();

		List<Modalidade> modalidades = dao.listar();

		System.out.println(modalidades);

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		ModalidadeDAO dao = new ModalidadeDAO();
		Modalidade modalidade = dao.buscarPorCodigo(2L);

		System.out.println(modalidade);

	}

	@Test
	@Ignore
	public void excluir() {
		ModalidadeDAO dao = new ModalidadeDAO();

		Modalidade modalidade = dao.buscarPorCodigo(3L);

		dao.excluir(modalidade);
	}

	@Test
	@Ignore
	public void editar() {
		ModalidadeDAO dao = new ModalidadeDAO();

		Modalidade modalidade = dao.buscarPorCodigo(1L);

		dao.editar(modalidade);
	}
}
