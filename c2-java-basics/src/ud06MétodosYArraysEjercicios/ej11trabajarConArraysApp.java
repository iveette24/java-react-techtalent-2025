package ud06MétodosYArraysEjercicios; // Declaración del paquete donde se encuentra la clase. Esto organiza el código en un módulo lógico.

import java.util.Arrays; // Importación de la clase Arrays para facilitar la manipulación y visualización de arrays.
import javax.swing.JOptionPane; // Importación de JOptionPane para mostrar cuadros de diálogo.

public class ej11trabajarConArraysApp {

	public static void main(String[] args) {

		// Inicializamos variables
		// Solicita al usuario introducir la dimensión de los arrays y convierte el dato
		// de String a int.
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión de los arrays: "));
		int[] array1 = new int[dimension]; // Declaración y creación del array1 con tamaño "dimension".
		int[] array2 = new int[dimension]; // Declaración y creación del array2 con tamaño "dimension".
		int[] array3 = new int[dimension]; // Declaración y creación del array3 con tamaño "dimension".

		// Relacionamos el array 1 con el array 2
		// Llama al método randomArray1 para llenar array1 con valores aleatorios y
		// asigna su referencia a array2.
		array1 = randomArray1(array1);
		array2 = array1; // Ahora array2 apunta al mismo espacio en memoria que array1 (mismo contenido).

		// Imprimimos los valores de los arrays en el primer paso
		// Muestra los valores del array1 y array2. Son iguales porque comparten la
		// misma referencia.
		System.out.println("En el primer paso, los valores del Array 1 son: " + Arrays.toString(array1));
		System.out.println("En el primer paso, los valores del Array 2 son: " + Arrays.toString(array2) + "\n");

		// Reasignamos el array2 como random
		// Llama al método Array2Rand, que genera un nuevo array basado en los valores
		// de array2 multiplicados por valores aleatorios.
		array2 = Array2Rand(array2);

		// Imprimimos los valores de los arrays en el segundo paso
		// Ahora array1 y array2 tendrán valores diferentes porque se ha reasignado
		// array2.
		System.out.println("En el segundo paso, los valores del Array 1 son: " + Arrays.toString(array1));
		System.out.println("En el segundo paso, los valores del Array 2 son: " + Arrays.toString(array2) + "\n");

		// Reasignamos el array3 del método de la multiplicación
		// Llama al método multiplicacionArrays para calcular el producto entre
		// elementos de array1 y array2.
		array3 = multiplicacionArrays(array1, array2);

		// Imprimimos los valores de los arrays en el tercer paso
		// Se imprimen los valores de los tres arrays. array3 contiene los productos
		// correspondientes de array1 y array2.
		System.out.println("En el tercer paso, los valores del Array 1 son: " + Arrays.toString(array1));
		System.out.println("En el tercer paso, los valores del Array 2 son: " + Arrays.toString(array2));
		System.out.println("En el tercer paso, los valores del Array 3 son: " + Arrays.toString(array3));
	}

	// Método para generar un array con valores aleatorios entre 0 y 99.
	public static int[] randomArray1(int[] array1) {

		// Ciclo que asigna un número aleatorio a cada posición del array.
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100); // Genera un valor aleatorio entre 0 y 99.
		}
		return array1; // Retorna el array relleno.
	}

	// Método para generar un nuevo array basado en el array original multiplicado
	// por valores aleatorios.
	public static int[] Array2Rand(int[] array2) {
		int[] array2rand = new int[array2.length]; // Array donde se almacenarán los nuevos valores.
		int[] random = new int[array2.length]; // Array auxiliar que almacena números aleatorios entre 1 y 5.

		// Ciclo que llena el array random y calcula el valor resultante para cada
		// posición.
		for (int i = 0; i < array2.length; i++) {
			random[i] = (int) ((Math.random() * 5) + 1); // Genera números aleatorios entre 1 y 5.
			array2rand[i] = array2[i] * random[i]; // Multiplica el valor correspondiente de array2 por un número
													// aleatorio.
		}

		return array2rand; // Retorna el nuevo array.
	}

	// Método para multiplicar los valores de dos arrays y almacenar el resultado en
	// un nuevo array.
	public static int[] multiplicacionArrays(int[] array1, int[] array2) {

		// Crear un nuevo array para almacenar los productos.
		int[] array3 = new int[array1.length];

		// Ciclo que calcula el producto de cada posición de array1 y array2.
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i]; // Multiplica los valores correspondientes.
		}
		return array3; // Retorna el array resultante.
	}
}
