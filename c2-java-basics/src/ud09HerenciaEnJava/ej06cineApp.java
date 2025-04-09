package ud09HerenciaEnJava;

import javax.swing.JOptionPane;

public class ej06cineApp {
	public static void main(String[] args) {
		// Crear la sala de cine y la película
		ej06asientos sala = new ej06asientos();
		ej06pelicula pelicula = new ej06pelicula("Interstellar", 169, 12, "Christopher Nolan", 8.5);

		// Crear los espectadores
		ej06espectador[] espectadores = { new ej06espectador("Ana", 15, 10), new ej06espectador("Luis", 10, 5),
				new ej06espectador("Carlos", 18, 20), new ej06espectador("Marta", 25, 50),
				new ej06espectador("Pedro", 12, 8) };

		// Mostrar la información de la película antes de empezar
		pelicula.mostrarInformacion();

		// Cada espectador tendrá su turno para elegir un asiento
		for (ej06espectador espectador : espectadores) {
			JOptionPane.showMessageDialog(null, "Turno de: " + espectador.getNombre() + " - Edad: "
					+ espectador.getEdad() + " -  Dinero: " + espectador.getDinero());

			// Mostrar la sala con los asientos ocupados antes de que el espectador elija
			sala.mostrarSala();

			// Verificar si el espectador cumple con la edad mínima y puede pagar la entrada
			if (espectador.cumpleEdadMinima(pelicula.getEdadMinima())
					&& espectador.puedePagarEntrada(pelicula.getPrecioEntrada())) {
				boolean asientoReservado = false;

				while (!asientoReservado) {
					// Pedir fila y columna al usuario
					int fila = Integer
							.parseInt(JOptionPane.showInputDialog("Fila (1-8) para " + espectador.getNombre() + ":"));
					char columna = JOptionPane.showInputDialog("Columna (A-I) para " + espectador.getNombre() + ":")
							.toUpperCase().charAt(0);

					// Intentar reservar el asiento
					if (sala.reservarAsiento(fila, columna)) {
						JOptionPane.showMessageDialog(null,
								espectador.getNombre() + " ha reservado el asiento " + fila + columna);
						asientoReservado = true;
					} else {
						JOptionPane.showMessageDialog(null, "El asiento está ocupado, intenta otro.");
					}
				}
			}
		}

		// Mostrar el estado final de la sala después de todas las reservas
		sala.mostrarSala();
	}
}