package métodosyarraysejercicios;

import java.util.Scanner;

import java.util.ArrayList;

public class Ejercicio12App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar el tamaño del array
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = scanner.nextInt();

		// Solicitar el dígito final a buscar
		int digito;
		do {
			System.out.print("Introduce un dígito final (entre 0 y 9): ");
			digito = scanner.nextInt();
		} while (digito < 0 || digito > 9);

		// Crear el array de números aleatorios
		int[] numeros = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			numeros[i] = (int) (Math.random() * 300) + 1;
		}

		// Mostrar el array generado
		System.out.println("Array generado:");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println();

		// Filtrar los números que terminan en el dígito dado
		ArrayList<Integer> numerosFiltrados = new ArrayList<>();
		for (int numero : numeros) {
			if (numero % 10 == digito) {
				numerosFiltrados.add(numero);
			}
		}

		// Mostrar los números filtrados
		System.out.println("Números que terminan en " + digito + ":");
		for (int numero : numerosFiltrados) {
			System.out.print(numero + " ");
		}

		scanner.close();
	}
}
