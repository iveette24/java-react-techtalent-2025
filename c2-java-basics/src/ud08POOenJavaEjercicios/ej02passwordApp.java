package ud08POOenJavaEjercicios;

import java.util.Scanner;

public class ej02passwordApp {

	public static void main(String[] args) {
		int longitud = 0;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		ej02password passwordDefecto = new ej02password();
		System.out.println("Contraseña por defecto: " + passwordDefecto.getContraseña());
		while (continuar) {
			System.out.println("Introduce la cantidad de dígitos que quieres en tu contraseña: ");
			longitud = sc.nextInt();
			if (longitud < 8) {
				System.out.println("El valor es menor que 8, vuelve intentarlo.");
			} else {
				continuar = false;
			}
		}
		ej02password passwordPersonalizada = new ej02password(longitud);
		System.out.println("Contraseña personalizada: " + passwordPersonalizada.getContraseña());
		sc.close();
	}
}
