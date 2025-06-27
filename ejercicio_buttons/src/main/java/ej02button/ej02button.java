package ej02button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ej02button {
	private static int contadorBoton1 = 0;
	private static int contadorBoton2 = 0;

	public static void main(String[] args) {
		// Crear ventana
		JFrame ventana = new JFrame("Contador de botones");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(400, 200);
		ventana.setLayout(new GridLayout(2, 2)); // 2x2 grid
		ventana.setLocationRelativeTo(null); // Centrar

		// Crear etiquetas
		JLabel etiqueta1 = new JLabel("Botón 1 presionado: 0 veces");
		JLabel etiqueta2 = new JLabel("Botón 2 presionado: 0 veces");

		// Crear botones
		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");

		// Agregar acciones a los botones
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorBoton1++;
				etiqueta1.setText("Botón 1 presionado: " + contadorBoton1 + " veces");
			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorBoton2++;
				etiqueta2.setText("Botón 2 presionado: " + contadorBoton2 + " veces");
			}
		});

		// Agregar componentes a la ventana
		ventana.add(etiqueta1);
		ventana.add(boton1);
		ventana.add(etiqueta2);
		ventana.add(boton2);

		// Mostrar ventana
		ventana.setVisible(true);
	}
}