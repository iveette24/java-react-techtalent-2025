package ud09HerenciaEnJava;

import javax.swing.JOptionPane;

public class ej01electrodomestico {

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

	private static final String COLOR_DEFECTO = "Blanco";
	private static final char CONSUMO_DEFECTO = 'F';
	private static final double PRECIO_DEFECTO = 100.0;
	private static final double PESO_DEFECTO = 5.0;

	public ej01electrodomestico() {
		this.precioBase = PRECIO_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}

	public ej01electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
	}

	public ej01electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public void escogerColor() {

		String[] opciones = { "Blanco", "Negro", "Rojo", "Azul" };
		int opcion = JOptionPane.showOptionDialog(null, "Selecciona el color:", "COLOR", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		switch (opcion) {
		case 0:
			this.color = "Blanco";
			break;
		case 1:
			this.color = "Negro";
			break;
		case 2:
			this.color = "Rojo";
			break;
		case 3:
			this.color = "Azul";
			break;

		}

	}

	public String getColor() {
		return color;
	}

	public double getprecioBase() {
		return precioBase;
	}

	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getpeso() {
		return peso;
	}
}