package br.com.victor.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Exercicio.ExercicioBean;
import br.com.victor.model.FormaPagamento;

@FacesConverter("formaPagamento")
public class FormaPagamentoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null){
			ExercicioBean exercicioBean = new ExercicioBean();
			for (FormaPagamento formaPagamento : exercicioBean.getMetodoPagamento().getFormasPagamento()) {
				if(value.equalsIgnoreCase(formaPagamento.getFormaPagamento())){
					return formaPagamento;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null){
			FormaPagamento formaPagamento = (FormaPagamento) value;
			return formaPagamento.getFormaPagamento();
		}
		return null;
	}

}
