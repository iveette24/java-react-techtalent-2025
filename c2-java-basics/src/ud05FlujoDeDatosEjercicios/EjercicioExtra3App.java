package ud05FlujoDeDatosEjercicios;

import java.util.Scanner;

public class EjercicioExtra3App {

	public static void main(String[] args) {
		// Taula de multiplicar.
		// Escriu un programa que mostri la taula de multiplicar d'un número introduït
		// per teclat (del 1 al 10).

		// Se crea un scanner para leer los datos de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
		int num = sc.nextInt();
		// Lo almacenamos en una variable int porque el
		// usuario puede introducir un número entero
		sc.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}
}