package weather.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE, use=Use.LITERAL)
public class WeatherWS {
	public String getWeather() {
		return "Sunny";
	}
	
	@WebMethod(operationName="getWeatherByCity")
	public String getWeather(@WebParam(name="city")String city) {
		return "Weather in " + city + " is sunny";
	}
}
