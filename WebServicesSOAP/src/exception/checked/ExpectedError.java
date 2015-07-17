package exception.checked;

import javax.jws.WebService;

@WebService
public class ExpectedError {
	public double division(double x, double y) throws ZeroParameterException {
//		try {
//			Thread.sleep(5000);
//		}
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(y == 0) {
			throw new ZeroParameterException(y);
		}
		
		double result = x / y;
		
		return result;
	}
}
