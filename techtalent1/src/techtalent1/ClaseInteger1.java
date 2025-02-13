/**
 * 
 */
package techtalent1;

/**
 * 
 */
public class ClaseInteger1 {
	
	public static void main(String[] args) {
		
		//Creación de un objeto Integer usando el segundo constructor
				Integer num1=125;

				//Creación de un objeto Integer usando el primer constructor
				Integer num2=20;

				/*Obtención del entero que almacena cada objeto Integer,
				si no se hace esto, las líneas siguientes causarían error
				de complicación*/
				int n1=num1.intValue();
				int n2=num2.intValue();
				System.out.println("Suma de "+n1+" y "+n2+" vale "+(n1+n2));
				if(n1+n2>130)
					n1++;
				else
					n1--;
				System.out.println(n1);
	}
}