package ud09HerenciaEnJava; // Define el paquete en el que se encuentra la clase

import javax.swing.JOptionPane; // Importa la librería para mostrar diálogos en ventanas emergentes

public class ej06asientos {
	private char[][] asientos; // Matriz que representa la sala de cine con los asientos

	// Constructor que inicializa la matriz de asientos
	public ej06asientos() {
		asientos = new char[8][9]; // Se crean 8 filas y 9 columnas
		inicializarAsientos(); // Se llama al método para llenar la matriz con asientos libres
	}

	// Método para inicializar los asientos como libres ('L')
	private void inicializarAsientos() {
		for (int i = 0; i < 8; i++) { // Recorre cada fila
			for (int j = 0; j < 9; j++) { // Recorre cada columna
				asientos[i][j] = 'L'; // 'L' indica que el asiento está libre
			}
		}
	}

	// Método para mostrar la sala de cine con los asientos y su estado
	public void mostrarSala() {
		StringBuilder salaVisual = new StringBuilder("Estado de la sala:\n"); // Usamos StringBuilder para construir la
																				// salida en formato texto

		for (int i = 0; i < 8; i++) { // Recorremos filas
			for (int j = 0; j < 9; j++) { // Recorremos columnas
				if (asientos[i][j] == 'R') {
					salaVisual.append("✖ "); // Si el asiento está reservado, se muestra una cruz
				} else {
					salaVisual.append((8 - i)).append(" ").append("ABCDEFGHI".charAt(j)).append(" "); // Se muestra el
																										// número de
																										// fila y la
																										// letra de
																										// columna
				}
			}
			salaVisual.append("\n"); // Salto de línea para que la representación de la sala se vea ordenada
		}

		JOptionPane.showMessageDialog(null, salaVisual.toString()); // Se muestra la representación de la sala en una
																	// ventana emergente
	}

	// Método para reservar un asiento en la sala de cine
	public boolean reservarAsiento(int fila, char columna) {
		int f = 8 - fila; // Convertimos el número de fila a índice de la matriz
		int c = "ABCDEFGHI".indexOf(columna); // Obtenemos la posición de la columna según su letra

		// Verificamos que la fila y columna sean válidas
		if (f < 0 || f >= 8 || c < 0 || c >= 9) {
			JOptionPane.showMessageDialog(null, "Ubicación inválida."); // Se muestra un mensaje si la ubicación no es
																		// válida
			return false;
		}

		// Si el asiento está libre, lo reservamos
		if (asientos[f][c] == 'L') {
			asientos[f][c] = 'R'; // Se marca el asiento como reservado ('R')
			JOptionPane.showMessageDialog(null, "Reserva realizada."); // Mensaje de confirmación
			return true;
		}

		// Si el asiento ya estaba reservado, informamos al usuario
		JOptionPane.showMessageDialog(null, "Ese asiento ya está ocupado.");
		return false;
	}
}