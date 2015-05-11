package br.com.academiavit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_alunos")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "alu_id")
	private String codigo;

	@Column(name = "alu_nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "alu_cpf", length = 14, nullable = false)
	private String cpf;

}
