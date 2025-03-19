package ud07ArrayListYHashMapEjercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio04App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> stock = new HashMap<>();
		ArrayList<Double> carrito = new ArrayList<>();
		inicializarStock(stock);

		while (true) {
			System.out.println("\nMenú:");
			System.out.println("1. Comprar artículos");
			System.out.println("2. Consultar stock");
			System.out.println("3. Añadir stock");
			System.out.println("4. Salir");
			System.out.println("Selecciona una opción:");
			int opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir salto de línea

			switch (opcion) {
			case 1:
				comprarArticulos(stock, carrito, scanner);
				break;
			case 2:
				consultarStock(stock, scanner);
				break;
			case 3:
				añadirStock(stock, scanner);
				break;
			case 4:
				System.out.println("Gracias por utilizar la aplicación. ¡Adiós!");
				return;
			default:
				System.out.println("Opción no válida, intenta de nuevo.");
			}
		}
	}

	private static void inicializarStock(HashMap<String, Integer> stock) {
		stock.put("Manzanas", 50);
		stock.put("Pan", 30);
		stock.put("Leche", 20);
		stock.put("Huevos", 40);
		stock.put("Arroz", 25);
	}

	private static void comprarArticulos(HashMap<String, Integer> stock, ArrayList<Double> carrito, Scanner scanner) {
		System.out.println("Introduce el producto que deseas comprar:");
		String producto = scanner.nextLine();
		if (stock.containsKey(producto) && stock.get(producto) > 0) {
			System.out.println("Introduce la cantidad:");
			int cantidad = scanner.nextInt();
			scanner.nextLine(); // Consumir salto de línea

			if (cantidad <= stock.get(producto)) {
				System.out.println("Introduce el precio unitario:");
				double precio = scanner.nextDouble();
				scanner.nextLine(); // Consumir salto de línea

				carrito.add(precio * cantidad);
				stock.put(producto, stock.get(producto) - cantidad);
				System.out.println("Compra realizada. Producto añadido al carrito.");
			} else {
				System.out.println("Cantidad insuficiente en stock.");
			}
		} else {
			System.out.println("Producto no disponible.");
		}
	}

	private static void consultarStock(HashMap<String, Integer> stock, Scanner scanner) {
		System.out.println("Introduce el nombre del producto a consultar:");
		String producto = scanner.nextLine();
		System.out.println("Stock de " + producto + ": " + stock.getOrDefault(producto, 0));
	}

	private static void añadirStock(HashMap<String, Integer> stock, Scanner scanner) {
		System.out.println("Introduce el nombre del producto:");
		String producto = scanner.nextLine();
		System.out.println("Introduce la cantidad a añadir:");
		int cantidad = scanner.nextInt();
		scanner.nextLine(); // Consumir salto de línea

		stock.put(producto, stock.getOrDefault(producto, 0) + cantidad);
		System.out.println("Stock actualizado.");
	}
}
