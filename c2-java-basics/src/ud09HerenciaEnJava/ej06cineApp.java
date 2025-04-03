package ud09HerenciaEnJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ej06cineApp {
	public static void main(String[] args) {

		ej06cine Pelicula = new ej06cine("Interstellar", 169, 12, "Christopher Nolan");
		Cine cine = new Cine(Pelicula, 10.0, 8, 9);

		List<Espectador> espectadores = new ArrayList<>();
		Random random = new Random();

		// Generar espectadores aleatorios
		String[] nombres = { "Ivette", "Carlos", "Ana" };
		for (String nombre : nombres) {
			espectadores.add(new Espectador(nombre, random.nextInt(50) + 5, random.nextDouble() * 20));
		}

		Scanner scanner = new Scanner(System.in);

		for (Espectador espectador : espectadores) {
			cine.ej06cine.mostrarDetalles();

			// Verificar si el espectador cumple los requisitos antes de preguntarle por el
			// asiento
			if (cine.puedeEntrar(espectador)) {
				cine.mostrarAsientos();
				System.out.println("\n" + espectador.nombre + " (Edad: " + espectador.edad + ", Dinero: "
						+ espectador.dinero + ") puede elegir un asiento.");
				System.out.print("Introduce la fila: ");
				int fila = scanner.nextInt();
				System.out.print("Introduce la columna (A-I): ");
				char columna = scanner.next().charAt(0);
				cine.sentarEspectador(espectador, fila, columna);
			} else {
				System.out.println(espectador.nombre + " no puede elegir asiento.\n");
			}
		}

		scanner.close();
	}
}
