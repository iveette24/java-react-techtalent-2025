
package ud07ArrayListYHashMapEjercicios;

import javax.swing.JOptionPane;

public class App04combinacion2y3 {
	
	public static void main(String[] args) {
		String[] opciones = { "Administrador", "Usuario", "Salir" };
		int opcion = JOptionPane.showOptionDialog(null, "Selecciona el modo de acceso:", "Modo de acceso",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

//		switch (opcion) {
//		case 0 -> mostrarMenuStock(); // Modo Administrador (Gestión de Stock)
//		case 1 -> mostrarMenuCompras(); // Modo Usuario (Ventas)
//		case 2 -> System.exit(0); // Salir de la aplicación
//		}
	}
}