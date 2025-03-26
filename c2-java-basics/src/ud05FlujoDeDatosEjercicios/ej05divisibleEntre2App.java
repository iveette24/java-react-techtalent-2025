package ud05FlujoDeDatosEjercicios;

import java.util.Scanner;

public class ej05divisibleEntre2App {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		// Creo un scanner para el número

		System.out.println("Introduce un número: ");

		// Se guarda en texto automáticamente

		int n = numero.nextInt();

		// Miramos si es un número divisible entre 2
		if (n % 2 == 0) {
			System.out.println("El número " + n + " es divisible entre 2.");
		}

		else {
			System.out.println("El número " + n + " no es divisible entre 2.");
		}

		// Cerramos el scanner
		numero.close();

	}
}