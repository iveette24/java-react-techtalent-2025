package ud05FlujoDeDatosEjercicios;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		// JOptionPane.showInputDialog muestra
		// un cuadro de diálogo que pide al usuario
		// introducir el número de ventas. La entrada
		// del usuario se almacena como una cadena (String).
		String ventasstr = JOptionPane.showInputDialog("Introduce el número de ventas: ");
		int numVentas = Integer.parseInt(ventasstr); // Lo convierte en int

		// Se declara una variable sumaVentas de tipo double inicializada a 0.
		// Esta variable se usará para almacenar la suma total de las ventas.

		double sumaVentas = 0;

		// Se usa un bucle for para iterar desde 1 hasta numVentas (el número
		// de ventas introducido por el usuario).
		for (int i = 1; i <= numVentas; i++) {

			// Dentro del bucle, JOptionPane.showInputDialog solicita al usuario que
			// introduzca la cantidad de la venta actual.
			String ventaInput = JOptionPane.showInputDialog("Introduce la venta " + i + ": ");

			// Double.parseDouble(ventaInput) convierte la cadena de texto
			// introducida en un número double.
			double ventasdeldia = Double.parseDouble(ventaInput);

			// sumaVentas += ventasdeldia; agrega la venta actual a
			// la suma total de ventas. Que como se repite, se sumarán 
			//todas las ventas x veces (numVentas).
			sumaVentas += ventasdeldia;
		}

		// Mostrar la suma total de las ventas
		JOptionPane.showMessageDialog(null, "La suma total de las ventas es: " + sumaVentas);

	}
}