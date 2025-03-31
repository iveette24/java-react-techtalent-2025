
// Importamos las bibliotecas necesarias para la interfaz gráfica (JOptionPane)
// y para manejar estructuras de datos como ArrayList y HashMap.
import javax.swing.*;
import java.util.*;

public class ej04combinacion2y3App {
	// Creamos un objeto Scanner para leer entradas por teclado.
	private static final Scanner scanner = new Scanner(System.in);

	// Declaramos un HashMap para guardar el inventario: cada producto tiene un
	// nombre
	// y sus valores asociados son el precio y el stock (almacenados en un HashMap
	// interno).
	private static final HashMap<String, HashMap<String, Double>> inventario = new HashMap<>();

	// Usamos un ArrayList para registrar los totales de los productos añadidos al
	// carrito.
	private static final ArrayList<Double> carrito = new ArrayList<>();

	public static void main(String[] args) {
		// Inicializamos el inventario con productos y llamamos al menú principal.
		inicializarInventario();
		elegirModo();
	}

	// Método principal para elegir el modo de acceso: Administrador o Usuario.
	private static void elegirModo() {
		// Creamos un menú emergente con las opciones de "Administrador", "Usuario" o
		// "Salir".
		String[] opciones = { "Administrador", "Usuario", "Salir" };
		int opcion = JOptionPane.showOptionDialog(null, // Componente padre (null para centrarlo).
				"Selecciona el modo de acceso:", // Mensaje del cuadro de diálogo.
				"Modo de acceso", // Título del cuadro de diálogo.
				JOptionPane.DEFAULT_OPTION, // Tipo de opciones por defecto.
				JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje.
				null, // Sin icono personalizado.
				opciones, // Opciones disponibles.
				opciones[0] // Opción por defecto seleccionada.
		);

		// Ejecutamos el modo correspondiente según la opción seleccionada.
		switch (opcion) {
		case 0 -> mostrarMenuStock(); // Modo Administrador
		case 1 -> mostrarMenuCompras(); // Modo Usuario
		case 2 -> System.exit(0); // Salimos del programa.
		}
	}

	// Inicializamos el inventario con algunos productos de ejemplo.
	private static void inicializarInventario() {
		// Agregamos varios productos con su precio y cantidad inicial.
		agregarProducto("Manzana", 0.99, 50);
		agregarProducto("Leche", 1.49, 30);
		agregarProducto("Pan", 2.75, 20);
		agregarProducto("Arroz", 1.20, 100);
		agregarProducto("Huevos", 3.50, 60);
	}

	// Menú exclusivo del administrador para gestionar el inventario.
	private static void mostrarMenuStock() {
		int opcion;
		do {
			// Mostramos el menú en consola con varias opciones relacionadas con el stock.
			System.out.println("\n===== MODO ADMINISTRADOR: GESTIÓN DE STOCK =====");
			System.out.println("1. Listar productos");
			System.out.println("2. Consultar un producto");
			System.out.println("3. Añadir o actualizar producto");
			System.out.println("4. Volver al menú principal");
			System.out.print("Elige una opción: ");
			opcion = solicitarEntero(); // Pedimos un número entero.

			// Ejecutamos la acción según la opción seleccionada.
			switch (opcion) {
			case 1 -> listarProductos(); // Listar todos los productos.
			case 2 -> consultarProducto(); // Consultar detalles de un producto.
			case 3 -> añadirOActualizarProducto(); // Añadir o modificar un producto.
			case 4 -> elegirModo(); // Volver al menú principal.
			default -> System.out.println("Opción no válida.");
			}
		} while (opcion != 4); // Repetimos el menú hasta que elija salir.
	}

	// Menú exclusivo del usuario para realizar compras.
	private static void mostrarMenuCompras() {
		// Opciones disponibles para el usuario.
		String[] opciones = { "Agregar producto al carrito", "Finalizar compra", "Volver al menú principal" };
		boolean seguirComprando = true;

		// Bucle para mostrar el menú mientras el usuario quiera seguir comprando.
		while (seguirComprando) {
			int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Modo Usuario: Compras",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

			// Ejecutamos la acción correspondiente según la opción seleccionada.
			switch (opcion) {
			case 0 -> venderProducto(); // Añadir producto al carrito.
			case 1 -> finalizarCompra(); // Finalizar y pagar la compra.
			case 2 -> {
				// Salir del menú de usuario y volver al menú principal.
				JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
				seguirComprando = false;
				elegirModo();
			}
			}
		}
	}

	// Agrega un producto al inventario.
	private static void agregarProducto(String nombre, double precio, int stock) {
		// Creamos un HashMap interno para guardar el precio y el stock del producto.
		HashMap<String, Double> info = new HashMap<>();
		info.put("precio", precio); // Guardamos el precio.
		info.put("stock", (double) stock); // Guardamos el stock como Double.
		inventario.put(nombre.toLowerCase(), info); // Añadimos el producto al inventario.
	}

	// Lista todos los productos disponibles en el inventario.
	private static void listarProductos() {
		System.out.println("\n===== LISTA DE PRODUCTOS =====");
		// Recorremos cada entrada del inventario y mostramos sus detalles.
		inventario.forEach((producto, info) -> {
			System.out.println(
					producto + " → Precio: " + info.get("precio") + "€, Stock: " + info.get("stock").intValue());
		});
	}
}