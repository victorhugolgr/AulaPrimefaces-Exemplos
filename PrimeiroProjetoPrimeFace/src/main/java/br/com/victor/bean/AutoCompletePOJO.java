package br.com.victor.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.victor.model.Pais;

@ManagedBean
@ViewScoped
public class AutoCompletePOJO implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final List<Pais> PAISES = new ArrayList<>();

	static {
		PAISES.add(new Pais(1, "Alemanha"));
		PAISES.add(new Pais(2, "Argélia"));
		PAISES.add(new Pais(3, "Argentina"));
		PAISES.add(new Pais(4, "Belgica"));
		PAISES.add(new Pais(5, "Brasil"));
		PAISES.add(new Pais(6, "Bulgária"));
		PAISES.add(new Pais(7, "Espanha"));
		PAISES.add(new Pais(8, "Estados Unidos"));
	}

	private String nome;
	private Pais pais;

	public void atualizar() {
		if(this.pais == null){
			adicionarMensagem("Perfil atualizado sem pais.");
		}else{
			adicionarMensagem("Perfil atualizado com pais " + pais.getNome());
		}
	}
	
	private void adicionarMensagem(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
	}

	public List<Pais> sugerirPaises(String consulta) {
		return PAISES.stream().filter(p -> p.getNome().toLowerCase().startsWith(consulta.toLowerCase()))
				.collect(Collectors.toList());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static List<Pais> getPaises() {
		return PAISES;
	}

}
