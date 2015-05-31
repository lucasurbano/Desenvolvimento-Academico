package br.com.academiavit.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.academiavit.dao.AlunoDAO;
import br.com.academiavit.domain.Aluno;
import br.com.academiavit.util.FacesUtil;

@ManagedBean
@ViewScoped
public class AlunoBean {
	private Aluno alunoCadastro;
	private List<Aluno> listaAlunos;
	private List<Aluno> listaAlunosFiltrados;

	public Aluno getAlunoCadastro() {
		if (alunoCadastro == null) {
			alunoCadastro = new Aluno();
		}
		return alunoCadastro;
	}

	public void setAlunoCadastro(Aluno alunoCadastro) {
		this.alunoCadastro = alunoCadastro;
	}

	// Lista Alunos
	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	// Lista Alunos Filtrados
	public List<Aluno> getListaAlunosFiltrados() {
		return listaAlunosFiltrados;
	}

	public void setListaAlunosFiltrados(List<Aluno> listaAlunosFiltrados) {
		this.listaAlunosFiltrados = listaAlunosFiltrados;
	}

	public void novo() {
		alunoCadastro = new Aluno();
	}

	public void salvar() {
		try {
			AlunoDAO alunoDAO = new AlunoDAO();
			alunoDAO.salvar(alunoCadastro);

			alunoCadastro = new Aluno();

			FacesUtil.adicionarMsgInfo("Aluno Salvo com sucesso");
		} catch (RuntimeException ex) {
			FacesUtil.adicionarMsgErro("Erro ao tentar incluir o aluno: "
					+ ex.getMessage());
		}
	}

	public void carregar() {
		try {
			AlunoDAO alunoDAO = new AlunoDAO();
			listaAlunos = alunoDAO.listar();
		} catch (RuntimeException ex) {
			FacesUtil.adicionarMsgErro("Erro ao tentar listar os alunos: "
					+ ex.getMessage());
		}
	}
}
