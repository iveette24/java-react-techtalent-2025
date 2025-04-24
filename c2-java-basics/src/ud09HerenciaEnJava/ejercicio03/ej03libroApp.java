package ud09HerenciaEnJava.ejercicio03;

public class ej03libroApp {
	public static void main(String[] args) {
		// Crear dos instancias de ej03libro con valores personalizados
		ej03libro libro1 = new ej03libro();
		libro1.setISBN("978-84-376-0494-7");
		libro1.setTitulo("Don Quijote de la Mancha");
		libro1.setAutor("Miguel de Cervantes");
		libro1.setNumPaginas(863);

		ej03libro libro2 = new ej03libro();
		libro2.setISBN("978-0-452-28423-4");
		libro2.setTitulo("1984");
		libro2.setAutor("George Orwell");
		libro2.setNumPaginas(328);

		// Mostrar información de los libros
		System.out.println(libro1);
		System.out.println(libro2);

		ej03libro libroMasPaginas;

		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			libroMasPaginas = libro1;
		} else {
			libroMasPaginas = libro2;
		}
		System.out.println("\nEl libro con más páginas es:");
		System.out.println(libroMasPaginas.getTitulo());

	}

}