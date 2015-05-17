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
@Table(name = "tbl_funcionarios")
@NamedQueries({
		@NamedQuery(name = "Funcionario.listar", query = "SELECT funcionario FROM Funcionario funcionario"),
		@NamedQuery(name = "Funcionario.buscarPorCodigo", query = "SELECT funcionario FROM Funcionario funcionario WHERE funcionario.codigo =:codigo ")

})
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fun_codigo", unique = true, nullable = false)
	private Long codigo;

	@Column(name = "fun_nome", nullable = false)
	private String nome;

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

	@Column(name = "fun_senha", length = 25, nullable = false)
	private String senha;

	@Column(name = "fun_celular", length = 25, nullable = false)
	private String celular;

	@Column(name = "fun_funcao", length = 50, nullable = false)
	private String funcao;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getfuncao() {
		return funcao;
	}

	public void setfuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", cpf="
				+ cpf + ", endereco=" + endereco + ", cidade=" + cidade
				+ ", bairro=" + bairro + ", estado=" + estado + ", senha="
				+ senha + ", celular=" + celular + ", funcao=" + funcao + "]";
	}

}