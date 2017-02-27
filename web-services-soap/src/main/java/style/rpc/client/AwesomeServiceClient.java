package style.rpc.client;

public class AwesomeServiceClient {
	public static void main(String[] args) {
		AwesomeServiceRPCService service = new AwesomeServiceRPCService();
		AwesomeServiceRPC port = service.getAwesomeServiceRPCPort();
		
		int result = port.operation1("value", 1, 2);
		System.out.println("result : " + result);
		
		StringArray stringArray = new StringArray();
		stringArray.getItem().add("value1");
		stringArray.getItem().add("value2");
		stringArray.getItem().add("value3");
		port.operation2(stringArray, "value4");
	}
}
