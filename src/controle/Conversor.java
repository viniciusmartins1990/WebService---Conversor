package controle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.ParseConversionEvent;

@WebService
public class Conversor {
	
	@WebMethod
	public String celciusToKelvin(@WebParam(name="grau") String grau) {
		return Integer.parseInt(grau) + 273 + "°K";
	}
	
	@WebMethod
	public String kelvinToCelcius(@WebParam(name="grau") String grau) {
		return Integer.parseInt(grau) - 273 + "°C";
	}
}
