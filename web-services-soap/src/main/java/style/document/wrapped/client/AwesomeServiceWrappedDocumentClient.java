package style.document.wrapped.client;

public class AwesomeServiceWrappedDocumentClient {
	public static void main(String[] args) {
		AwesomeServiceWrappedDocumentService service = new AwesomeServiceWrappedDocumentService();
		AwesomeServiceWrappedDocument port = service.getAwesomeServiceWrappedDocumentPort();
		System.out.println("llamando operacion");
		int result = port.operation1("value1", 1, 2);
		System.out.println("result: " + result);
	}
}
