package ud07ArrayListYHashMapEjercicios;

// Importamos las clases necesarias para trabajar con ArrayList, HashMap y entrada del usuario
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App01notaMedia {

	public static void main(String[] args) {
		// Creamos un HashMap para almacenar los datos de los alumnos.
		// La clave es un String (nombre del alumno en mayúsculas) y el valor es un
		// ArrayList<Double> que contiene las notas.
		HashMap<String, ArrayList<Double>> DatosAlumnos = new HashMap<>();

		// Llamamos al método datosAlumnos para que el usuario introduzca la información
		// de los alumnos
		datosAlumnos(DatosAlumnos);

		// Llamamos al método notaMedia para calcular y mostrar la nota media de cada
		// alumno
		notaMedia(DatosAlumnos);
	}

	// Método para introducir los datos de los alumnos en el HashMap
	public static void datosAlumnos(HashMap<String, ArrayList<Double>> DatosAlumnos) {
		// Creamos un objeto Scanner para leer datos de entrada del usuario
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de alumnos: ");
		int numAlumnos = sc.nextInt(); // Leemos el número de alumnos que se van a registrar
		sc.nextLine(); // Consumimos el salto de línea para evitar problemas en la lectura posterior

		// Bucle para repetir el registro de datos por cada alumno
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Introduce el nombre del alumno " + (i + 1) + ": ");
			String nombre = sc.nextLine(); // Leemos el nombre del alumno
			nombre = nombre.toUpperCase(); // Convertimos el nombre a mayúsculas para estandarizarlo

			System.out.println("Introduce el número de notas del alumno " + (i + 1) + ": ");
			int numeroNotas = sc.nextInt(); // Leemos la cantidad de notas que se van a introducir
			sc.nextLine(); // Consumimos el salto de línea para evitar problemas al leer las notas

			// Creamos un ArrayList para almacenar las notas del alumno
			ArrayList<Double> notas = new ArrayList<>();
			for (int j = 0; j < numeroNotas; j++) { // Bucle para registrar cada nota
				System.out.println("Introduce la nota Nº" + (j + 1) + ": ");
				double nota = sc.nextDouble(); // Leemos una nota individual
				notas.add(nota); // Agregamos la nota al ArrayList
			}
			sc.nextLine(); // Consumimos el salto de línea después de las notas para evitar errores futuros

			// Asociamos el nombre del alumno con su lista de notas en el HashMap
			DatosAlumnos.put(nombre, notas); // Ejemplo: "JUAN" -> [8.0, 9.5, 7.0]
		}

		sc.close(); // Cerramos el Scanner para liberar recursos

		// Mostramos las notas de los alumnos almacenadas en el HashMap
		System.out.println("Notas de los alumnos:");
		System.out.println(DatosAlumnos + "\n"); // Imprime el contenido completo del HashMap
	}

	// Método para calcular y mostrar la nota media de cada alumno
	public static void notaMedia(HashMap<String, ArrayList<Double>> DatosAlumnos) {
		System.out.println("Nota media de los alumnos: ");

		// Recorremos cada entrada del HashMap usando un bucle "for"
		for (String nombre : DatosAlumnos.keySet()) { // Iteramos sobre las claves (nombres de los alumnos)
			ArrayList<Double> notas = DatosAlumnos.get(nombre); // Obtenemos la lista de notas para el alumno actual
			double suma = 0; // Variable para acumular la suma de las notas

			for (double nota : notas) { // Recorremos la lista de notas del alumno
				suma += nota; // Sumamos cada nota
			}

			double media = suma / notas.size(); // Calculamos la media dividiendo la suma entre el número de notas

			// Mostramos el nombre del alumno y su nota media
			System.out.println(nombre + ": " + media); // Ejemplo: "JUAN: 8.166666666666666"
		}
	}
}
