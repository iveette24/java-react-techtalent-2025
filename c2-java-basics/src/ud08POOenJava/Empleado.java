package ud08POOenJava;

public class Empleado {
	private static final double SALARIO_DEF = 0;
	// Propiedades de la clase, llamadas atributos

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	public Empleado() {
//		this.nombre = "";
//		this.apellido = "";
//		this.edad = 0;
//		this.salario = 0;
//		this ("","",0,0);         Es exactamente lo mismo que lo anterior
		this("", "", 0, SALARIO_DEF);
	}

	public Empleado(String nombre, String apellido) {
		this(nombre, apellido, 0, SALARIO_DEF);
	}

	public Empleado(String nombre, String apellido, int edad) {
//		this(nombre, apellido, edad, 0);
		this(nombre, apellido, edad, SALARIO_DEF);
	}

	// No es un constructor por defecto, porque tiene 4 parámetros

	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	// Método que suma un plus al salario del empleado si el empleado tiene más de
	// 40 años

	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (edad > 40) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}

	public boolean plus(double sueldoPlus, double retencion) {
		boolean aumento = false;
		if (edad > 40 /* && compruebaNombre() */) {
			salario += sueldoPlus - (sueldoPlus * retencion);
			aumento = true;
		}
		return aumento;
	}

	/*
	 * private boolean compruebaNombre() { if (nombre.equals("Fernando")) { return
	 * false; } return true; }
	 */

	// Constructor por defecto, que es un método especial invocado al crear un nuevo
	// objeto de la clase, se usa para inicializar atributos
	// La variable this se usa para diferenciar un atributo de una variable normal

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}
	
	

}
