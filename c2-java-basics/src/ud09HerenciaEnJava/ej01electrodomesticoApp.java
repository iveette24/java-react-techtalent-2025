package ud09HerenciaEnJava;

import javax.swing.JOptionPane;

public class ej01electrodomesticoApp {
	public static void main(String[] args) {
		ej01electrodomestico color = new ej01electrodomestico();

		color.escogerColor();
		System.out.println(color.getColor());
		System.out.println(color.getconsumoEnergetico());
		System.out.println(color.getpeso());
		System.out.println(color.getprecioBase());

		JOptionPane.showMessageDialog(null,
				"El color es: " + color.getColor() + "\nEl consumo es: " + color.getconsumoEnergetico()
						+ "\nEl peso es: " + color.getpeso() + " Kg" + "\nEl precio base es: " + color.getprecioBase()
						+ " €");

	}
}