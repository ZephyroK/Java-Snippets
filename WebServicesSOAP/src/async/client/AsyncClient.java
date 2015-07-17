package async.client;

import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class AsyncClient {
	public static void main(String[] args) {
		AwesomeServiceWrappedDocumentService service = new AwesomeServiceWrappedDocumentService();
		
		AwesomeServiceWrappedDocument port = service.getAwesomeServiceWrappedDocumentPort();
		
		Response<Operation1Response> response = port.operation1Async("value", 1, 2);
		
		while(!response.isDone()) {
			System.out.println("esperando respuesta...");
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Operation1Response result = response.get();
			int resultFinal = result.getReturn();
			
			System.out.println("result: " + resultFinal);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("llamando async callback");
		port.operation1Async("value", 1, 3, new AsyncHandler<Operation1Response>() {
			
			@Override
			public void handleResponse(Response<Operation1Response> response) {
				try {
					Operation1Response responseCallback = response.get();
					int result = responseCallback.getReturn();
					System.out.println("callback result: " + result);
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		for(int i = 0; i<10;i++) {
			System.out.println("esperando callback");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
