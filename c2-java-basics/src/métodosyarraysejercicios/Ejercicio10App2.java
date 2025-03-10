
package métodosyarraysejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio10App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// Solicitar tamaño del array al usuario
		System.out.print("Introduce el tamaño del array: ");
		int size = scanner.nextInt();

		System.out.print("Introduce el límite inferior del rango: ");
		int min = scanner.nextInt();

		System.out.print("Introduce el límite superior del rango: ");
		int max = scanner.nextInt();

		// Crear el array y llenarlo con números primos aleatorios
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			int randomPrime;
			do {
				randomPrime = random.nextInt(max - min + 1) + min;
			} while (!esPrimo(randomPrime));
			array[i] = randomPrime;
		}

		// Encontrar el mayor número en el array
		int maxNumber = array[0];
		for (int num : array) {
			if (num > maxNumber) {
				maxNumber = num;
			}
		}

		// Imprimir resultados
		System.out.print("Array de números primos generados: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("\nEl número mayor es: " + maxNumber);

		scanner.close();
	}

	// Método para comprobar si un número es primo
	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
