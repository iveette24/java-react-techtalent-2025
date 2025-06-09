package com.mastermind.ui;

import javax.swing.*;

public class MasterMindUI extends JFrame {
	private String usuario;
	private int jugador;

	public MasterMindUI(String usuario, int jugador) {
		this.usuario = usuario;
		this.jugador = jugador;

		setTitle("MasterMind - Jugador " + jugador);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.add(new JLabel("Bienvenido, " + usuario + ". Eres el Jugador " + jugador));
		add(panel);

		setVisible(true);
	}
}