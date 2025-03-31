package ud08POOenJavaEjercicios;

import java.util.Scanner;

public class ej02passwordApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ej02password passwordDefecto = new ej02password();
		System.out.println("Contraseña por defecto: " + passwordDefecto.getContraseña());
		System.out.println("Introduce la cantidad de dígitos que quieres en tu contraseña: ");
		int longitud = sc.nextInt();
		ej02password passwordPersonalizada = new ej02password(longitud); 
		System.out.println("Contraseña personalizada: " + passwordPersonalizada.getContraseña());
		sc.close();
	}
}