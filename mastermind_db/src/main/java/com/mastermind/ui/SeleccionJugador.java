package com.mastermind.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import com.mastermind.ui.MasterMindUI;

public class SeleccionJugador extends JFrame {
	private String usuario;

	public SeleccionJugador(String usuario) {
		this.usuario = usuario;
		setTitle("Seleccionar Jugador");
		setSize(300, 200);
		setLayout(new FlowLayout());

		add(new JLabel("Selecciona tu rol, " + usuario + ":"));

		JButton jugador1Button = new JButton("Jugador 1");
		JButton jugador2Button = new JButton("Jugador 2");

		add(jugador1Button);
		add(jugador2Button);

		jugador1Button.addActionListener((ActionEvent e) -> iniciarJuego(1));
		jugador2Button.addActionListener((ActionEvent e) -> iniciarJuego(2));

		setVisible(true);
	}

	private void iniciarJuego(int jugador) {
		dispose(); // Cierra la ventana de selección

		// Inicia el juego con el rol seleccionado
		new main();
	}
}