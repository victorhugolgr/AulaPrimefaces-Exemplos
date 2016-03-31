package br.com.victor.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.victor.model.FormaPagamento;

@FacesConverter(forClass = FormaPagamento.class)
public class FormaPagamentoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			return (FormaPagamento) component.getAttributes().get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof FormaPagamento) {
			FormaPagamento formaPagamento = (FormaPagamento) value;
			if (formaPagamento != null && formaPagamento instanceof FormaPagamento
					&& formaPagamento.getFormaPagamento() != null) {
				component.getAttributes().put(formaPagamento.getFormaPagamento(), formaPagamento);
				return formaPagamento.getFormaPagamento();
			}
		}
		return "";
	}

}
