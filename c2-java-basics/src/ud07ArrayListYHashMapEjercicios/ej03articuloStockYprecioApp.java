package ud07ArrayListYHashMapEjercicios; // Define el paquete donde reside esta clase.

import java.util.HashMap; // Importa la clase HashMap para manejar pares clave-valor.
import java.util.Scanner; // Importa la clase Scanner para capturar datos del usuario.

public class ej03articuloStockYprecioApp { // Define la clase principal del programa.

	public static void main(String[] args) { // Método principal que ejecuta el programa.

		// Crea dos HashMap para almacenar los precios y stock de productos.
		HashMap<String, Double> Precios = new HashMap<>(); // Map clave: nombre producto, valor: precio.
		HashMap<String, Integer> Stock = new HashMap<>(); // Map clave: nombre producto, valor: cantidad en stock.

		// Inicializa el Scanner para leer datos de entrada del usuario.
		Scanner sc = new Scanner(System.in);

		// Llena los HashMap con datos iniciales y muestra el menú al usuario.
		inicializarBaseDatos(Precios, Stock); // Método para inicializar datos de productos y stock.
		mostrarMenu(sc, Precios, Stock); // Método que muestra el menú principal.
	}

	// Muestra el menú principal y permite elegir opciones.
	public static void mostrarMenu(Scanner sc, HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {
		int opcion; // Variable para almacenar la opción seleccionada.
		do {
			System.out.println("\n===== MENU PRINCIPAL ====="); // Encabezado del menú.
			System.out.println("1. Mostrar todos los productos"); // Opción para listar productos.
			System.out.println("2. Consultar información de un producto"); // Opción para buscar detalles de un
																			// producto.
			System.out.println("3. Añadir nuevo producto"); // Opción para agregar un producto nuevo.
			System.out.println("4. Salir"); // Opción para finalizar el programa.
			System.out.print("Elige una opción: "); // Mensaje para elegir la opción deseada.
			opcion = sc.nextInt(); // Captura la opción elegida por el usuario.
			sc.nextLine(); // Limpia el buffer del Scanner.
			procesarOpcion(opcion, Precios, Stock, sc); // Llama al método que procesa cada opción del menú.
		} while (opcion != 4); // Repite el menú hasta que el usuario seleccione la opción para salir.
	}

	// Procesa la opción seleccionada en el menú.
	public static void procesarOpcion(int opcion, HashMap<String, Double> Precios, HashMap<String, Integer> Stock,
			Scanner sc) {
		switch (opcion) { // Estructura para decidir qué hacer según la opción.
		case 1:
			mostrarProductos(Precios, Stock); // Llama al método para mostrar todos los productos.
			break;
		case 2:
			consultarProducto(Precios, Stock, sc); // Llama al método para consultar detalles de un producto.
			break;
		case 3:
			añadirProducto(Precios, Stock, sc); // Llama al método para añadir un nuevo producto.
			break;
		case 4:
			System.out.println("Gracias, ¡adiós!"); // Mensaje de despedida.
			break;
		default:
			System.out.println("Opción no válida. Por favor, intenta de nuevo."); // Mensaje si la opción no es válida.
		}
	}

	// Inicializa los datos de productos y su stock.
	public static void inicializarBaseDatos(HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {
		// Llena el HashMap Precios con datos iniciales.
		Precios.put("Manzana", 0.99); // Ejemplo: Manzana cuesta 0.99€.
		Precios.put("Leche", 1.49); // Leche cuesta 1.49€.
		Precios.put("Pan", 2.75); // Pan cuesta 2.75€.
		Precios.put("Arroz", 1.20); // Arroz cuesta 1.20€.
		Precios.put("Huevos", 3.50); // Huevos cuestan 3.50€.
		Precios.put("Queso", 4.99); // Queso cuesta 4.99€.
		Precios.put("Tomate", 1.10); // Tomate cuesta 1.10€.
		Precios.put("Pasta", 2.30); // Pasta cuesta 2.30€.
		Precios.put("Café", 5.40); // Café cuesta 5.40€.
		Precios.put("Té", 3.00); // Té cuesta 3.00€.

		// Llena el HashMap Stock con cantidades iniciales.
		Stock.put("Manzana", 50); // Hay 50 unidades de Manzana.
		Stock.put("Leche", 30); // Hay 30 unidades de Leche.
		Stock.put("Pan", 20); // Hay 20 unidades de Pan.
		Stock.put("Arroz", 100); // Hay 100 unidades de Arroz.
		Stock.put("Huevos", 60); // Hay 60 unidades de Huevos.
		Stock.put("Queso", 15); // Hay 15 unidades de Queso.
		Stock.put("Tomate", 40); // Hay 40 unidades de Tomate.
		Stock.put("Pasta", 70); // Hay 70 unidades de Pasta.
		Stock.put("Café", 25); // Hay 25 unidades de Café.
		Stock.put("Té", 45); // Hay 45 unidades de Té.
	}

	// Muestra la lista de productos disponibles junto con su precio y stock.
	public static void mostrarProductos(HashMap<String, Double> Precios, HashMap<String, Integer> Stock) {
		System.out.println("\n===== LISTA DE PRODUCTOS ====="); // Encabezado de la lista.
		for (String articulo : Precios.keySet()) { // Itera por cada producto en el HashMap.
			double precio = Precios.get(articulo); // Obtiene el precio del producto.
			int stock = Stock.get(articulo); // Obtiene el stock del producto.
			System.out.println("Artículo: " + articulo + ", Precio: " + precio + "€, Stock: " + stock); // Muestra
																										// detalles.
		}
	}

	// Permite consultar detalles de un producto específico.
	public static void consultarProducto(HashMap<String, Double> Precios, HashMap<String, Integer> Stock, Scanner sc) {
		System.out.print("\nIntroduce el nombre del artículo a consultar: "); // Solicita el nombre del producto.
		String articulo = sc.nextLine(); // Captura el nombre del producto ingresado.
		if (Precios.containsKey(articulo)) { // Verifica si el producto existe en el HashMap.
			double precio = Precios.get(articulo); // Obtiene el precio del producto.
			int stock = Stock.get(articulo); // Obtiene el stock del producto.
			System.out.println("Artículo: " + articulo + ", Precio: " + precio + "€, Stock: " + stock); // Muestra
																										// detalles.
		} else {
			System.out.println("El artículo no se encuentra en la lista."); // Mensaje si el producto no existe.
		}
	}

	// Permite añadir un nuevo producto a los HashMap.
	public static void añadirProducto(HashMap<String, Double> Precios, HashMap<String, Integer> Stock, Scanner sc) {
		System.out.print("\nIntroduce el nombre del nuevo artículo: "); // Solicita el nombre del nuevo producto.
		String articulo = sc.nextLine(); // Captura el nombre del nuevo producto.
		if (Precios.containsKey(articulo)) { // Verifica si el producto ya existe.
			System.out.println("El artículo ya existe."); // Mensaje si el producto ya está registrado.
		} else {
			System.out.print("Introduce el precio del artículo: "); // Solicita el precio del producto.
			double precio = sc.nextDouble(); // Captura el precio ingresado.
			System.out.print("Introduce la cantidad en stock: "); // Solicita la cantidad en stock.
			int stock = sc.nextInt(); // Captura la cantidad ingresada.
			sc.nextLine(); // Limpia el buffer del Scanner.
			Precios.put(articulo, precio); // Añade el nuevo producto al HashMap Precios.
			Stock.put(articulo, stock); // Añade el nuevo producto al HashMap Stock.
			System.out.println("Artículo añadido correctamente."); // Mensaje de confirmación.
		}
	}
}