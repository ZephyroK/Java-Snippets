package style.document.wrapped.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.soap.Addressing;

import com.sun.xml.ws.developer.SchemaValidation;

@WebService
//@SchemaValidation
public class AwesomeServiceWrappedDocument {
	public int operation1(String param1, long param2, int param3) {
		
		System.out.println("param1: " + param1);
		System.out.println("param2: " + param2);
		System.out.println("param3: " + param3);
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Returning response...");
		
		return 0;
	}
}
