package ej01ventana;

import javax.swing.*;

public class ej01 {

	public static void main(String[] args) {
		// Crear la ventana
		JFrame ventana = new JFrame("Mi primera ventana con Swing");

		// Comportamiento al cerrar
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Crear una etiqueta
		JLabel etiqueta = new JLabel("¡Hola, esta es una etiqueta!", SwingConstants.CENTER);

		// Añadir la etiqueta a la ventana
		ventana.add(etiqueta);

		// Tamaño inicial de la ventana
		ventana.setSize(400, 200);

		// Permitir redimensionamiento
		ventana.setResizable(true);

		// Centrar la ventana en pantalla
		ventana.setLocationRelativeTo(null);

		// Mostrar la ventana
		ventana.setVisible(true);
	}
}