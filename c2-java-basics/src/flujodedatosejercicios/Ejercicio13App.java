package flujodedatosejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13App {

	public static void main(String[] args) {
		String num1str = JOptionPane.showInputDialog("Escribe el primer operando: ");
		int num1 = Integer.parseInt(num1str);
		// Lo convertimos a int y hacemos lo mismo con el 2o operando
		// Es mucho más fácil, en vez de crear dos variables, poner directamente:
		// int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer
		// operando: "));

		String num2str = JOptionPane.showInputDialog("Escribe el segundo operando: ");
		int num2 = Integer.parseInt(num2str);

		String signostr = JOptionPane.showInputDialog("Introduce el signo aritmético (+, -, *, /, ^, %): ");

		double resultado = 0;

		switch (signostr) {
		case "+":
			resultado = num1 + num2;
			JOptionPane.showInputDialog("El resultado de la operación es: " + resultado);
			break;
		case "-":
			resultado = num1 - num2;
			JOptionPane.showInputDialog("El resultado de la operación es: " + resultado);
			break;
		case "*":
			resultado = num1 * num2;
			JOptionPane.showInputDialog("El resultado de la operación es: " + resultado);
			break;
		case "/":
			if (num2 == 0) {
				JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
			} else {
				resultado = num1 / num2;
				JOptionPane.showInputDialog("El resultado de la operación es: " + resultado);
			}
		case "^":
			resultado = num1 ^ num2;
			JOptionPane.showInputDialog("El resultado de la operación es: " + resultado);
		case "%":
			resultado = num1 % num2;
			JOptionPane.showInputDialog("El resultado de la operación es: " + resultado);
		default:
			JOptionPane.showMessageDialog(null, "El valor introducido no es válido");

		}

	}

}