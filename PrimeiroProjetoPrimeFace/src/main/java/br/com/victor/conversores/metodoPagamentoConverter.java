package br.com.victor.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.victor.model.MetodoPagamento;

@FacesConverter(forClass = MetodoPagamento.class)
public class metodoPagamentoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			System.out.println("Convertendo..");
			MetodoPagamento mp = (MetodoPagamento) component.getAttributes().get(value);
			System.out.println("Nulo?: " + mp == null);
			System.out.println(mp.getMetodoPagamento());
			return mp;
		}
		System.out.println("Conversor retornou nulo");
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		if (value instanceof MetodoPagamento) {
			MetodoPagamento metodoPagamento = (MetodoPagamento) value;
			if (metodoPagamento != null && metodoPagamento instanceof MetodoPagamento
					&& metodoPagamento.getFormasPagamento() != null) {
				component.getAttributes().put(metodoPagamento.getMetodoPagamento().toString(), metodoPagamento);
				return metodoPagamento.getMetodoPagamento().toString();
			}
		}
		return "";
	}

}
