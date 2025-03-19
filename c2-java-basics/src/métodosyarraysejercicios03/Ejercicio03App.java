package métodosyarraysejercicios03;

import javax.swing.JOptionPane;

public class Ejercicio03App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
		boolean esPrimo = esPrimo(num);
		if (esPrimo) {
			JOptionPane.showMessageDialog(null, "El número " + num + " es primo.");
		} else {
			JOptionPane.showMessageDialog(null, "El número " + num + " no es primo.");
		}
	}

	public static boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
