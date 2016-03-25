package br.com.victor.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.victor.bean.AutoCompletePOJO;
import br.com.victor.model.Pais;

@FacesConverter("pais")
public class PaisConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null) {
			Integer codigo = null;

			try {
				codigo = Integer.valueOf(value);
			} catch (NumberFormatException e) {
			}
			for (Pais pais : AutoCompletePOJO.PAISES) {
				if (codigo.equals(pais.getCodigo())) {
					return pais;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null && !value.equals("")) {
			Pais pais = (Pais) value;
			return String.valueOf(pais.getCodigo());
		}
		return null;
	}

}
