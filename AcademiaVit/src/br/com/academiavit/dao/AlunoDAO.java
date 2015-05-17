package br.com.academiavit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.academiavit.domain.Aluno;
import br.com.academiavit.util.HibernateUtil;

public class AlunoDAO {
	public void salvar(Aluno aluno) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(aluno);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw ex;
		} finally {
			sessao.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Aluno> alunos = null;

		try {
			Query consulta = sessao.getNamedQuery("Aluno.listar");
			alunos = consulta.list();
		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();
		}
		return alunos;
	}

	public Aluno buscarPorCodigo(Long codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Aluno aluno = null;

		try {
			Query consulta = sessao.getNamedQuery("Aluno.buscarPorCodigo");
			consulta.setLong("codigo", codigo);

			aluno = (Aluno) consulta.uniqueResult();
		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();
		}
		return aluno;
	}

	// Excluir inicial - O usuario devera saber o codigo
	public void excluir(Aluno aluno) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.delete(aluno);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw ex;
		} finally {
			sessao.close();
		}
	}

	public void editar(Aluno aluno) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();

			// Aluno alunoEditar = buscarPorCodigo(aluno.getCodigo());
			// alunoEditar.setCidade(aluno.getCidade());
			// sessao.update(alunoEditar);
			sessao.update(aluno);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw ex;
		} finally {
			sessao.close();
		}
	}
}