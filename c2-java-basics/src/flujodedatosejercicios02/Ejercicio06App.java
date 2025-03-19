package flujodedatosejercicios02;

import java.util.Scanner;

public class Ejercicio06App {
	//Definir la constante del IVA
	public static final double IVA = 0.21;

	public static void main(String[] args) {
		
		//Creamos un scanner
		Scanner pr = new Scanner(System.in);
		
		//Solicitamos que ingrese el precio
		System.out.println("Ingrese el precio del producto: ");
		//Gracias a esto se lee en tipo double directamente
		double precio = pr.nextDouble();
		
		//Calculamos el precio final con el IVA
		System.out.println("El precio final con el IVA es:"+(precio+(precio*IVA)));
		
		//Cerramos el scanner pr
		pr.close();
		
	}
}