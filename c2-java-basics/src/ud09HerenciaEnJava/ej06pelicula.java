package ud09HerenciaEnJava; // Define el paquete donde se encuentra la clase

import javax.swing.JOptionPane; // Importa la librería para mostrar ventanas emergentes

public class ej06pelicula {
	// Atributos de la película
	private String titulo; // Guarda el título de la película
	private int duracion; // Guarda la duración de la película en minutos
	private int edadMinima; // Indica la edad mínima requerida para ver la película
	private String director; // Guarda el nombre del director de la película
	private double precioEntrada; // Representa el precio de la entrada al cine

	// Constructor para inicializar los atributos con valores proporcionados al
	// crear un objeto de esta clase
	public ej06pelicula(String titulo, int duracion, int edadMinima, String director, double precioEntrada) {
		this.titulo = titulo; // Asigna el título recibido al atributo de la clase
		this.duracion = duracion; // Asigna la duración recibida al atributo de la clase
		this.edadMinima = edadMinima; // Asigna la edad mínima recibida al atributo de la clase
		this.director = director; // Asigna el nombre del director al atributo de la clase
		this.precioEntrada = precioEntrada; // Asigna el precio de entrada recibido al atributo de la clase
	}

	// Métodos "getter" para obtener los valores de los atributos de la película
	public String getTitulo() {
		return titulo; // Devuelve el título de la película
	}

	public int getDuracion() {
		return duracion; // Devuelve la duración de la película
	}

	public int getEdadMinima() {
		return edadMinima; // Devuelve la edad mínima requerida para ver la película
	}

	public String getDirector() {
		return director; // Devuelve el nombre del director de la película
	}

	public double getPrecioEntrada() {
		return precioEntrada; // Devuelve el precio de la entrada
	}

	// Métodos "setter" para modificar los valores de los atributos si es necesario
	public void setTitulo(String titulo) {
		this.titulo = titulo; // Cambia el título de la película
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion; // Cambia la duración de la película
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima; // Cambia la edad mínima requerida
	}

	public void setDirector(String director) {
		this.director = director; // Cambia el nombre del director
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada; // Cambia el precio de la entrada
	}

	// Método que muestra la información de la película en una ventana emergente con
	// JOptionPane
	public void mostrarInformacion() {
		JOptionPane.showMessageDialog(null, // Muestra una ventana emergente con los datos de la película
				"INFORMACIÓN DE LA PELÍCULA\nTítulo: " + titulo + "\n" + // Muestra el título
						"Duración: " + duracion + " minutos\n" + // Muestra la duración en minutos
						"Edad mínima: " + edadMinima + " años\n" + // Muestra la edad mínima
						"Director: " + director + "\n" + // Muestra el nombre del director
						"Precio de entrada: " + precioEntrada + " €"); // Muestra el precio de entrada

	}
}