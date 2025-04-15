package ud09HerenciaEnJava.ejercicio02;

public class ej02videoJuego implements ej02entregable {

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	private static final int HORAS_DEFECTO = 10;
	private static final boolean ENTREGADO_DEFECTO = false;

	public ej02videoJuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}

	public ej02videoJuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}

	public ej02videoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setTitulo(String nuevoTitulo) {
		this.titulo = nuevoTitulo;
	}

	public void setHorasEstimadas(int nuevoHorasEstimadas) {
		this.horasEstimadas = nuevoHorasEstimadas;
	}

	public void setGenero(String nuevoGenero) {
		this.genero = nuevoGenero;
	}

	public void setCompañia(String nuevaCompañia) {
		this.compañia = nuevaCompañia;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + "\nHoras estimadas: " + horasEstimadas + "\nEntregado: " + entregado + "\nGénero: "
				+ genero + "\nCompañía: " + compañia + "\n";

	}

	@Override
	public void entregar() {
		entregado = true;
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
		if (a instanceof ej02videoJuego) { // Se verifica que el objeto es de tipo ej02videoJuego
			ej02videoJuego otro = (ej02videoJuego) a; // Se hace un casting del objeto para poder acceder a sus métodos
			return Integer.compare(this.horasEstimadas, otro.getHorasEstimadas()); // Se compara el número de horas
																					// estimadas y se devuelve el
																					// resultado
		}
		return 0;
	}

}