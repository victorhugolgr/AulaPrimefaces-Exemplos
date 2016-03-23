package br.com.victor.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.victor.bean.PerfilUsuarioSelectOneListBoxBean;
import br.com.victor.model.Interesse;

@FacesConverter("interesse")
public class InteresseConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null){
			for(Interesse interesse : PerfilUsuarioSelectOneListBoxBean.INTERESSES){
				if(value.equals(interesse.getNomeIcone())){
					return interesse;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value != null){
			Interesse interesse = (Interesse) value;
			return interesse.getNomeIcone();
		}
		return null;
	}

}
