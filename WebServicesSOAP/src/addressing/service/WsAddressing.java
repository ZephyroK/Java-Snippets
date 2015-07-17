package addressing.service;

import javax.jws.WebService;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.soap.Addressing;

@WebService
@Addressing
public class WsAddressing {
	@Action(input="http://WsAddressing/importantTransactionRequestNew",
			output="http://WsAddressing/importantTransactionResponseNew")
	public String someOperation(String param1, int param2, int param3) {
		System.out.println("param1: " + param1 + ", param2: " + param2 + ", param3: " + param3);
		
		return "result from someOperation";
	}
	
	@Action(input="http://WsAddressing/anotherOperationRequestNew",
			output="http://WsAddressing/anotherOperationResponseNew",
			fault={@FaultAction(className=SomeOperationException.class, value="http://WsAddressing/somethingWentWrong")}
	)
	public String anotherOperation(int param1, int param2) throws SomeOperationException {
		System.out.println("param1: " + param1 + ", param2: " + param2);
		
		if(param1 == 0) {
			throw new SomeOperationException();
		}
			
		return "result from another operation";
	}
}
