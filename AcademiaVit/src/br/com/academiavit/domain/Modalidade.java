package br.com.academiavit.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_modalidades")
public class Modalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mod_codigo", unique = true, nullable = false)
	private long codigo;

	@Column(name = "mod_nome", nullable = false)
	private String nome;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "mod_horaincial", nullable = false)
	private Date horaIncial;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "mod_horafinal", nullable = false)
	private Date horaFinal;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_alunos_alu_codigo", referencedColumnName = "alu_codigo", nullable = false)
	private Aluno aluno;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_funcionarios_fun_codigo", referencedColumnName = "fun_codigo", nullable = false)
	private Funcionario funcionario;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getHoraIncial() {
		return horaIncial;
	}

	public void setHoraIncial(Date horaIncial) {
		this.horaIncial = horaIncial;
	}

	public Date getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}