package flujodedatosejercicios02;

import java.util.Scanner;

public class EjercicioExtra4App {

	public static void main(String[] args) {

		// Creamos un scanner para saber la palabra
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra para contar las vocales: ");
		String palabra = sc.nextLine();
		palabra = palabra.toLowerCase();
		// Lo convertimos a minúsculas para que no haya problemas con las mayúsculas

		int contador = 0;
		// Creamos un contador para saber cuántas vocales hay

		// for (inicialización, condición, incremento o decremento)
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			// Creamos una variable char para saber qué letra es
			// en la posición i de la palabra, que es una cadena de texto
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
					|| letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " vocales en la palabra " + palabra.toUpperCase());
		sc.close();
	}
}