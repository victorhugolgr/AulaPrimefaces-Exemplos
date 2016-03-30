package br.com.victor.model;

import java.util.ArrayList;
import java.util.List;

public class MetodoPagamento {

	private String modeloPagamento;

	private List<FormaPagamento> formasPagamento;
	
	public MetodoPagamento(String modeloPagamento) {
		setFormasPagamento(new ArrayList<>());
		this.modeloPagamento = modeloPagamento;
	}

	public MetodoPagamento adicionarFormaPamento(String formaPagamento){
		getFormasPagamento().add(new FormaPagamento(formaPagamento));
		return this;
	}
	
	public String getModeloPagamento() {
		return modeloPagamento;
	}

	public void setModeloPagamento(String modeloPagamento) {
		this.modeloPagamento = modeloPagamento;
	}

	public List<FormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

}
