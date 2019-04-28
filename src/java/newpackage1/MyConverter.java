/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Marat
 */
@FacesConverter("intconv")
public class MyConverter implements Converter{

    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
       double a=0.0;
       try {
           a = Double.parseDouble(value);
       }
       catch (NumberFormatException ex){
           System.out.println("введите числовой формат");
       }
       return a;  
    }

    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        return value.toString();
    }
    
}
