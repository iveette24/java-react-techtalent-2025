
package ud06MétodosYArraysEjercicios;

import javax.swing.JOptionPane;

public class App08arrayValoresInput {

	public static void main(String[] args) {
		double[] num = new double[10];
		rellenarNumeros(num);
		mostrarNumeros(num);
	}

	public static void rellenarNumeros(double[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la posición " + (i + 1) + ": "));
		}
	}

	public static void mostrarNumeros(double[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Valor " + (i + 1) + ": " + num[i] + "\n");
		}
	}
}
