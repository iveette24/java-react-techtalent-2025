package ud09HerenciaEnJava;

public class ej04serie {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	private static final int TEMPORADAS_DEFECTO = 3;
	private static final boolean ENTREGADO_DEFECTO = false;

	public ej04serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}

	public ej04serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}

	public ej04serie(String titulo, int temporadas, String genero, String creador) {
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

	public void datosSerie() {
		System.out.println("Título: " + titulo + "\nTemporadas: " + temporadas + "\nEntregado: " + entregado
				+ "\nGénero: " + genero + "\nCreador: " + creador + "\n");
	}

}