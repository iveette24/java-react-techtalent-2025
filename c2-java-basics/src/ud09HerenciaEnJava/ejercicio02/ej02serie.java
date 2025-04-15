package ud09HerenciaEnJava.ejercicio02;

public class ej02serie implements ej02entregable {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	private static final int TEMPORADAS_DEFECTO = 3;
	private static final boolean ENTREGADO_DEFECTO = false;

	public ej02serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}

	public ej02serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}

	public ej02serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String nuevoTitulo) {
		this.titulo = nuevoTitulo;
	}

	public void setTemporadas(int nuevaTemporadas) {
		this.temporadas = nuevaTemporadas;
	}

	public void setGenero(String nuevoGenero) {
		this.genero = nuevoGenero;
	}

	public void setCreador(String nuevoCreador) {
		this.creador = nuevoCreador;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + "\nTemporadas: " + temporadas + "\nEntregado: " + entregado + "\nGénero: " + genero
				+ "\nCreador: " + creador + "\n";

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
		if (a instanceof ej02serie) {
			ej02serie otra = (ej02serie) a;
			return Integer.compare(this.temporadas, otra.getTemporadas());
		}
		return 0;
	}

}