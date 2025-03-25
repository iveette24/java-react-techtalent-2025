package ud08POOenJava;

public class App01persona {

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	

	public App01persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;

	}
	
	public App01persona(String nombre,int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;

	}
	
	public App01persona(String nombre,int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;

	}
	
	public void pordefecto () {
		System.out.println("Datos de la persona por defecto: ");
		System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+DNI+"\nSexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura);

		
	}
	
	public void dosparametros () {
		System.out.println("Datos de la persona por defecto: ");
		System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+DNI+"\nSexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura);

		
	}
	
	
}
