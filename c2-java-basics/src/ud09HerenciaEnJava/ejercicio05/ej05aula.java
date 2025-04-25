package ud09HerenciaEnJava.ejercicio05;

import java.util.ArrayList;
import java.util.List;

class ej05aula {
	private int identificador;
	private int maxEstudiantes;
	private String materia;
	private List<ej05estudiante> estudiantes;
	private ej05profesor profesor;

	public ej05aula(int identificador, int maxEstudiantes, String materia) {
		this.identificador = identificador;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.estudiantes = new ArrayList<>();
	}

	public void asignarProfesor(ej05profesor profesor) {
		if (profesor.getMateria().equals(this.materia)) {
			this.profesor = profesor;
		}
	}

	public void asignarEstudiantes(List<ej05estudiante> estudiantes) {
		this.estudiantes = estudiantes.subList(0, Math.min(estudiantes.size(), maxEstudiantes));
	}

	public boolean puedeDarseClase() {
		if (profesor == null || !profesor.estaDisponible()) {
			return false;
		}
		long estudiantesPresentes = estudiantes.stream().filter(ej05estudiante::estaPresente).count();
		return estudiantesPresentes > (maxEstudiantes / 2);
	}

	public void mostrarResultados() {
		if (puedeDarseClase()) {
			long aprobadosHombres = estudiantes.stream()
					.filter(e -> e.getSexo().equals("M") && e.getCalificacion() >= 5).count();
			long aprobadosMujeres = estudiantes.stream()
					.filter(e -> e.getSexo().equals("F") && e.getCalificacion() >= 5).count();
			
			System.out.println("Clase impartida en el aula " + identificador);
			System.out.println("Hombres aprobados: " + aprobadosHombres);
			System.out.println("Mujeres aprobadas: " + aprobadosMujeres);
		} else {
			System.out.println("No se pudo impartir la clase en el aula " + identificador);
		}
	}
}
