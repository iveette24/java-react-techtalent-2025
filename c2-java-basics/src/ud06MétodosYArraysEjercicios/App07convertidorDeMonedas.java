
package ud06MétodosYArraysEjercicios;

import javax.swing.JOptionPane;

public class App07convertidorDeMonedas {

	public static void main(String[] args) {
		double euros = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la moneda en euros: "));
		String moneda = JOptionPane.showInputDialog("Introduce el cambio de moneda (libras, dólares o yenes): ");
		moneda = moneda.toLowerCase();

		switch (moneda) {
		case "libras":
			JOptionPane.showMessageDialog(null, "El valor de " + euros + " €, es " + libras(euros) + " libras.");
			break;

		case "dólares", "dolares":
			JOptionPane.showMessageDialog(null, "El valor de " + euros + " €, es " + dolares(euros) + " dólares.");
			break;

		case "yenes":
			JOptionPane.showMessageDialog(null, "El valor de " + euros + " €, es " + yenes(euros) + " yenes.");
			break;

		default:
			JOptionPane.showMessageDialog(null, "El valor introducido no es válido.");
		}

	}

	public static double libras(double euros) {
		return euros * 0.86;
	}

	public static double dolares(double euros) {
		return euros * 1.28611;
	}

	public static double yenes(double euros) {
		return euros * 129.852;
	}
}