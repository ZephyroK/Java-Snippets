package style.document.bare.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(parameterStyle=ParameterStyle.BARE, style=Style.DOCUMENT, use=Use.LITERAL)
public class AwesomeServiceBareDocument {
	
//	public int operation1(String param1, long param2, int param3) {
//		System.out.println("param1: " + param1);
//		System.out.println("param2: " + param2);
//		System.out.println("param3: " + param3);
//		
//		return 0;
//	}
//	
	/*
	public int operation1(String param1) {
		System.out.println("param1: " + param1);
		
		return 0;
	}
	*/
	
	public String operation2(AwesomeServiceBareDocumentBean bean) {
		System.out.println("bean: " + bean);
		return "operation2 result";
	}
	
}
