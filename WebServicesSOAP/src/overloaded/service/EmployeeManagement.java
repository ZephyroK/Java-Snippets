package overloaded.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService
public class EmployeeManagement {
	@WebMethod(operationName="removeEmployeeByName")
	@RequestWrapper(className = "removeEmployeeByName")
	@ResponseWrapper(className = "removeEmployeeByNameResponse")   
	public boolean removeEmployee(String name) {
		System.out.println("removing employee " + name);
		return true;
	}
	
	@WebMethod(operationName="removeEmployeeById")
	@RequestWrapper(className = "removeEmployeeById")
	@ResponseWrapper(className = "removeEmployeeByIdResponse")  
	public boolean removeEmployee(long id) {
		System.out.println("removing employee id" + id);
		return true;
	}
}
