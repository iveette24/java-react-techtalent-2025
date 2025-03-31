
package ud08POOenJavaEjercicios;

public class ej01persona {

	// Propiedades de la clase, llamadas atributos
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;

	final char SEXO_DEFECTO = 'H';

	public ej01persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = SEXO_DEFECTO;
		this.peso = 0;
		this.altura = 0;
	}

	public ej01persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public ej01persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	public void pordefecto() {
		System.out.println("\nDatos de "+nombre+": ");
		System.out.println("Edad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: "
				+ peso + "\nAltura: " + altura);
	}


}
