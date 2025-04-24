package ud09HerenciaEnJava.ejercicio05;

import java.util.Random;

class ej05profesor extends ej05persona {
	private String materia;

	public ej05profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	public boolean estaDisponible() {
		return new Random().nextDouble() > 0.2; // 20% de probabilidad de no estar disponible
	}

	public String getMateria() {
		return materia;
	}
}
