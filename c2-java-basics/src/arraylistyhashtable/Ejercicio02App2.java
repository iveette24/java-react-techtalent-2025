package arraylistyhashtable;

import java.util.ArrayList;
import java.util.Scanner;

// Clase principal donde se ejecutará el programa
public class Ejercicio02App2 {

	public static void main(String[] args) {
		// Creamos un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Inicializamos un ArrayList para almacenar los precios de los productos en el
		// carrito
		ArrayList<Double> carrito = new ArrayList<>();

		// Llamamos al método que se encarga de llenar el carrito con los precios
		llenarCarrito(carrito, scanner);

		// Llamamos al método para que el usuario seleccione el porcentaje de IVA
		double iva = seleccionarIVA(scanner);

		// Calculamos el precio total bruto sumando todos los elementos del carrito
		double precioTotalBruto = calcularTotalBruto(carrito);

		// Calculamos el precio total incluyendo IVA
		double precioConIVA = calcularPrecioConIVA(precioTotalBruto, iva);

		// Mostramos el resumen de la compra utilizando los datos calculados
		mostrarResumen(precioTotalBruto, precioConIVA, iva, carrito.size());

		// Gestionamos el pago, calculando el cambio o mostrando que falta dinero
		gestionarPago(precioConIVA, scanner);

		// Cerramos el Scanner para liberar los recursos utilizados
		scanner.close();
	}

	// Método para llenar el carrito con los precios de los productos ingresados por
	// el usuario
	public static void llenarCarrito(ArrayList<Double> carrito, Scanner scanner) {
		System.out.println("Ingrese el precio de los productos uno por uno (digite -1 para terminar):");
		while (true) { // Creamos un bucle infinito para permitir la entrada de varios precios
			double precio = scanner.nextDouble(); // Leemos el precio ingresado por el usuario
			if (precio == -1) { // Si el usuario ingresa -1, terminamos el bucle
				break; // Salimos del bucle
			}
			carrito.add(precio); // Agregamos el precio al ArrayList "carrito"
		}
	}

	// Método para que el usuario seleccione el IVA que se aplicará a los productos
	public static double seleccionarIVA(Scanner scanner) {
		System.out.println("Seleccione el IVA a aplicar: ");
		System.out.println("1. 21%"); // Opción para IVA del 21%
		System.out.println("2. 4%"); // Opción para IVA del 4%
		int opcionIVA = scanner.nextInt(); // Leemos la opción seleccionada por el usuario
		if (opcionIVA == 1) { // Si elige 21%
			return 0.21; // Devolvemos el valor correspondiente al 21% de IVA
		} else if (opcionIVA == 2) { // Si elige 4%
			return 0.04; // Devolvemos el valor correspondiente al 4% de IVA
		} else { // Si el usuario ingresa una opción inválida
			System.out.println("Opción no válida, se aplicará 21% por defecto.");
			return 0.21; // Devolvemos el valor por defecto (21% de IVA)
		}
	}

	// Método para calcular el total bruto (sin IVA) sumando todos los precios en el
	// carrito
	public static double calcularTotalBruto(ArrayList<Double> carrito) {
		double total = 0.0; // Inicializamos el total en 0
		for (double precio : carrito) { // Iteramos sobre cada precio en el carrito
			total += precio; // Sumamos cada precio al total
		}
		return Math.round(total * 100.0) / 100.0; // Devolvemos el total bruto calculado
	}

	// Método para calcular el precio total incluyendo el IVA
	public static double calcularPrecioConIVA(double precioTotalBruto, double iva) {
		return Math.round((precioTotalBruto + (precioTotalBruto * iva)) * 100.0) / 100.0; // Calculamos y devolvemos el
																							// precio con IVA
	}

	// Método para mostrar el resumen de la compra
	public static void mostrarResumen(double precioTotalBruto, double precioConIVA, double iva, int numeroArticulos) {
		System.out.println("\n--- Resumen de la compra ---");
		System.out.println("IVA aplicado: " + (iva * 100) + "%"); // Mostramos el porcentaje de IVA aplicado
		System.out.println("Precio bruto: " + precioTotalBruto + "€"); // Mostramos el precio total bruto
		System.out.println("Precio total (con IVA): " + precioConIVA + "€"); // Mostramos el precio total con IVA
		System.out.println("Número de artículos comprados: " + numeroArticulos); // Mostramos el número de productos
																					// comprados
	}

	// Método para gestionar el pago, verificando si el cliente pagó suficiente y
	// calculando el cambio
	public static void gestionarPago(double precioConIVA, Scanner scanner) {
		System.out.print("Ingrese la cantidad pagada por el cliente: ");
		double cantidadPagada = scanner.nextDouble(); // Leemos el monto ingresado por el cliente
		if (cantidadPagada >= precioConIVA) { // Verificamos si el cliente pagó suficiente
			double cambio = Math.round((cantidadPagada - precioConIVA) * 100.0) / 100.0; // Calculamos el cambio a //
																							// devolver
			System.out.println("Cambio a devolver: " + cambio + "€"); // Mostramos el cambio
		} else {
			double faltante = Math.round((precioConIVA - cantidadPagada) * 100.0) / 100.0; // Redondeamos el faltante
			System.out.println("Cantidad insuficiente. Faltan: " + faltante + "€");
		}
	}
}