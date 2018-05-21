package com.Puiu.Alex.Controller.Converters;

import com.Puiu.Alex.FinalObjects.ConstructedAnomalies;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by Loky on 09/04/2018.
 */
@FacesConverter("com.Puiu.Alex.Controller.Converters.ConstructedAnomaliesConverter")
public class ConstructedAnomaliesConverter implements Converter {


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return ConstructedAnomalies.valueOf(s);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return o.toString();
    }

}
