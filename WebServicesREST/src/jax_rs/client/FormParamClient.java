package jax_rs.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class FormParamClient {
	public static void main(String[] args) throws Exception {
		String contextURL = "http://localhost:8080/myapp/";
		String resourcePath = "formairport/";
		String requestPath = "add/";
		
		String code = "GDL";
		String name = "Guadalajara";
		
		String urlString = contextURL + resourcePath + requestPath;
		URL url = new URL(urlString);
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setAllowUserInteraction(false);
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.connect();
		
		OutputStream os = (OutputStream) connection.getOutputStream();
		PrintWriter writer = new PrintWriter(os);
		writer.print("code=" + code + "&name=" + name);
		writer.close();
		
		InputStream result = connection.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(result));
		
		System.out.println("Result: " + reader.readLine());
	}
}
