package ud05FlujoDeDatosEjercicios;

import java.util.Scanner;

public class ejextra02factorialApp {

	public static void main(String[] args) {
		// El factorial de un número es el producto
		// de todos los números enteros positivos desde 1
		// hasta ese número. Se representa con el símbolo !.
		// Por ejemplo, el factorial de 5 se escribe como 5!.

		// Se crea un scanner para leer los datos de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial: ");
		int num = sc.nextInt();
		// Lo almacenamos en una variable double porque el
		// usuario puede introducir un decimal
		sc.close();

		long factorial = calcularFactorial(num);
		// Se usa el long porque el factorial de
		// un número puede ser muy grande

		System.out.println("El factorial de " + num + " es " + factorial);
	}

	public static long calcularFactorial(int n) {
		long resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
		// Este método, recibe un número n y calcula su factorial.
	}
}