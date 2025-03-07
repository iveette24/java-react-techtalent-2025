package métodosyarraysejercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión del array: "));
		int[] array1 = new int[dimension];
		// Ninguna acción
		array1 = randomArray1(array1, dimension);

		// int[] array1 = randomArray1(dimension);

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el último valor que quieres: "));

		int[] array2 = new int[0];
		array2 = comparador(array1, numero);

		System.out.println("Los numeros que acaban en " + numero + " son : " + Arrays.toString(array2));

//		comparador(array1, numero);
		// System.out.println(comparador(array1, numero));

//		System.out.println("estos son los que acaban en " + numero + " : " + array1[i]);

	}

	public static int[] randomArray1(int[] array1, int dimension) {

		// Crear un método que haga que los arrays sean creados random
		array1 = new int[dimension];
		if (dimension <= 0) {
			JOptionPane.showMessageDialog(null, "La dimensión del array no es válida.");

		} else {

			for (int i = 0; i < dimension; i++) {
				array1[i] = (int) (Math.random() * 300) + 1;
			}
		}
		return array1;
	}

	public static int[] comparador(int[] array1, int numero) {
		int[] resultados = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			resultados[i] = array1[i] % 10;

		}

		return resultados;
	}
}