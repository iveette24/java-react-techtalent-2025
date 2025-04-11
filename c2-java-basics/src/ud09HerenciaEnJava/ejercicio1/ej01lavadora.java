package ud09HerenciaEnJava.ejercicio1;

public class ej01lavadora extends ej01electrodomestico {

	private static final double CARGA_DEFAULT = 5;

	// Atributo
	private double carga;

	// Constructores
	public ej01lavadora() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.peso = PESO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.carga = CARGA_DEFAULT;
	}

	public ej01lavadora(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
//		super(precioBase, peso);
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.carga = CARGA_DEFAULT;
	}

	public ej01lavadora(double carga, double precioBase, double peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	// Método get de carga
	public double getCarga() {
		return carga;
	}

	// Método precioFinal()
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		// Equivalente a TODO lo que hay en Electrodomesticos
//		double precioFinal = precioBase;
//
//		switch (consumoEnergetico) {
//		case 'A':
//			precioFinal += 100;
//			break;
//		case 'B':
//			precioFinal += 80;
//			break;
//		case 'C':
//			precioFinal += 60;
//			break;
//		case 'D':
//			precioFinal += 50;
//			break;
//		case 'E':
//			precioFinal += 30;
//			break;
//		case 'F':
//			precioFinal += 10;
//			break;
//		}
//
//		if (peso >= 0 && peso < 20) {
//			precioFinal += 10;
//		} else if (peso >= 20 && peso < 50) {
//			precioFinal += 50;
//		} else if (peso >= 50 && peso < 80) {
//			precioFinal += 80;
//		} else if (peso >= 80) {
//			precioFinal += 100;
//		}
//		return precioFinal;

		if (carga > 30) {
			precioFinal += 50;
		}

		return precioFinal;
	}

	@Override
	public String toString() {
		return "Precio base: " + precioBase + " €\nColor: " + color + "\nConsumo energético: " + consumoEnergetico
				+ "\nPeso: " + peso + " kg" + "\nCarga: " + carga + " kg";
	}

}
