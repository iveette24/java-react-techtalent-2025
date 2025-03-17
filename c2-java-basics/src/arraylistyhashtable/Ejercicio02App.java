package arraylistyhashtable;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> carrito = new ArrayList<>();

		ingresePrecios(sc, carrito);
		seleccionarIVA(sc, carrito);

	}

	public static void ingresePrecios(Scanner sc, ArrayList<Double> carrito) {

		System.out.println("Ingrese el precio de los productos uno por uno (digite -1 para terminar):");
		while (true) {
			double precio = sc.nextDouble();
			if (precio == -1) {
				break;
			}
			carrito.add(precio);
		}
	}

	public static void seleccionarIVA(Scanner sc, ArrayList<Double> carrito) {
		double suma = 0;
		for (double precio : carrito) {
			suma += precio;
		}

		System.out.println("El precio en bruto es: " + (Math.round(suma * 100.0) / 100.0));
		System.out.println("Selecciona el IVA: \n1.21%\n2.4%");
		int opcionIVA = sc.nextInt();

		switch (opcionIVA) {
		case 1:
			double IVA1 = (Math.round(suma * 0.21) / 100.0);
			System.out.println("El precio con el 21% de IVA es: " + (Math.round(suma + IVA1)/100));
			break;

		case 2:
			double IVA2 = (Math.round(suma * 0.04) / 100.0);
			System.out.println("El precio con el 4% de IVA es: " + (Math.round(suma + IVA2)));
			break;
		}
	}
//	54
//	654
//	1,5
//	654,36
//	54,65
//	-1
}
