package ud04JavaBasicsEjercicios;

public class ej02variablesApp {

	public static void main(String[] args) {
		//Declaración y asignación de variables
		int N = 10;
		double A = 5.75;
		char C = 'X'; 
		
		//Imprimir los valores en la consola
		
		System.out.println("El valor de N es: "+N);
		System.out.println("El valor de A es: "+A);
		System.out.println("El valor de C es: "+C);
		
		System.out.println("Suma N + A = "+ (N+A));
		System.out.println("Resta A - N = " + (A-N));
		System.out.println("Valor numérico de C = "+ (int) C); //Conversión de String a ASCII
		
	}

}
