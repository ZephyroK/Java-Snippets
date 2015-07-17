package style.rpc.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.sun.xml.ws.developer.SchemaValidation;

@WebService
@SOAPBinding(style = Style.RPC)
@SchemaValidation
public class AwesomeServiceRPC {
	public int operation1(String param1, long param2, int param3) {
		System.out.println("param1: " + param1);
		System.out.println("param2: " + param2);
		System.out.println("param3: " + param3);
		
		return 0;
	}
	
	public int operation2(String[] arrayParam, String param) {
		System.out.println("arrayParam: " + arrayParam);
		return 1;
	}
}
