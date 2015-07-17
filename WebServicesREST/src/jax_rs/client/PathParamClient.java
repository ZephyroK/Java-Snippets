package jax_rs.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class PathParamClient {
	public static void main(String[] args) throws Exception {
		String contextURL = "http://localhost:8080/myapp/";
		String resourcePath = "airportspath/";
		String requestPath = "nameByCode/";
		String paramPath = "1234454";
		
		String urlString = contextURL + resourcePath + requestPath + paramPath;
		URL url = new URL(urlString);
		
		InputStream result = (InputStream) url.getContent();
		BufferedReader reader = new BufferedReader(new InputStreamReader(result));
		
		System.out.println("Result: " + reader.readLine());
	}
}
