package weather.client;

public class Client {
	public static void main(String ...args) {
		Weather weatherService = new Weather();
		WeatherSoap port = weatherService.getWeatherSoap();
		
		WeatherReturn response = port.getCityWeatherByZIP("90210");
		
		System.out.println("WeatherID: " + response.getWeatherID());
		System.out.println("City: " + response.getCity());
		System.out.println("Description: " + response.getDescription());
		System.out.println("Pressure: " + response.getPressure());
		System.out.println("RelativeHumidity: " + response.getRelativeHumidity());
		System.out.println("Remarks: " + response.getRemarks());
		System.out.println("ResponseText" + response.getResponseText());
		System.out.println("State" + response.getState());
		System.out.println("Temperature: " + response.getTemperature());
		System.out.println("Visibility: " + response.getVisibility());
		System.out.println("WeatherStationCity: " + response.getWeatherStationCity());
		System.out.println("Wind: " + response.getWind());
		System.out.println("WindChill: " + response.getWindChill());
	}
}
