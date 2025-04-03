package ud08POOenJavaEjercicios;

import javax.swing.JOptionPane;

public class ej03electrodomesticoApp {
	public static void main(String[] args) {
		ej03electrodomestico color = new ej03electrodomestico();

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