package overloaded.client;

public class EmployeeManagementClient {
	public static void main(String ...args) {
		EmployeeManagementService service = new EmployeeManagementService();
		EmployeeManagement port = service.getEmployeeManagementPort();
		
		boolean result = port.removeEmployeeById(10);
		
		System.out.println("result: " + result);
	}
}
