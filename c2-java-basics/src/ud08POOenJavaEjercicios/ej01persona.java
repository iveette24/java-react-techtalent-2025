
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

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void pordefecto() {
		System.out.println("Datos de la persona por defecto: ");
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: "
				+ peso + "\nAltura: " + altura);
	}

	public void dosparametros() {
		System.out.println("Datos de la persona con dos parámetros: ");
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: "
				+ peso + "\nAltura: " + altura);
	}
}
