package ud09HerenciaEnJava.ejercicio04; // Define el paquete en el que se encuentra la clase

public class ej04raices { // Declara la clase ej04raices

	// Atributos que representan los coeficientes de la ecuación de segundo grado
	private double a, b, c;

	// Constructor que inicializa los coeficientes de la ecuación
	public ej04raices(double a, double b, double c) {
		this.a = a; // Asigna el valor de 'a' al atributo de la clase
		this.b = b; // Asigna el valor de 'b' al atributo de la clase
		this.c = c; // Asigna el valor de 'c' al atributo de la clase
	}

	// Método para calcular el discriminante de la ecuación cuadrática
	public double getDiscriminante() {
		return Math.pow(b, 2) - 4 * a * c; // Aplica la fórmula del discriminante: b^2 - 4ac
	}

	// Método que determina si la ecuación tiene dos soluciones reales
	public boolean tieneRaices() {
		return getDiscriminante() >= 0; // Si el discriminante es positivo, hay dos soluciones reales
	}

	// Método que determina si la ecuación tiene una única solución real
	public boolean tieneRaiz() {
		return getDiscriminante() == 0; // Si el discriminante es cero, hay una sola solución real
	}

	// Método que calcula y muestra las posibles soluciones de la ecuación
	public void calcular() {
		if (tieneRaices()) { // Si hay dos soluciones reales, las imprime
			obtenerRaices();
		} else if (tieneRaiz()) { // Si hay una única solución, la imprime
			obtenerRaiz();
		} else { // Si no hay soluciones reales, lo indica
			System.out.println("La ecuación no tiene solución real.");
		}
	}

	// Método que calcula e imprime las dos soluciones de la ecuación cuadrática
	public void obtenerRaices() {
		double discriminante = getDiscriminante(); // Obtiene el discriminante
		double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a); // Calcula la primera solución con la fórmula de
																	// Bhaskara
		double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a); // Calcula la segunda solución con la fórmula de
																	// Bhaskara
		System.out.println("Las soluciones son: " + raiz1 + " y " + raiz2); // Muestra ambas soluciones
	}

	// Método que calcula e imprime la única solución cuando el discriminante es
	// cero
	public void obtenerRaiz() {
		double raiz = -b / (2 * a); // Calcula la única raíz aplicando la fórmula de Bhaskara
		System.out.println("La única solución es: " + raiz); // Muestra la única solución
	}
}