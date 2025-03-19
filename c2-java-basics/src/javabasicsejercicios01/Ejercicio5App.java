package javabasicsejercicios01;

public class Ejercicio5App {

	public static void main(String[] args) {
		int A1 = 4;
		int B1 = 5;
		int C1 = 8;
		int D1 = 11;
		int A = A1;
		int B = B1;
		int C = C1;
		int D = D1;
		//Defino unas variables
		
		System.out.println("Valor de cada variable => "+"A="+A+"; B="+B+"; C="+C+"; D="+D+";");
		 //B toma el valor de C
		B = C1;
		System.out.println("B toma el valor de C => "+ B);
		
		 //C toma el valor de A
		C = A1;
		System.out.println("C toma el valor de A => "+ C);
		
		 //A toma el valor de D
		A = D1;
		System.out.println("A toma el valor de D => "+ A);
		
		 //D toma el valor de B
		D = B1;
		System.out.println("D toma el valor de B => "+ D);
		
		//Valores finales
		System.out.println("Valor de cada variable => "+"A="+A+"; B="+B+"; C="+C+"; D="+D+";");
		
		
	}

}
