package br.com.victor.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Exercicio.ExercicioBean;
import br.com.victor.model.MetodoPagamento;

@FacesConverter("modeloPagamento")
public class modeloPagamentoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null){
			ExercicioBean exercicioBean = new ExercicioBean();
			for (MetodoPagamento metodoPagamento : exercicioBean.metodosPagamento) {
				if (value.toUpperCase().equals(metodoPagamento.getModeloPagamento())) {
					return metodoPagamento;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		if (value != null) {
			MetodoPagamento metodoPagamento = (MetodoPagamento) value;
			return metodoPagamento.getModeloPagamento();
		}
		
		return null;
	}

}
