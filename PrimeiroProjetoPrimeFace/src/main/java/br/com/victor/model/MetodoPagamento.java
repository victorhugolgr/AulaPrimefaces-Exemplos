package br.com.victor.model;

import java.util.ArrayList;
import java.util.List;

public class MetodoPagamento {

	private String metodoPagamento;

	private List<FormaPagamento> formasPagamento;
	
	public MetodoPagamento(String modeloPagamento) {
		setFormasPagamento(new ArrayList<>());
		this.metodoPagamento = modeloPagamento;
	}

	public MetodoPagamento adicionarFormaPamento(String formaPagamento){
		getFormasPagamento().add(new FormaPagamento(formaPagamento));
		return this;
	}
	
	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String modeloPagamento) {
		this.metodoPagamento = modeloPagamento;
	}

	public List<FormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

}
