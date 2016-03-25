package br.com.victor.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class AutoComplete implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String pais;

	private List<String> paises = new ArrayList<>();

	public AutoComplete() {
		paises.add("Alemanha");
		paises.add("Argélia");
		paises.add("Argentina");
		paises.add("Belgica");
		paises.add("Brasil");
		paises.add("Bulgária");
		paises.add("Espanha");
		paises.add("Estados Unidos");
	}

	public void atualizar() {
		System.out.println("País: " + this.pais);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}

	public List<String> sugerirPaises(String consulta) {

		return paises.stream().filter(p -> p.toLowerCase().startsWith(consulta.toLowerCase()))
				.collect(Collectors.toList());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
