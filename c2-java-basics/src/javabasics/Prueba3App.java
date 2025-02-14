package javabasics;

public class Prueba3App {

	public static void main(String[] args) {
	
		final double IVA = 0.18;//Creo una constante que no podrá cambiarla en la ejecución.
		int producto = 300;
		
		double resultado = producto*IVA;
		
		System.out.println("El IVA del producto es "+resultado);
		
	}

}
