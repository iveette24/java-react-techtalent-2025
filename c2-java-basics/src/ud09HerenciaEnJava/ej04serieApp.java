package ud09HerenciaEnJava;

public class ej04serieApp {
	public static void main(String[] args) {
		ej04serie serie = new ej04serie();
		ej04serie serie1 = new ej04serie("Élite", "Carlos Montero Castiñeira");
		ej04serie serie2 = new ej04serie("Élite", 8, "Suspenso / Drama juvenil", "Carlos Montero Castiñeira");

		serie.datosSerie();
		serie1.datosSerie();
		serie2.datosSerie();

	}
}