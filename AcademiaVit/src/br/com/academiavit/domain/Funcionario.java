package br.com.academiavit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fun_codigo", unique = true, nullable = false)
	private long codigo;

	@Column(name = "fun_nome", nullable = false)
	private long nome;

	@Column(name = "fun_cpf", length = 14, unique = true, nullable = false)
	private String cpf;

	@Column(name = "fun_endereco", length = 60, nullable = false)
	private String endereco;

	@Column(name = "fun_cidade", length = 20, nullable = false)
	private String cidade;

	@Column(name = "fun_bairro", length = 20, nullable = false)
	private String bairro;

	@Column(name = "fun_estado", length = 20, nullable = false)
	private String estado;

	@Column(name = "fun_telefone", length = 25, nullable = false)
	private String telefone;

	@Column(name = "fun_celular", length = 25, nullable = false)
	private String celular;

	@Column(name = "fun_email", length = 60, nullable = false)
	private String email;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public long getNome() {
		return nome;
	}

	public void setNome(long nome) {
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

}