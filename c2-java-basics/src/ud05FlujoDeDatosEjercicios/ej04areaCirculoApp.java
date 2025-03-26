package ud05FlujoDeDatosEjercicios;

import java.util.Scanner;

public class ej04areaCirculoApp {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		//Creo un scanner para el radio
		System.out.println("Introduce el radio del círculo: ");
		//Se guarda en texto automáticamente
		String radiostr = r.nextLine();
		//Convertimos el string a double con el parse
		double radio = Double.parseDouble(radiostr);
		//Cerramos el scanner
		r.close();
		//Impresión del área con el math.pow que lo eleva a 2
		System.out.println("El àrea del círculo es: "+(Math.PI*Math.pow(radio, 2)));
		
	}
	
}