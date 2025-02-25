package métodosyarraysejercicios;

import java.util.Scanner;

public class Ejercicio1App {

	public static void main(String[] args) {
		// Repetirlo hecho por mi

		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione la figura para calcular su área:");
		System.out.println("1. Círculo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Triángulo");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Introduzca el radio del círculo:");
			double radius = scanner.nextDouble();
			System.out.println("El área del círculo es: " + calculateCircleArea(radius));
			break;
		case 2:
			System.out.println("Introduzca el lado del cuadrado:");
			double side = scanner.nextDouble();
			System.out.println("El área del cuadrado es: " + calculateSquareArea(side));
			break;
		case 3:
			System.out.println("Introduzca la base del triángulo:");
			double base = scanner.nextDouble();
			System.out.println("Introduzca la altura del triángulo:");
			double height = scanner.nextDouble();
			System.out.println("El área del triángulo es: " + calculateTriangleArea(base, height));
			break;
		default:
			System.out.println("Opción no válida.");
		}
		scanner.close();
	}

	public static double calculateCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static double calculateSquareArea(double side) {
		return Math.pow(side, 2);
	}

	public static double calculateTriangleArea(double base, double height) {
		return (base * height) / 2;
	}
}
