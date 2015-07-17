package async.error.client;

import java.util.concurrent.ExecutionException;

import javax.xml.ws.Response;

public class AsyncErrorClient {
	public static void main(String[] args) {
		ExpectedErrorService service = new ExpectedErrorService();
		ExpectedError port = service.getExpectedErrorPort();
		
		try {
			port.division(5, 0);
		}
		catch (ZeroParameterException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Response<DivisionResponse> response = port.divisionAsync(10, 0);
		
		while(!response.isDone()) {
			System.out.println("esperando respuesta...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			DivisionResponse responseFinal = response.get();
			System.out.println(responseFinal.getReturn());
			
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
