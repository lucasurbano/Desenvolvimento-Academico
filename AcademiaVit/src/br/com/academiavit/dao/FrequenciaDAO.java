package br.com.academiavit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.academiavit.domain.Modalidade;
import br.com.academiavit.util.HibernateUtil;

public class FrequenciaDAO {
	public void salvar(Modalidade modalidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(modalidade);
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
	public List<Modalidade> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Modalidade> modalidades = null;

		try {
			Query consulta = sessao.getNamedQuery("Modalidade.listar");
			modalidades = consulta.list();
		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();
		}
		return modalidades;
	}

	public Modalidade buscarPorCodigo(Long codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Modalidade modalidade = null;

		try {
			Query consulta = sessao
					.getNamedQuery("Modalidade.buscarPorCodigo");
			consulta.setLong("codigo", codigo);

			modalidade = (Modalidade) consulta.uniqueResult();
		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();
		}
		return modalidade;
	}

	// Excluir inicial - O usuario devera saber o codigo
	public void excluir(Modalidade modalidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.delete(modalidade);
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

	public void editar(Modalidade modalidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();

			// Modalidade modalidadeEditar =
			// buscarPorCodigo(modalidade.getCodigo());
			// modalidadeEditar.setCidade(modalidade.getCidade());
			// sessao.update(modalidadeEditar);
			sessao.update(modalidade);
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