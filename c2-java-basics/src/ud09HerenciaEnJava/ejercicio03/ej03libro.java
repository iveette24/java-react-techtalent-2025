package ud09HerenciaEnJava.ejercicio03;

public class ej03libro {
	String ISBN;
	String titulo;
	String autor;
	int numPaginas;

	// Métodos getter
	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	// Métodos setter
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por " + autor + ", tiene " + numPaginas
				+ " páginas.";
	}

}
