package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02App2 {

	public static void main(String[] args) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números aleatorios quieres?"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo:"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo:"));

		// Pasamos de string a int
		int[] numeros = aleatorios(cantidad, min, max);
		// Imprimimos los números aleatorios generados
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static int[] aleatorios(int cantidad, int min, int max) {
		int num[] = new int[cantidad];
		// Declaramos un array
		for (int i = 0; i < cantidad; i++) {
			num[i] = (int) (Math.random() * (max - min + 1)) + min;
		}
		return num;
	}
}
