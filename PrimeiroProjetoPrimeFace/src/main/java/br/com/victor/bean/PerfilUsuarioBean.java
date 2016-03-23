package br.com.victor.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilBean")
@ViewScoped
public class PerfilUsuarioBean implements Serializable{

	private static final long serialVersionUID = 7025522795735413154L;

	private String nome;
	private String sobre;
	
	public void atualizar(){
		System.out.println("Sobre: " + this.sobre);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}
	
	public List<String> completarTexto(String consulta){
		List<String> resultado = new ArrayList<String>();
		
		if(consulta.startsWith("Vic")){
			resultado.add("Victor Hugo");
			resultado.add("Victor Lima");
			resultado.add("Victor Gonçalves");
			resultado.add("Victor Rosa");
		}
		
		return resultado;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
	
	
}
