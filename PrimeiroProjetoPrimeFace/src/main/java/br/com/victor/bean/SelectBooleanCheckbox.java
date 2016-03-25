package br.com.victor.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class SelectBooleanCheckbox implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String aceito;

	public void atualizar() {
		System.out.println("Aceito: " + this.aceito);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAceito() {
		return aceito;
	}

	public void setAceito(String aceito) {
		this.aceito = aceito;
	}

}
