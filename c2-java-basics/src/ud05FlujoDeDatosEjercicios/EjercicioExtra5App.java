package ud05FlujoDeDatosEjercicios;

import java.util.Scanner;

public class EjercicioExtra5App {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 101);
		// Creamos un random del [0,100]

		System.out.println("El número random es: " + random);

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre 0 y 100: ");
		int num = sc.nextInt();

		// Mientras el número sea diferente, si es más pequeño se repetirá
		// el escaner y te dirá que el número que buscas es mayor, si es más
		// grande, hará lo contrario.

		while (num != random) {
			if (num < random) {

				System.out.println("Error, el número es más grande, vuelve a intentarlo.");
				System.out.println("Introduce un número entre 0 y 100: ");
				num = sc.nextInt();

			} else if (num > random) {
				System.out.println("Error, el número es más pequeño, vuelve a intentarlo.");
				System.out.println("Introduce un número entre 0 y 100: ");
				num = sc.nextInt();

			}

		}

		// Si el número puesto es correcto, directamente obviará el while
		// y imprimirá esto:

		System.out.println("Muy bien, el número es: " + random);

		sc.close();// Se cierra el scanner
	}
}