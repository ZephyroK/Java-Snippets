package addressing.client;

import javax.xml.ws.soap.AddressingFeature;

public class AddressingClient {
	public static void main(String[] args) {
		WsAddressingService service = new WsAddressingService();
		
		WsAddressing port = service.getWsAddressingPort(new AddressingFeature(false, false));
		String result;
		try {
//			result = port.someOperation("param1", 1, 2);
			result = port.anotherOperation(1, 1);
			System.out.println("result: " + result);
		} 
		catch (SomeOperationException_Exception e) {
			e.printStackTrace();
		}
	}
}
