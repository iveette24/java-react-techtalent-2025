
package métodosyarraysejercicios;

import java.util.Scanner;

import java.util.Random;

public class Ejercicio12AppMondongo03 {

	public static void main(String[] args) {

		int array[] = tamaño();

		digitoRandomFinal(array);

	}

	public static int[] tamaño() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Tamaño del array: ");
		int size = sc.nextInt();

		int array[] = new int[size];
		return array;

	}

	public static void digitoRandomFinal(int[] array) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Indicar digito final: ");
		int digito = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1, 300);
			if (array[i] % 10 == digito) {
				System.out.println(array[i] + " termina en " + digito);
			} else if (digito != array[i] % 10) {
				System.out.println(array[i] + " No termina en: " + digito);

			}
		}
	}
}