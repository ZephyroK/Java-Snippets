package exception.checked.client;

public class ExpectedErrorClient {
	public static void main(String[] args) {
		ExpectedErrorService service = new ExpectedErrorService();
		ExpectedError port = service.getExpectedErrorPort();
		
		try {
			double result = port.division(8, 0);
			System.out.println("result: " + result);
		}
		catch (ZeroParameterException_Exception e) {
			e.printStackTrace();
		}
	}
}
