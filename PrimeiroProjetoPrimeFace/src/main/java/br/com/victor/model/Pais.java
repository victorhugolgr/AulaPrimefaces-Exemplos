package br.com.victor.model;

import java.io.Serializable;

public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private String nome;

	public Pais() {
	}

	public Pais(Integer codigo, String nome) {
		super();
		this.setCodigo(codigo);
		this.setNome(nome);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
