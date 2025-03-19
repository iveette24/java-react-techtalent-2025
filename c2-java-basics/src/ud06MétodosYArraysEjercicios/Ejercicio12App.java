package ud06MétodosYArraysEjercicios; // Declaración del paquete donde se encuentra la clase.

import java.util.Arrays; // Importación de la clase Arrays para manejar arrays fácilmente.
import javax.swing.JOptionPane; // Importación de JOptionPane para mostrar cuadros de diálogo.

public class Ejercicio12App {

	public static void main(String[] args) {

		// Pedimos al usuario la dimensión del array a través de un cuadro de diálogo y
		// convertimos la entrada en un número entero.
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión del array: "));

		// Creamos un array de enteros con la dimensión indicada por el usuario.
		int[] array1 = new int[dimension];

		// Mostramos el array generado con números aleatorios (usando el método
		// randomArray1) como una cadena legible.
		System.out.println("El array creado random es: " + Arrays.toString(randomArray1(array1)));

		// Pedimos al usuario un dígito final específico para filtrar números del array.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el último valor que quieres: "));

		// Mostramos el nuevo array que contiene solo los números terminados en el
		// dígito especificado.
		System.out.println("El nuevo array creado con el valor final " + numero + " es: "
				+ Arrays.toString(comparador(array1, numero)));
	}

	// Método que genera un array con números aleatorios entre 1 y 300.
	public static int[] randomArray1(int[] array1) {

		// Validamos si la longitud del array es menor o igual a 0, mostrando un mensaje
		// de error en caso negativo.
		if (array1.length <= 0) {
			JOptionPane.showMessageDialog(null, "La dimensión del array no es válida.");
		} else {
			// Rellenamos el array con números aleatorios entre 1 y 300.
			for (int i = 0; i < array1.length; i++) {
				array1[i] = (int) (Math.random() * 300) + 1; // Números aleatorios en el rango 1-300.
			}
		}
		return array1; // Retornamos el array generado.
	}

	// Método que filtra los números de un array que terminan en un dígito
	// específico.
	public static int[] comparador(int[] array1, int numero) {

		// Contamos cuántos números terminan en el dígito especificado.
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 10 == numero) { // Comprobamos si el último dígito coincide con el número proporcionado.
				count++; // Incrementamos el contador de coincidencias.
			}
		}

		// Creamos un nuevo array para almacenar los números que cumplen la condición.
		int[] arrayFinal = new int[count];
		int posicionNuevoArray = 0; // Índice para recorrer el nuevo array.

		// Rellenamos el nuevo array con los números que terminan en el dígito
		// especificado.
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 10 == numero) {
				arrayFinal[posicionNuevoArray++] = array1[i];
				// Almacenamos el número en el nuevo array y avanzamos a la siguiente posición
				// disponible.
			}
		}

		// Si no se encontró ningún número que cumpla con la condición, mostramos un
		// mensaje informativo.
		if (count == 0) {
			System.out.println("No hay ningún número con el valor " + numero);
		}

		return arrayFinal; // Retornamos el array que contiene los números filtrados.
	}
}
