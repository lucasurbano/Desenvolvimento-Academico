package br.com.academiavit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.academiavit.domain.Mensalidade;
import br.com.academiavit.util.HibernateUtil;

public class MensalidadeDAO {
	public void salvar(Mensalidade mensalidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(mensalidade);
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
	public List<Mensalidade> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Mensalidade> mensalidades = null;

		try {
			Query consulta = sessao.getNamedQuery("Mensalidade.listar");
			mensalidades = consulta.list();
		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();
		}
		return mensalidades;
	}

	public Mensalidade buscarPorCodigo(Long codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Mensalidade mensalidade = null;

		try {
			Query consulta = sessao
					.getNamedQuery("Mensalidade.buscarPorCodigo");
			consulta.setLong("codigo", codigo);

			mensalidade = (Mensalidade) consulta.uniqueResult();
		} catch (RuntimeException ex) {

			throw ex;

		} finally {
			sessao.close();
		}
		return mensalidade;
	}

	// Excluir inicial - O usuario devera saber o codigo
	public void excluir(Mensalidade mensalidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.delete(mensalidade);
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

	public void editar(Mensalidade mensalidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();

			// Mensalidade mensalidadeEditar =
			// buscarPorCodigo(mensalidade.getCodigo());
			// mensalidadeEditar.setCidade(mensalidade.getCidade());
			// sessao.update(mensalidadeEditar);
			sessao.update(mensalidade);
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