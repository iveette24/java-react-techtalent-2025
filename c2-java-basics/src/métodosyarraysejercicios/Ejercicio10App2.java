
package métodosyarraysejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio10App2 {

	// Método principal
	public static void main(String[] args) {
		// Pedir tamaño del array y los límites de los números primos
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array: "));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite inferior: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite superior: "));

		int[] array = new int[tamano];

		// Rellenar el array con números primos aleatorios
		for (int i = 0; i < tamano; i++) {
			array[i] = generarNumeroPrimo(min, max);
		}

		// Encontrar el mayor número del array
		int mayor = array[0];
		for (int i = 1; i < tamano; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}

		// Mostrar los números y el mayor número
		System.out.println("Números primos en el array:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		System.out.println("\nEl mayor número primo es: " + mayor);

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

	// Método para generar un número primo aleatorio dentro de un rango
	public static int generarNumeroPrimo(int min, int max) {
		Random rand = new Random();
		int num;
		do {
			num = rand.nextInt((max - min) + 1) + min;
		} while (!esPrimo(num));
		return num;
	}

}
