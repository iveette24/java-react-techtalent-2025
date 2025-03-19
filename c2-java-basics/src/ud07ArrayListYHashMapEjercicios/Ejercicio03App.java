package ud07ArrayListYHashMapEjercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03App {

	public static void main(String[] args) {
		HashMap<String, Double> Precios = new HashMap<>();
		HashMap<String, Integer> Stock = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		inicializarBaseDatos(Precios, Stock);
		menuPrincipal(sc, Precios, Stock);
	}

	public static void menuPrincipal(Scanner sc, HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {
		boolean continuar = true;
		while (continuar == true) {
			System.out.println("\n==== Menú principal ====");
			System.out.println("1. Mostrar todos los productos");
			System.out.println("2. Consultar información de un producto");
			System.out.println("3. Añadir nuevo producto");
			System.out.println("4. Salir");
			int opcion = sc.nextInt();
			gestionOpciones(opcion, Precios, Stock);
			if (opcion == 4) {
				continuar = false;
			}
		}
	}

	public static void gestionOpciones(int opcion, HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {
		switch (opcion) {
		case 1:
			mostrarProductos(Precios, Stock);
			break;
		case 2:
			// consultarProducto

		}
	}

	public static void inicializarBaseDatos(HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {

		Precios.put("Manzana", 0.99);
		Precios.put("Leche", 1.49);
		Precios.put("Pan", 2.75);
		Precios.put("Arroz", 1.20);
		Precios.put("Huevos", 3.50);
		Precios.put("Queso", 4.99);
		Precios.put("Tomate", 1.10);
		Precios.put("Pasta", 2.30);
		Precios.put("Café", 5.40);
		Precios.put("Té", 3.00);

		Stock.put("Manzana", 50);
		Stock.put("Leche", 30);
		Stock.put("Pan", 20);
		Stock.put("Arroz", 100);
		Stock.put("Huevos", 60);
		Stock.put("Queso", 15);
		Stock.put("Tomate", 40);
		Stock.put("Pasta", 70);
		Stock.put("Café", 25);
		Stock.put("Té", 45);

	}

	public static void mostrarProductos(HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {
		System.out.println("\n===== LISTA DE PRODUCTOS =====");
		for (String articulo : Precios.keySet()) {
			double precio = Precios.get(articulo);
			int stock = Stock.get(articulo);
			System.out.println("Artículo: " + articulo + ", Precio: " + precio + "€, Stock: " + stock);
		}
	}

}
