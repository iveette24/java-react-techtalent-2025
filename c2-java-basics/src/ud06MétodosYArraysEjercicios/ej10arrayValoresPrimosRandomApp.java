// Paquete donde se encuentra el ejercicio
package ud06MétodosYArraysEjercicios;

// Importación de las librerías necesarias
import java.util.Random; // Para generar números aleatorios
import javax.swing.JOptionPane; // Para mostrar cuadros de diálogo al usuario

// Clase principal del programa
public class ej10arrayValoresPrimosRandomApp {
	public static void main(String[] args) {
		// Solicitar el tamaño del array al usuario
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tamaño del array: "));
		// Solicitar el rango máximo al usuario
		int max = Integer.parseInt(JOptionPane.showInputDialog("Escribe el rango máximo: "));
		// Solicitar el rango mínimo al usuario
		int min = Integer.parseInt(JOptionPane.showInputDialog("Escribe el rango mínimo: "));

		// Declarar y crear un array de enteros con la dimensión proporcionada por el
		// usuario
		int array[] = new int[dimension];

		// Llenar el array con números primos aleatorios
		rellenarArray(array, min, max);
		// Encontrar y mostrar el número mayor del array
		numeroMayor(array);
	}

	// Método para encontrar el número mayor dentro de un array
	public static void numeroMayor(int[] array) {
		// Inicializamos la variable mayor con el primer elemento del array
		int mayor = array[0];

		// Recorremos el array desde la segunda posición en adelante
		for (int i = 1; i < array.length; i++) {
			// Si encontramos un número mayor al actual, lo actualizamos
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		// Mostrar el número mayor encontrado
		System.out.println("\n\nEl número más grande es: " + mayor);
	}

	// Método para rellenar un array con números primos aleatorios dentro de un
	// rango
	public static void rellenarArray(int[] array, int min, int max) {
		// Recorremos cada posición del array
		for (int i = 0; i < array.length; i++) {
			// Generamos un número primo aleatorio y lo asignamos a la posición actual
			array[i] = generarNumeroPrimoAleatorio(min, max);
		}

		// Mostrar el contenido del array
		System.out.println("Números primos en el array:");
		for (int num : array) {
			// Imprimir cada número primo separado por un espacio
			System.out.print(num + " ");
		}
	}

	// Método para generar un número primo aleatorio dentro de un rango dado
	public static int generarNumeroPrimoAleatorio(int min, int max) {
		// Instancia de la clase Random para generar números aleatorios
		Random rand = new Random();
		int num; // Variable para almacenar el número aleatorio generado

		// Generar números aleatorios hasta que encontremos un primo
		do {
			// Generamos un número dentro del rango [min, max]
			num = rand.nextInt((max - min) + 1) + min;
		} while (!esPrimo(num)); // Repetimos si el número no es primo

		return num; // Retornar el número primo generado
	}

	// Método para verificar si un número es primo
	public static boolean esPrimo(int num) {
		// Los números menores o iguales a 1 no son primos
		if (num <= 1) {
			return false;
		}

		// Recorremos desde 2 hasta la raíz cuadrada del número para verificar si tiene
		// divisores
		for (int i = 2; i <= Math.sqrt(num); i++) {
			// Si encontramos un divisor exacto, no es primo
			if (num % i == 0) {
				return false;
			}
		}

		// Si no encontramos divisores, el número es primo
		return true;
	}
}