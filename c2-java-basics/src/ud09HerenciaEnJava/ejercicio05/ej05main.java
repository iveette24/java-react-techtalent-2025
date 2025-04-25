package ud09HerenciaEnJava.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ej05main {
	public static void main(String[] args) {
		String[] nombres = { "Carlos", "Ana", "Luis", "María", "Jorge", "Laura", "Pedro", "Elena" };
		String[] materias = { "Matemáticas", "Filosofía", "Física" };

		List<ej05estudiante> estudiantes = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			estudiantes.add(new ej05estudiante(nombres[random.nextInt(nombres.length)], random.nextInt(4) + 15,
					random.nextBoolean() ? "M" : "F", random.nextInt(11)));
		}

		ej05profesor profesor = new ej05profesor("Profesor X", 40, "M", "Matemáticas");

		ej05aula aula = new ej05aula(101, 10, "Matemáticas");
		aula.asignarProfesor(profesor);
		aula.asignarEstudiantes(estudiantes);
		aula.mostrarResultados();

		System.out.println("\nClase de " + materias[random.nextInt(materias.length)]);
		System.out.println("Profesor: " + profesor.getNombre());
		System.out.println("Número de estudiantes: " + estudiantes.size());
		System.out.println("Datos de los estudiantes:");
		for (ej05estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	}
}
