package ud09HerenciaEnJava.ejercicio02;

public class ej02main {

	public static void main(String[] args) {
		ej02serie[] Serie = new ej02serie[5];
		ej02videoJuego[] VideoJuego = new ej02videoJuego[5];

		Serie[0] = new ej02serie();
		Serie[1] = new ej02serie("Stranger Things", "Duffer Brothers");
		Serie[2] = new ej02serie("The Office", 9, "Comedia", "Greg Daniels");
		Serie[3] = new ej02serie("Game of Thrones", 8, "Fantasía", "George R.R. Martin");
		Serie[4] = new ej02serie("Sherlock", 4, "Misterio", "Mark Gatiss");

		VideoJuego[0] = new ej02videoJuego();
		VideoJuego[1] = new ej02videoJuego("The Witcher 3", 100);
		VideoJuego[2] = new ej02videoJuego("Minecraft", 500, "Sandbox", "Mojang");
		VideoJuego[3] = new ej02videoJuego("Red Dead Redemption 2", 80, "Acción", "Rockstar");
		VideoJuego[4] = new ej02videoJuego("Super Mario Odyssey", 20, "Plataforma", "Nintendo");

		VideoJuego[0].entregar();
		VideoJuego[2].entregar();
		Serie[2].entregar();
		Serie[4].entregar();

		System.out.println("SERIES DISPONIBLES: ");
		for (ej02serie serie : Serie) {
			System.out.println(serie + "\n");
		}

		System.out.println("VIDEOJUEGOS DISPONIBLES: ");
		for (ej02videoJuego videojuego : VideoJuego) {
			System.out.println(videojuego + "\n");
		}

		int entregadosSeries = 0;
		int entregadosVideojuegos = 0;

		for (ej02serie serie : Serie) {
			if (serie.isEntregado()) {
				entregadosSeries++;
				serie.devolver();
				System.out.println("La serie " + serie.getTitulo() + " ha sido devuelta. \n");
			}

		}

		for (ej02videoJuego videojuego : VideoJuego) {
			if (videojuego.isEntregado()) {
				entregadosVideojuegos++;
				videojuego.devolver();
				System.out.println("El videojuego " + videojuego.getTitulo() + " ha sido devuelto. \n");
			}

		}

		System.out.println("Series entregadas: " + entregadosSeries);
		System.out.println("Videojuegos entregados: " + entregadosVideojuegos);

		// Encontrar el videojuego con más horas y la serie con más temporadas
		ej02serie serieMasLarga = Serie[0];
		ej02videoJuego juegoMasLargo = VideoJuego[0];

		for (ej02serie serie : Serie) {
			if (serie.compareTo(serieMasLarga) > 0) {
				serieMasLarga = serie;
			}
		}
		for (ej02videoJuego videojuego : VideoJuego) {
			if (videojuego.compareTo(juegoMasLargo) > 0) {
				juegoMasLargo = videojuego;
			}
		}

		// Mostrar el resultado
		System.out.println("\nSerie con más temporadas: \n" + serieMasLarga.getTitulo() + " con "
				+ serieMasLarga.getTemporadas() + " temporadas.");
		System.out.println("\nVideojuego con más horas estimadas: \n" + juegoMasLargo.getTitulo() + " con "
				+ juegoMasLargo.getHorasEstimadas() + " h.");
	}
}
