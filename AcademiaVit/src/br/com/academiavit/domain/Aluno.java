package br.com.academiavit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_alunos")
@NamedQueries({
		@NamedQuery(name = "Aluno.listar", query = "SELECT aluno FROM Aluno aluno"),
		@NamedQuery(name = "Aluno.buscarPorCodigo", query = "SELECT aluno FROM Aluno aluno WHERE aluno.codigo =:codigo ")

})
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "alu_codigo", unique = true, nullable = false)
	private Long codigo;

	@Column(name = "alu_nome", nullable = false)
	private String nome;

	@Column(name = "alu_cpf", length = 14, unique = true, nullable = false)
	private String cpf;

	@Column(name = "alu_endereco", length = 60)
	private String endereco;

	@Column(name = "alu_cidade", length = 20)
	private String cidade;

	@Column(name = "alu_bairro", length = 20)
	private String bairro;

	@Column(name = "alu_estado", length = 20)
	private String estado;

	@Column(name = "alu_telefone", length = 25)
	private String telefone;

	@Column(name = "alu_celular", length = 25)
	private String celular;

	@Column(name = "alu_email", length = 60)
	private String email;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf
				+ ", endereco=" + endereco + ", cidade=" + cidade + ", bairro="
				+ bairro + ", estado=" + estado + ", telefone=" + telefone
				+ ", celular=" + celular + ", email=" + email + "]";
	}

}