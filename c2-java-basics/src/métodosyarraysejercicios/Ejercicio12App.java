package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión del array: "));
		int[] array1 = new int[dimension];

		array1 = randomArray1(array1, dimension);

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el último valor que quieres: "));

	}

	public static int[] randomArray1(int[] array1, int dimension) {

		// Crear un método que haga que los arrays sean creados random
		array1 = new int[dimension];

		for (int i = 0; i < dimension; i++) {
			array1[i] = (int) (Math.random() * 300) + 1;
		}
		return array1;
	}

	public static int[] comparador(int[] array1, int numero) {
		int ultimonumero = array1[array1.length - 1];
		if (ultimonumero == numero) {
			System.out.println("Los valores ");
		}

		for (int i = 0; i < array1.length; i++) {
		}

	}
}
