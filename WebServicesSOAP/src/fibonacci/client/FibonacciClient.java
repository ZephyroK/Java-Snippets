package fibonacci.client;

public class FibonacciClient {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		FibonacciService service = new FibonacciService();
		Fibonacci port = service.getFibonacciPort();
		
		try {
			int result = port.calculateFibonacci(10);
			System.out.println("Result: " + result);
		}
		catch (FibException_Exception e) {
			e.printStackTrace();
		}
	}
}
