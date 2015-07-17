package secure.client;

import javax.xml.ws.BindingProvider;

public class SecureServiceClient {
	
	public static void main(String[] args) {
		SecureService service = new SecureService();
		Secure port = service.getSecurePort();

		BindingProvider provider = (BindingProvider) port;
		provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "kelly");
		provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "123");
		
		String result = port.helloWorldRestricted("rafa");
		System.out.println("result: " + result);
	}
}











//BindingProvider provider = (BindingProvider) port;
//provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "kelly");
//provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "123");