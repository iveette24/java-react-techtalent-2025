package ud09HerenciaEnJava.ejercicio05;

import java.util.Random;

public class ej05estudiante extends ej05persona {
	private int calificacion;

	public ej05estudiante(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}

	public boolean estaPresente() {
		return new Random().nextDouble() > 0.5; // 50% de probabilidad de hacer novillos
	}

	public int getCalificacion() {
		return calificacion;
	}

	public String getSexo() {
		return sexo;
	}
}
