package weather.publisher;

import javax.xml.ws.Endpoint;
import weather.service.WeatherWS;

public class WeatherPublisher {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:6789/weather", new WeatherWS());
	}
}
