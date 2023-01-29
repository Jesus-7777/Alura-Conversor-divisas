package Monedas;

import javax.swing.JOptionPane;

public class escogerMonedas {
	MonedasPesos monedasPesos = new MonedasPesos();
	PesosMonedas pesosMonedas = new PesosMonedas();

	public void Convertir(double entrada) {

		String[] monedas = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won Coreano","De Pesos a Bitcoin", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
				"De Won Coreano a Pesos","De bitcion a pesos" };

		String elegida = (String) JOptionPane.showInputDialog(null, "Elige la moneda", "Monedas",
				JOptionPane.QUESTION_MESSAGE, null, monedas, null);
//		System.out.println(elegida);

		switch (elegida) {
		case "De Pesos a Dólar":
			monedasPesos.PesosADolares(entrada);
			break;
		case "De Pesos a Euro":
			monedasPesos.PesosAEuros(entrada);
			break;
		case "De Pesos a Libras":
			monedasPesos.PesosAEuros(entrada);
			break;
		case "De Pesos a Yen":
			monedasPesos.PesosAYen(entrada);
			break;
		case "De Pesos a Won Coreano":
			monedasPesos.PesosAWon(entrada);
			break;
		case "De Pesos a DOGE":
			monedasPesos.PesosADOGE(entrada);
			break;
		case "De Dólar a Pesos":
			pesosMonedas.DolaresAPesos(entrada);
			break;
		case "De Euro a Pesos":
			pesosMonedas.EurosAPesos(entrada);
			break;
		case "De Libras a Pesos":
			pesosMonedas.LibrasAPesos(entrada);
			break;
		case "De Yen a Pesos":
			pesosMonedas.YenAPesos(entrada);
			break;
		case "De Won Coreano a Pesos":
			pesosMonedas.WonAPesos(entrada);
			break;
		case "De DOGE a pesos":
			pesosMonedas.ADOGEAPesos(entrada);
			break;
		}
	}
}
