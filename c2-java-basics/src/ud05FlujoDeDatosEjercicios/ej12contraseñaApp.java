package ud05FlujoDeDatosEjercicios;

import javax.swing.JOptionPane;

public class ej12contraseñaApp {

	public static void main(String[] args) {
		// Definir la contraseña
		String contraseña = "IvetteLaMejor";

		// Variable para controlar los intentos
		int intentos = 3;

		// Bucle para pedir la contraseña
		while (intentos > 0) {
			// Pedir al usuario que introduzca la contraseña
			String cliente = JOptionPane.showInputDialog("Introduce la contraseña: ");

			// Comprobar si la contraseña es correcta
			if (cliente.equals(contraseña)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			} else {
				intentos--; // Disminuye un intento
				if (intentos > 0) {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Te quedan " + intentos + " intentos.");
				} else {
					JOptionPane.showMessageDialog(null, "Se acabaron los intentos. Acceso denegado.");
				}
			}
		}
	}

}