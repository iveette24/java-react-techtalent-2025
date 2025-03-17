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
		System.out.println("\nSelecciona el IVA: \n1.21%\n2.4%");
		int opcionIVA = sc.nextInt();

		 switch (opcionIVA) {
	        case 1:
	            double IVA1 = suma * 0.21;
	            System.out.println("El precio con el 21% de IVA es: " + (Math.round((suma + IVA1) * 1000.0) / 1000.0));
	            break;

	        case 2:
	            double IVA2 = suma * 0.04;
	            System.out.println("El precio con el 4% de IVA es: " + (Math.round((suma + IVA2) * 100.0) / 100.0));
	            break;

	        default:
	            System.out.println("Opción de IVA no válida.");
	            break;
	    }
	}

	public static void resumen() {
		System.out.println("--- Resumen de la compra ---");
//		if (opcionIVA == 1) {
		System.out.println();}
	}

	

