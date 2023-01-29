package Monedas;

import javax.swing.JOptionPane;

public class MonedasPesos {
	
	public void PesosADolares(double valor) {
		double dolar = valor / 4529.45;
		dolar = (double) Math.round(dolar *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolar+ " Dolares");
	}
	
	public void PesosAEuros(double valor) {
		double euro = valor / 4924.65;
		euro = (double) Math.round(euro *100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +euro+ " Euros");
	}
	
	public void PesosALibras(double valor) {
		double libra = valor / 5607.91;
		libra = (double) Math.round(libra *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +libra+ " Libras Esterlinas");
	}
	
	public void PesosAYen(double valor) {
		double yen = valor / 34.88;
		yen = (double) Math.round(yen *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yen+ " Yuanes");
	}
	
	public void PesosAWon(double valor) {
		double won = valor /3.68;
		won = (double) Math.round(won *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +won+ " Wons");
	}
	public void PesosADOGE(double valor) {
		double doge = valor / 0.0025;
		doge = (double) Math.round(doge *100)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +doge+ " Wons");
	}
	
}
