
package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

		String binario = decimalABinario(num);
		JOptionPane.showMessageDialog(null, "El número " + num + " en binario es: " + binario);
	}

	public static String decimalABinario(int num) {
		if (num == 0) {
			return "0";
		}

		StringBuilder binario = new StringBuilder();
		while (num > 0) {
			int resto = num % 2;
			binario.insert(0, resto);
			num /= 2;
		}
		return binario.toString();
	}
}
