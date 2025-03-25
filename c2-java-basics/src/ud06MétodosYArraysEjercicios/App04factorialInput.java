package ud06MétodosYArraysEjercicios;

import javax.swing.JOptionPane;

public class App04factorialInput {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

		int fact = factorial(num);
		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + fact);
	}

	public static int factorial(int num) {
		int fact = 1;

		for (int i = num; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}
}