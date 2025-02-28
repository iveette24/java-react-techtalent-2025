package métodosyarraysejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2App3 {

	public static void main(String[] args) {
		// Hecho por mi

		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos números aleatorios quieres?"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el valor mínimo?"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el valor máximo?"));
		// El usuario ingresa la cantidad de números que quiere y el rango.

		System.out.println("Los números aleatorios són:\n");

		for (int i = 0; i < cantidad; i++) {
			int num = aleatorios(max, min);
			System.out.println(num);
		}
		// Lo imprime cantidad veces, poniendo la variable num dentro del bucle para que
		// haga la misma acción "cantidad" veces.

	}

	public static int aleatorios(int max, int min) {

		int num = (int) (Math.random() * (max - min + 1)) + min;
		return num;

		// Genera un número aleatorio entre min y max usando el math.random.

	}

}
