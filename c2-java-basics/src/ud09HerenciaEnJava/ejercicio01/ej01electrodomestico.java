package ud09HerenciaEnJava.ejercicio01;

import java.util.Arrays;
import java.util.List;

public class ej01electrodomestico {
	// Constantes
	protected static final List<String> COLORES_DISPONIBLES = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
	protected static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
	protected static final double PRECIO_BASE_DEFAULT = 100;
	protected static final double PESO_DEFAULT = 5;
	protected static final String COLOR_DEFAULT = "blanco";

	// Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Constructores
	public ej01electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.peso = PESO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;

	}

	public ej01electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
	}

	public ej01electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);

	}

	// Métodos get
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// Métodos
	private char comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		if (letra >= 'A' && letra <= 'F') {
			return letra;
		} else {
			return CONSUMO_ENERGETICO_DEFAULT;
		}
	}

	private String comprobarColor(String color) {
		if (COLORES_DISPONIBLES.contains(color.toLowerCase())) {
			return color.toLowerCase();
		} else {
			return COLOR_DEFAULT;
		}
	}

	public double precioFinal() {
		double precioFinal = precioBase;

		switch (consumoEnergetico) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso < 20) {
			precioFinal += 10;
		} else if (peso >= 20 && peso < 50) {
			precioFinal += 50;
		} else if (peso >= 50 && peso < 80) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}

		// Equivalente a la anterior implementación
//		if (peso >= 80) {
//			precioFinal += 100;
//		} else if (peso >= 50) {
//			precioFinal += 80;
//		} else if (peso >= 20) {
//			precioFinal += 50;
//		} else if (peso >= 0) {
//			precioFinal += 10;
//		}

		return precioFinal;
	}

	@Override
	public String toString() {
		return "Precio base: " + precioBase + " €\nColor: " + color + "\nConsumo energético: " + consumoEnergetico
				+ "\nPeso: " + peso + " kg";
	}

}