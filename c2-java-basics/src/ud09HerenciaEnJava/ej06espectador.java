package ud09HerenciaEnJava; // Define el paquete donde se encuentra la clase

import javax.swing.JOptionPane; // Importamos JOptionPane para mostrar ventanas emergentes con mensajes

public class ej06espectador {
	// Atributos del espectador
	private String nombre; // Guarda el nombre del espectador
	private int edad; // Guarda la edad del espectador
	private double dinero; // Guarda el dinero disponible del espectador

	// Constructor para inicializar los valores del espectador al crear el objeto
	public ej06espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre; // Asigna el nombre recibido al atributo de la clase
		this.edad = edad; // Asigna la edad recibida al atributo de la clase
		this.dinero = dinero; // Asigna el dinero recibido al atributo de la clase
	}

	// Métodos "getter" para obtener los valores de los atributos del espectador
	public String getNombre() {
		return nombre; // Devuelve el nombre del espectador
	}

	public int getEdad() {
		return edad; // Devuelve la edad del espectador
	}

	public double getDinero() {
		return dinero; // Devuelve el dinero disponible del espectador
	}

	// Método para verificar si el espectador tiene suficiente dinero para pagar la
	// entrada
	public boolean puedePagarEntrada(double precioEntrada) {
		if (dinero >= precioEntrada) { // Si el dinero disponible es suficiente para pagar la entrada
			dinero -= precioEntrada; // Se descuenta el precio de la entrada del dinero disponible
			return true; // Retorna verdadero porque pudo pagar la entrada
		} else { // Si no tiene suficiente dinero
			JOptionPane.showMessageDialog(null, nombre + " no tiene suficiente dinero para comprar la entrada.");
			// Mensaje emergente informando que no tiene dinero suficiente
			return false; // Retorna falso porque no puede pagar la entrada
		}
	}

	// Método para verificar si el espectador cumple con la edad mínima requerida
	// para ver la película
	public boolean cumpleEdadMinima(int edadMinima) {
		if (edad >= edadMinima) { // Si la edad del espectador es mayor o igual a la edad mínima requerida
			return true; // Retorna verdadero porque cumple la edad mínima
		} else { // Si es menor a la edad mínima requerida
			JOptionPane.showMessageDialog(null, nombre + " no cumple con la edad mínima para ver la película.");
			// Mensaje emergente informando que no cumple con la edad mínima
			return false; // Retorna falso porque no puede ver la película
		}
	}
}