package javabasicsejercicios;

public class Ejercicio5App {

	public static void main(String[] args) {
		int A = 4;
		int B = 5;
		int C = 8;
		int D = 11;
		//Defino unas variables
		
		System.out.println("Valor de cada variable => "+"A="+A+"; B="+B+"; C="+C+"; D="+D+";");
		 //B toma el valor de C
		B = C;
		System.out.println("B toma el valor de C => "+ B);
		
		 //C toma el valor de A
		C = A;
		System.out.println("C toma el valor de A => "+ C);
		
		 //A toma el valor de D
		A = D;
		System.out.println("A toma el valor de D => "+ A);
		
		 //D toma el valor de B
		D = B;
		System.out.println("D toma el valor de B => "+ D);
		
		//Valores finales
		System.out.println("Valor de cada variable => "+"A="+A+"; B="+B+"; C="+C+"; D="+D+";");
		
		
	}

}
