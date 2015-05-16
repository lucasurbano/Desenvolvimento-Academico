package br.com.academiavit.domain;

import java.math.BigDecimal;
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
@Table(name = "tbl_mensalidades")
public class Mensalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "men_codigo", unique = true, nullable = false)
	private long codigo;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "men_datavencimento", nullable = false)
	private Date dataVencimento;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "men_datapagamento", nullable = false)
	private Date dataPagamento;

	@Column(name = "men_valor", precision = 7, scale = 2, nullable = false)
	private BigDecimal valor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_alunos_alu_codigo", referencedColumnName = "alu_codigo", nullable = false)
	private Aluno aluno;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}