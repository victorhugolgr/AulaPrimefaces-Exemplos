package br.com.victor.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="manyCheckbox")
@ViewScoped
public class PerfilUsuarioSelectManyCheckbox implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private List<String> interesses;
	
	public void atualizar(){
		interesses.forEach(i -> System.out.println("Interesse: " + i));
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getInteresses() {
		return interesses;
	}
	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}
	
	

	
}
