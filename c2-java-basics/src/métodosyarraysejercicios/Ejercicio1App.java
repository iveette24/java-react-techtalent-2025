package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		// Creado por mi

		boolean continuar = true;

		while (continuar) {

			String figura = JOptionPane.showInputDialog(
					"Introduce" + " el número de la figura: \n 1. Círculo \n " + "2. Triángulo \n 3. Cuadrado");

			switch (figura) {
			case "1":
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: "));
				JOptionPane.showMessageDialog(null, "El área del círculo es: " + circulo(radio));
				continuar = false;
				break;

			case "2":
				double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
				JOptionPane.showMessageDialog(null, "El área del triángulo es: " + triangulo(base, altura));
				continuar = false;
				break;

			case "3":
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado: "));
				JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + cuadrado(lado));
				continuar = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "El valor introducido no es válido");
			}
		}
	}

	public static double circulo(double radio) {
		return (Math.pow(radio, 2) * Math.PI);
	}

	public static double triangulo(double base, double altura) {
		return ((base * altura) / 2);
	}

	public static double cuadrado(double lado) {
		return (lado * lado);
	}

}