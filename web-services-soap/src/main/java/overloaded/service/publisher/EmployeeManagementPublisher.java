package overloaded.service.publisher;

import javax.xml.ws.Endpoint;

import overloaded.service.EmployeeManagement;

public class EmployeeManagementPublisher {
	public static void main(String ...args) {
		//1st Argument, the publication URL
		//2nd Argument, the SIB instance
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:4567/EmployeeManagement", new EmployeeManagement());
	}
}
