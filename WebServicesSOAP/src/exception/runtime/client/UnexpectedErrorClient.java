package exception.runtime.client;

public class UnexpectedErrorClient {
	public static void main(String[] args) {
		UnexpectedErrorService service = new UnexpectedErrorService();
		UnexpectedError port = service.getUnexpectedErrorPort();
		
		String result = port.operation("value", 1);
		System.out.println("result: " + result);
	}
}
