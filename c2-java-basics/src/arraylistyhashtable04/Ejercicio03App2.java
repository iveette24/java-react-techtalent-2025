package arraylistyhashtable04;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> stock = new HashMap<>();

		System.out.println("Introduce 10 productos con su cantidad inicial:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Producto:");
			String producto = scanner.nextLine();
			System.out.println("Cantidad:");
			int cantidad = scanner.nextInt();
			scanner.nextLine(); // Consumir salto de línea
			stock.put(producto, cantidad);
		}

		System.out.println("¿Deseas consultar o añadir un producto? (consultar/añadir)");
		String accion = scanner.nextLine();

		if (accion.equalsIgnoreCase("consultar")) {
			System.out.println("Introduce el producto a consultar:");
			String consulta = scanner.nextLine();
			System.out.println(consulta + ": " + stock.getOrDefault(consulta, 0));
		} else if (accion.equalsIgnoreCase("añadir")) {
			System.out.println("Introduce el producto:");
			String nuevoProducto = scanner.nextLine();
			System.out.println("Cantidad:");
			int nuevaCantidad = scanner.nextInt();
			stock.put(nuevoProducto, stock.getOrDefault(nuevoProducto, 0) + nuevaCantidad);
		}

		System.out.println("Stock actual:");
		stock.forEach((producto, cantidad) -> System.out.println(producto + ": " + cantidad));
	}
}
