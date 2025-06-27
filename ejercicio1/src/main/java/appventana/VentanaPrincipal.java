package appventana;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
		super ("EJERCICIO 1");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true); //Permite cambiar el tamaño de la ventana
		
		JLabel etiqueta = new JLabel("Hola, Ivette! Esta es tu primera ventana 😊", SwingConstants.CENTER);
		add (etiqueta); // Agrega la etiqueta a la ventana
		
		setVisible(true); // Hace visible la ventana
	}

	public static void main(String[] args) {
		new VentanaPrincipal(); // Crea una instancia de VentanaPrincipal
	}

}
