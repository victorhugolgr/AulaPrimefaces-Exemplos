package br.com.victor.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioMenuDependenteAjax implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();

	private String nome;
	private String estado;
	private String cidade;

	public PerfilUsuarioMenuDependenteAjax() {
		estados.add("PA");
		estados.add("SP");
		estados.add("MG");
	}

	public void carregarCidades() {
		cidades.clear();

		if ("MG".equals(estado)) {
			cidades.add("Uberlandia");
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
		} else if ("SP".equals(estado)) {
			cidades.add("São Paulo");
			cidades.add("Franca");
			cidades.add("Ribeirão Preto");
		} else if ("PA".equals(estado)) {
			cidades.add("Marituba");
			cidades.add("Ananindeua");
			cidades.add("Belém");
		}

	}

	public void atualizar() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}
}
