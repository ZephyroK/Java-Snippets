package oneway.client;

import style.document.bare.client.AwesomeServiceBareDocumentService;

public class OneWayClient {
	public static void main(String[] args) {
		OneWayServiceService service = new OneWayServiceService();
		OneWayService port = service.getOneWayServicePort();
		
		System.out.println("llamando servicio");
		port.noReturnOperation("1", "2");
		System.out.println("llamada completada");
		
		
	}
}
