package ud09HerenciaEnJava.ejercicio05;

import java.util.Random;

public class ej05estudiante extends ej05persona {
	private int calificacion;

	public ej05estudiante(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo); // Se pone super para llamar al constructor de la clase padre
		this.calificacion = calificacion;
	}

	public boolean estaPresente() {
		boolean estaPresente = new Random().nextDouble() > 0.5; // 50% de probabilidad de hacer novillos
		System.out.println("¿El estudiante " + getNombre() + " está presente? " + estaPresente);
		return estaPresente;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public String getSexo() {
		return sexo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Calificación: " + calificacion;
	} // se pone el toString para que al imprimir el objeto se imprima lo que se
}
