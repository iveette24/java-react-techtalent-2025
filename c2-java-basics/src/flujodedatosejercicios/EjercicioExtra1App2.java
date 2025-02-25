package flujodedatosejercicios;

import java.util.Scanner;

public class EjercicioExtra1App2 {

	public static void main(String[] args) {

		// He repetido el ejercicio porque el
		// otro está hecho con el copilot

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = sc.nextInt();
		boolean primo = true;
		// Preestablecemos que es primo

		for (int i = 2; i < num; i++) {
			// probamos a dividirlo por todos los números
			// excluyendo el 1 y el número
			if (num % i == 0) {
				primo = false;
				break;
				// Si el residuo es 0, se vuelve primo
				// falso y se sale del programa.
			}
		}

		if (primo) {
			System.out.println("Es un número primo.");
		} else {
			System.out.println("No es un número primo.");
		}

		sc.close();
	}
}