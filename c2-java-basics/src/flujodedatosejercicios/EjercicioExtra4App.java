package flujodedatosejercicios;

import java.util.Scanner;

public class EjercicioExtra4App {

	public static void main(String[] args) {
		// Comptador de vocals en una paraula
//Escriu un programa que demani una paraula i compti quantes vocals té (a, e, i, o, u).

		// Creamos un scanner para saber la palabra
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra para contar las vocales: ");
		String palabra = sc.nextLine();
		palabra = palabra.toLowerCase();
		// Lo convertimos a minúsculas para que no haya problemas con las mayúsculas
		sc.close();

		int contador = 0;
		// Creamos un contador para saber cuántas vocales hay
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			// Creamos una variable char para saber qué letra es
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
		}

	}
}