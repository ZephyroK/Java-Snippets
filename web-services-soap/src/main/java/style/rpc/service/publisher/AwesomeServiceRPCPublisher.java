package style.rpc.service.publisher;

import javax.xml.ws.Endpoint;
import style.rpc.service.AwesomeServiceRPC;

public class AwesomeServiceRPCPublisher {
	public static void main(String[] args) {
		//1st Argument, the publication URL
		//2nd Argument, the SIB instance
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:9876/rpc", new AwesomeServiceRPC());
	}
}
