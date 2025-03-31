package ud08POOenJavaEjercicios;

import java.util.Random;

public class ej02password {

	private int longitud;
	private String contraseña;

	// Constructor por defecto
	public ej02password() {
		this.longitud = 8; // Longitud por defecto
		this.contraseña = generarContraseña(longitud);
	}

	// Constructor con longitud específica
	public ej02password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}

	// Método para generar una contraseña aleatoria
	private String generarContraseña(int longitud) {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder contraseña = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < longitud; i++) {
			int aleatorio = random.nextInt(caracteres.length());
			contraseña.append(caracteres.charAt(aleatorio));
		}

		return contraseña.toString();
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
}