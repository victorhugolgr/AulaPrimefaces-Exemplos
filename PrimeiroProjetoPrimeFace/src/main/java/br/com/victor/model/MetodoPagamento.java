package br.com.victor.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MetodoPagamento implements Serializable{

	private static final long serialVersionUID = 1L;

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

	@Override
	public String toString() {
		return "MetodoPagamento [metodoPagamento=" + metodoPagamento + ", formasPagamento=" + formasPagamento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formasPagamento == null) ? 0 : formasPagamento.hashCode());
		result = prime * result + ((metodoPagamento == null) ? 0 : metodoPagamento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MetodoPagamento other = (MetodoPagamento) obj;
		if (formasPagamento == null) {
			if (other.formasPagamento != null)
				return false;
		} else if (!formasPagamento.equals(other.formasPagamento))
			return false;
		if (metodoPagamento == null) {
			if (other.metodoPagamento != null)
				return false;
		} else if (!metodoPagamento.equals(other.metodoPagamento))
			return false;
		return true;
	}

}
