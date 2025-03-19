
package métodosyarraysejercicios03;

import java.util.Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio09App {

	public static void main(String[] args) {
		// Hecho por mi

		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tamaño del array: "));
		int[] array = new int[tamaño];
		rellenarArray(array);
		muestraYSumaArray(array);
		// Solamente llamamos a los métodos después de definir las variables
	}

	public static void rellenarArray(int[] array) {
		Random rand = new Random();
		// Creamos un numero random
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(0, 9);
			// Rellenamos cada posición del array con un random
		}
		System.out.println("El primer array es: " + Arrays.toString(array) + "\n");
//Para imprimir el array hay que pasarlo a texto después de haber importado java.util.Arrays
	}

	public static void muestraYSumaArray(int[] array) {
		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor del carácter " + (i + 1) + " es: " + array[i]);
			// Mostramos todos los valores del array por separado
		}

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			// Hacemos la suma de todos los valores del array
		}
		System.out.println("\nLa suma de todos los valores del array es: " + suma);

	}
}