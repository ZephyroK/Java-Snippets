package inheritance.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Child extends Base {
	@WebMethod(exclude=true)
	public void method1(String s) {
		
	}

	private String method2(String s) {
		return "result method2";
	}

	public int method3(int i1, int i2) {
		return 0;
	}
}
