package Monedas;

import javax.swing.JOptionPane;

public class PesosMonedas {
	public void DolaresAPesos(double valor) {
		double dolar = valor * 4529.45;
		dolar = (double) Math.round(dolar *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolar+ " Pesos Colombianos");
	}
	
	public void EurosAPesos(double valor) {
		double euro = valor * 4924.65;
		euro = (double) Math.round(euro *100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +euro+ " Pesos Colombianos");
	}
	
	public void LibrasAPesos(double valor) {
		double libra = valor * 4890.52;
		libra = (double) Math.round(libra *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +libra+ " Pesos Colombianos");
	}
	
	public void YenAPesos(double valor) {
		double yen = valor * 29.68;
		yen = (double) Math.round(yen *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yen+ " Pesos Colombianos");
	}
	
	public void WonAPesos(double valor) {
		double won = valor * 3.04;
		won = (double) Math.round(won *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +won+ " Pesos Colombianos");
	}
	public void ADOGEAPesos(double valor) {
		double doge = valor * 0.0025;
		doge = (double) Math.round(doge *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +doge+ " Wons");
	}
}
