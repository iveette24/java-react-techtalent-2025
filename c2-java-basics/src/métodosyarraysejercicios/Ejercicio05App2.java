
package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05App2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
		String binario = DecimalBinario(num);
		JOptionPane.showMessageDialog(null, "El número binario es: " + binario);
	}

	public static String DecimalBinario(int num) {
		if (num == 0) {
			return "0";
			// Si el número es 0, directamente se descarta devolviendo 0
		}

		String binario = "";
		while (num > 0) {
			int resto = num % 2;
			binario = resto + binario; // Si lo ponemos al revés, el número binario saldría a la inversa.
			num = num / 2;
		}
		return binario;
	}
}