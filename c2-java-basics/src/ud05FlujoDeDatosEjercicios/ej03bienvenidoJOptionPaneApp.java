package ud05FlujoDeDatosEjercicios;

import javax.swing.JOptionPane;

public class ej03bienvenidoJOptionPaneApp {

	public static void main(String[] args) {
		String a= JOptionPane.showInputDialog("Introduce tu nombre: ");
		//Declaro una variable string, que se abrirá en un panel editable.
		
		JOptionPane.showMessageDialog(null, "Bien, tu nombre es "+a+", bienvenido/a "+a);
		
	}

}
