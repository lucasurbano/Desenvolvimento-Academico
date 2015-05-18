package br.com.academiavit.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.academiavit.dao.AlunoDAO;
import br.com.academiavit.dao.MensalidadeDAO;
import br.com.academiavit.domain.Aluno;
import br.com.academiavit.domain.Mensalidade;

public class MensalidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {

		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno aluno = alunoDAO.buscarPorCodigo(1L);

		Mensalidade mensalidade = new Mensalidade();
		mensalidade.setDataVencimento(new Date());
		mensalidade.setDataPagamento(new Date());
		mensalidade.setValor(new BigDecimal(150.00D));

		mensalidade.setAluno(aluno);

		MensalidadeDAO mensalidadeDAO = new MensalidadeDAO();
		mensalidadeDAO.salvar(mensalidade);

	}

	@Test
	@Ignore
	public void listar() {
		MensalidadeDAO dao = new MensalidadeDAO();

		List<Mensalidade> mensalidades = dao.listar();

		System.out.println(mensalidades);

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		MensalidadeDAO dao = new MensalidadeDAO();
		Mensalidade mensalidade = dao.buscarPorCodigo(2L);

		System.out.println(mensalidade);

	}

	@Test
	@Ignore
	public void excluir() {
		MensalidadeDAO dao = new MensalidadeDAO();

		Mensalidade mensalidade = dao.buscarPorCodigo(3L);

		dao.excluir(mensalidade);
	}

	@Test
	@Ignore
	public void editar() {
		MensalidadeDAO dao = new MensalidadeDAO();

		Mensalidade mensalidade = dao.buscarPorCodigo(1L);

		dao.editar(mensalidade);
	}
}
