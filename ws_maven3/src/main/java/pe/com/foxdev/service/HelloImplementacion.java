package pe.com.foxdev.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public class HelloImplementacion {
	@WebMethod
	public String saludar() {
		return "Hola visitante";
	}
}
