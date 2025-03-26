package ud08POOenJava;

import java.io.PrintStream;

public class EmpleadoApp {

	public static void main(String[] args) {
		
//		Empleado empleado1 = new Empleado("Fernando", "Ureña", 23, 800);
//		// Devolverá false
//		// El sueldo que en caso de ser true sería añadido, tendría un valor de 30 euros
//		System.out.println(empleado1.plus(30));

		// Creamos un array de objetos de la clase Empleado
		Empleado arrayObjetos[] = new Empleado[3];

		// Creamos objetos en cada posición del array
		arrayObjetos[0] = new Empleado("Fernando", "Ureña", 23, 1000);
		arrayObjetos[1] = new Empleado("Juan", "Perez", 45, 1200);
		arrayObjetos[2] = new Empleado("Maria", "Lopez", 33, 1500);

		
		
		
		
		// Recorremos el array y aplicamos el plus a cada objeto

		int suma = 0;
		for (int i = 0; i < arrayObjetos.length; i++) {
			suma += arrayObjetos[i].getSalario();
		}
		System.out.println("La suma de los salarios es: " + suma);
	
		// Añadimos un plus a cada empleado
		for (int i = 0; i < arrayObjetos.length; i++) {
			if (arrayObjetos[i].plus(30)) {
				System.out.println("Se ha añadido un plus al empleado " + arrayObjetos[i].getNombre());
			} else {
				System.out.println("No se ha añadido un plus al empleado " + arrayObjetos[i].getNombre());
			}
		}
		
		System.out.println("La suma de los salarios con el plus es: " + suma);
		
		// Mostramos los datos de los empleados
		for (int i = 0; i < arrayObjetos.length; i++) {
			System.out.println("Nombre: " + arrayObjetos[i].getNombre() + " Apellido: " + arrayObjetos[i].getApellido()
					+ " Edad: " + arrayObjetos[i].getEdad() + " Salario: " + arrayObjetos[i].getSalario());
		}
		
	}
	

}
