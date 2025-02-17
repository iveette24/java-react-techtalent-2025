package flujodedatos;

import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		String a= JOptionPane.showInputDialog("Introduce tu nombre: ");
		//Declaro una variable string, que se abrirá en un panel editable.
		
		JOptionPane.showMessageDialog(null, "Bien, tu nombre es "+a+", bienvenido/a "+a);
		
	}

}
