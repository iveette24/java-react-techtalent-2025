
package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número entero positivo: "));
		// Se solicita al usuario que ingrese un número entero positivo mediante un
		// cuadro de diálogo.

		if (num > 0) {
			int cifras = numeroDeCifras(num); // Se llama al método numeroDeCifras que convierte el número a una cadena
												// y devuelve la longitud de la cadena, que corresponde al número de
												// cifras.
			JOptionPane.showMessageDialog(null, "El número de cifras de " + num + " es: " + cifras);
		} else {
			JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
			// Se verifica que el número ingresado sea positivo.

		}
	}

	public static int numeroDeCifras(int num) {
		return Integer.toString(num).length();
		// Convierte el número a una cadena y devuelve la longitud de la cadena, que
		// corresponde al número de cifras.
	}
}
