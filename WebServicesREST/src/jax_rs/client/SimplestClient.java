package jax_rs.client;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class SimplestClient {
static public void main( String[] args ) throws Exception {
		String contextURL = "http://localhost:8080/myapp";
		String resourcePath = "/myresource";
		String requestPath = "";
		String urlString = contextURL + resourcePath + requestPath;
		URL url = new URL( urlString );
		InputStream result = (InputStream) url.getContent();
		Scanner scanner = new Scanner( result );
		
		while(scanner.hasNext()) {
			System.out.println( "Result: " + scanner.next());
		}
		scanner.close();
	}
}
