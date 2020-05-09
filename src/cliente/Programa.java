package cliente;

public class Programa {

	public static void main(String[] args) {
		Conversor conversor = new ConversorService().getConversorPort();
		
		System.out.println("Convertendo 34°C para Kelvin:");
		System.out.println(conversor.celciusToKelvin("34"));
		
		System.out.println("Convertendo 307°K para Celcius:");
		System.out.println(conversor.kelvinToCelcius("307"));

	}

}
