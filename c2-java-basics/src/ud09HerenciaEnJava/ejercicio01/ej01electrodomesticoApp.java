package ud09HerenciaEnJava.ejercicio01;

public class ej01electrodomesticoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ej01electrodomestico electrodomestico1 = new ej01electrodomestico();
		System.out.println("Electrodomestico 1:");
		System.out.println(electrodomestico1);
		System.out.println("Precio final: " + electrodomestico1.precioFinal() + " €");

		ej01electrodomestico electrodomestico2 = new ej01electrodomestico(150, 7);
		System.out.println("\nElectrodomestico 2:");
		System.out.println(electrodomestico2);
		System.out.println("Precio final: " + electrodomestico2.precioFinal() + " €");

		ej01electrodomestico electrodomestico3 = new ej01electrodomestico(200, 8, "azul", 'A');
		System.out.println("\nElectrodomestico 3:");
		System.out.println(electrodomestico3);
		System.out.println("Precio final: " + electrodomestico3.precioFinal() + " €");

		ej01lavadora lavadora1 = new ej01lavadora();
		System.out.println("\nLavadora 1:");
		System.out.println(lavadora1);
		System.out.println("Precio final: " + lavadora1.precioFinal() + " €");

		ej01lavadora lavadora2 = new ej01lavadora(150, 7);
		System.out.println("\nLavadora 2:");
		System.out.println(lavadora2);
		System.out.println("Precio final: " + lavadora2.precioFinal() + " €");

		ej01lavadora lavadora3 = new ej01lavadora(40, 200, 8, "azul", 'A');
		System.out.println("\nLavadora 3:");
		System.out.println(lavadora3);
		System.out.println("Precio final: " + lavadora3.precioFinal() + " €");

		ej01television television1 = new ej01television();
		System.out.println("\nTelevisión 1:");
		System.out.println(television1);
		System.out.println("Precio final: " + television1.precioFinal() + " €");

		ej01television television2 = new ej01television(150, 7);
		System.out.println("\nTelevisión 2:");
		System.out.println(television2);
		System.out.println("Precio final: " + television2.precioFinal() + " €");

		ej01television television3 = new ej01television(50, true, 200, 8, "azul", 'A');
		System.out.println("\nTelevisión 3:");
		System.out.println(television3);
		System.out.println("Precio final: " + television3.precioFinal() + " €");

	}

}