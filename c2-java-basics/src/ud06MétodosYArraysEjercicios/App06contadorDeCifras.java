
package ud06MétodosYArraysEjercicios;

import javax.swing.JOptionPane;

public class App06contadorDeCifras {
	// Hecho por mi

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número positivo: "));
		// Se solicita al usuario que ingrese un número entero positivo mediante un
		// cuadro de diálogo.
		if (num < 0) {
			JOptionPane.showMessageDialog(null, "El número introducido no es positivo.");
			// Se verifica que el número ingresado sea positivo.

		} else {
			int cifras = NumeroDeCifras(num);
			JOptionPane.showMessageDialog(null, "El número de cifras de " + num + " es: " + cifras);
			// Se llama al método numeroDeCifras que convierte el número a una cadena
			// y devuelve la longitud de la cadena, que corresponde al número de
			// cifras.

		}
	}

	public static int NumeroDeCifras(int num) {
		return Integer.toString(num).length();
		// Convierte el número a una cadena y devuelve la longitud de la cadena, que
		// corresponde al número de cifras.

	}

}
