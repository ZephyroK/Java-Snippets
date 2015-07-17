package exception.runtime;

import javax.jws.WebService;

@WebService
public class UnexpectedError {
	public String operation(String param1, int param2) {
		
		String value = null;
		int length = value.length();
		
		return "operation result";
	}
}
