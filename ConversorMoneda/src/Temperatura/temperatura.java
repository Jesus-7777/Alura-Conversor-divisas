package Temperatura;

import javax.swing.JOptionPane;


public class temperatura {

	ConvertirTemperatura temperaturas = new ConvertirTemperatura();

	public void Convertir(double Minput) {

		String[] opciones = { "Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin",
				"Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit" };

		String eleccion = (String) JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura",
				JOptionPane.QUESTION_MESSAGE, null, opciones, null);

		switch (eleccion) {
		case "Grados Celcius a Grados Farenheit":
			temperaturas.CelciusAFarenheit(Minput);
			break;
		case "Grados Celcius a Kelvin":
			temperaturas.CelciusAKelvin(Minput);
			break;
		case "Grados Farenheit a Grados Celcius":
			temperaturas.FarenheitACelcius(Minput);
			break;
		case "Kelvin a Grados Celcius":
			temperaturas.KelvinACelcius(Minput);
			break;
		case "Kelvin a Grados Farenheit":
			temperaturas.KelvinAFarenheit(Minput);
			break;
		}
	}
}
