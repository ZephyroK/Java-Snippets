package oneway.service;

import javax.jws.Oneway;
import javax.jws.WebService;

@WebService
public class OneWayService {
	@Oneway
	public void noReturnOperation(String param1, String param2) {
		try {
			Thread.sleep(5000);
			System.out.println("noReturnOperation completed...");
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
