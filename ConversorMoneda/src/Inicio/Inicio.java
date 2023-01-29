package Inicio;

import javax.swing.JOptionPane;

import Monedas.escogerMonedas;
import Temperatura.temperatura;




public class Inicio {
	public static void main(String[] args) {

		boolean control = true;
		escogerMonedas escogerMoneda= new escogerMonedas();
		temperatura elegirTemperatura =new temperatura();

		while (control == true) {
			String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };

			String eleccion = (String) JOptionPane.showInputDialog(null, "Elige una opcion ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, opciones, null);

			switch (eleccion) {
			case "Conversor de Moneda":
				 String entrada = JOptionPane.showInputDialog("Digite valor de la moneda a convertir ");
				 Double valorEntrada =Double.parseDouble(entrada);
				if (valorEntrada >=0.1) {
					escogerMoneda.Convertir(valorEntrada);
				}
				break;
			
			case "Conversor de Temperatura":
				entrada = JOptionPane.showInputDialog("Ingresa Temperatura ");
				Double valorTemperatura =Double.parseDouble(entrada);
				if (valorTemperatura >=0.1) {
					elegirTemperatura.Convertir(valorTemperatura);
					
				}
				break;
			}

		}

	}

	public static void validar(String valor) {
		System.out.println(valor);
	}
}
