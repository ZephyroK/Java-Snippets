package inheritance.service;

import javax.jws.WebMethod;

public class Base {
	@WebMethod(exclude=false)
	public void method1(String s) {
		
	}

	public String superMethod2(String s) {
		return "result superMethod2";
	}

	public String supertMethod3(String s, int i) {
		return "supertMethod3";
	}

}
