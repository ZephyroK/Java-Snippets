package style.document.bare.client;

public class AwesomeServiceBareDocumentClient {
	public static void main(String[] args) {
		AwesomeServiceBareDocumentService service = new AwesomeServiceBareDocumentService();
		AwesomeServiceBareDocument port = service.getAwesomeServiceBareDocumentPort();
		
		AwesomeServiceBareDocumentBean bean = new AwesomeServiceBareDocumentBean();
		bean.setParam1("value1");
		bean.setParam2(1);
		bean.setParam3(2);
		String result = port.operation2(bean);
		System.out.println("result: " + result);
	}
}
