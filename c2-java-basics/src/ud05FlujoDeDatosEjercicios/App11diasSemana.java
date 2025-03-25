package ud05FlujoDeDatosEjercicios;

import javax.swing.JOptionPane;

public class App11diasSemana {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce el día de la semana: ");

		// Convertimos el texto con la primera en mayúscula para evitar problemas
		dia = dia.toLowerCase();

		switch (dia) {
		case "lunes":
			JOptionPane.showMessageDialog(null, "Hoy es Lunes, es un día laboral.");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Hoy es Martes, es un día laboral.");
			break;
		case "miércoles":
			JOptionPane.showMessageDialog(null, "Hoy es Miércoles, es un día laboral.");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Hoy es Jueves, es un día laboral.");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Hoy es Viernes, es un día laboral.");
			break;
		case "sábado":
			JOptionPane.showMessageDialog(null, "Hoy es Sábado, es un día no laboral.");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "Hoy es Domingo, es un día no laboral.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Día no válido. Escríbelo de forma correcta, gracias.");

		}

	}

}
