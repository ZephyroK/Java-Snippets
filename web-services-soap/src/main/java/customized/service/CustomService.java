package customized.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(portName="ArithmeticOperations", serviceName="ArithmeticService", name="Arithmetic")
public class CustomService {
	@WebMethod(operationName="add")
	@WebResult(name="id")
	public long addOperation(@WebParam(name="code") String code,
							 @WebParam(name="name") String name) {
		System.out.println("code: " + code);
		System.out.println("name: " + name);
		
		return 123;
	}
}
