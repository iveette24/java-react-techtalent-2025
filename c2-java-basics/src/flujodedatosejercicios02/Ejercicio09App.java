package flujodedatosejercicios02;

public class Ejercicio09App {

	public static void main(String[] args) {
		// Defino una variable
		// for (inicialización; condición; incremento/decremento);
		for (int num = 1; num <= 100; num++) {
			//Con el if, creamos la condición de impresión de números divisibles entre 2 y 3
			if (num % 2 == 0 && num % 3 == 0) {
				System.out.println(num);

			}

		}
	}
}