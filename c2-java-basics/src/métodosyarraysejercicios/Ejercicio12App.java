package métodosyarraysejercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión del array: "));
		// Pedimos la dimensión del array
		int[] array1 = new int[dimension];
		// Creamos el array con la dimensión

		System.out.println("El array creado random es: " + Arrays.toString(randomArray1(array1)));
		// Mostramos el array creado por el random

		// Pedimos el último valor que se quiere mostrar
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el último valor que quieres: "));

		System.out.println("El nuevo array creado con el valor final " + numero + " es: "
				+ Arrays.toString(comparador(array1, numero)));
// Imprimimos el nuevo array que contiene todos los valores random pero que acaban con el número introducido

	}

	public static int[] randomArray1(int[] array1) {

		// Crear un método que haga que los arrays sean creados random
		if (array1.length <= 0) {
			JOptionPane.showMessageDialog(null, "La dimensión del array no es válida.");

		} else {

			for (int i = 0; i < array1.length; i++) {
				array1[i] = (int) (Math.random() * 300) + 1;
			}
		}
		return array1;
	}

	public static int[] comparador(int[] array1, int numero) {
		// Contar cuántos números terminan en el dígito especificado
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 10 == numero) {
				count++;
			}
		}

		// Crear un nuevo array para almacenar los números que terminan en el dígito
		// especificado
		int[] arrayFinal = new int[count];
		int posicionNuevoArray = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 10 == numero) {
				arrayFinal[posicionNuevoArray++] = array1[i];
				// Almacena el número en arrayFinal en la posición posicionNuevoArray y luego
				// incrementa posicionNuevoArray en 1 para la próxima posición disponible.
			}
		}

		// Imprimir un mensaje si no se encontraron números que terminan en el dígito
		// especificado
		if (count == 0) {
			System.out.println("No hay ningún número con el valor " + numero);
		}

		return arrayFinal;
	}

}