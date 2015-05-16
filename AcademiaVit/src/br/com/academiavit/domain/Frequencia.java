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
@Table(name = "tbl_frequencias")
public class Frequencia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fre_codigo", unique = true, nullable = false)
	private long codigo;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "fre_datapresenca", nullable = false)
	private Date dataPresenca;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_alunos_alu_codigo", referencedColumnName = "alu_codigo", nullable = false)
	private Aluno aluno;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Date getDataPresenca() {
		return dataPresenca;
	}

	public void setDataPresenca(Date dataPresenca) {
		this.dataPresenca = dataPresenca;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}