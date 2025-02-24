package flujodedatosejercicios;

import java.util.Scanner;

public class EjercicioExtra1App {

	public static void main(String[] args) {

		// Se crea un scanner para leer los datos de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		double num = sc.nextDouble();
		// Lo almacenamos en una variable double porque el
		// usuario puede introducir un decimal
		sc.close();

		// Se crea una variable boolean true porque se asume
		// que el número es primo
		boolean esPrimo = true;

		// Creamos el primer if para comprobar si el número
		// es menor o igual a 1, ya que los números primos son mayores que 1
		if (num <= 1) {
			esPrimo = false;
		} else {

			// Creamos un bucle for para comprobar si el número es
			// divisible por cualquier número desde 2 hasta la raíz
			// cuadrada del número. Si es divisible por alguno de estos
			// números, se marca como no primo.
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		if (esPrimo) {
			System.out.println("El número " + num + " es primo.");
		} else {
			System.out.println("El número " + num + " no es primo.");

		}
	}
}