package flujodedatosejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce el día de la semana: ");

		// Convertimos el texto con la primera en mayúscula para evitar problemas
		dia = dia.toLowerCase();

		switch (dia) {
		case "lunes":
			JOptionPane.showMessageDialog(null, "Hoy es Lunes, es un dia laboral.");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Hoy es Martes, es un dia laboral.");
			break;
		case "miércoles":
			JOptionPane.showMessageDialog(null, "Hoy es Miércoles, es un dia laboral.");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Hoy es Jueves, es un dia laboral.");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Hoy es Viernes, es un dia laboral.");
			break;
		case "sábado":
			JOptionPane.showMessageDialog(null, "Hoy es Sábado, es un dia laboral.");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "Hoy es Domingo, es un dia laboral.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Día no válido. Escríbelo de forma correcta, gracias.");

		}

	}

}
