
package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05App3 {

	public static void main(String[] args) {
		// Hecho por mi

		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

		String binario = DecimalBinario(num);
		JOptionPane.showMessageDialog(null, "El número binario de " + num + " es: " + binario);
	}

	public static String DecimalBinario(int num) {
		if (num == 0) {
			return "0";
		}

		StringBuilder binario = new StringBuilder();
		while (num > 0) {
			int residuo = num % 2;
			binario.insert(0, residuo); // Insertamos el residuo en el principio
			num /= 2;
		}
		return binario.toString(); // Covierte el método StringBuilder a String para que pueda ser devuelto por el
									// método
	}
}