package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2App1 {

	public static void main(String[] args) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números aleatorios quieres?"));
		// Pasamos de string a int
		int[] numeros = aleatorios(cantidad);
		// Imprimimos los números aleatorios generados
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static int[] aleatorios(int cantidad) {
		int num[] = new int[cantidad];
		// Declaramos un array
		for (int i = 0; i < cantidad; i++) {
			num[i] = (int) (Math.random() * 1000);
		}
		return num;
	}
}
