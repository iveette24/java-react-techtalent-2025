package com.mastermind.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import com.mastermind.db.ConexionDB;

public class Registro extends JFrame {
	private JTextField usuarioField;
	private JPasswordField passwordField;
	private JButton registrarButton;
	private JLabel mensajeLabel;

	public Registro() {
		setTitle("Registro - MasterMind");
		setSize(300, 200);
		setLayout(new FlowLayout());

		add(new JLabel("Usuario:"));
		usuarioField = new JTextField(15);
		add(usuarioField);

		add(new JLabel("Contraseña:"));
		passwordField = new JPasswordField(15);
		add(passwordField);

		registrarButton = new JButton("Registrar");
		add(registrarButton);

		mensajeLabel = new JLabel(" ");
		add(mensajeLabel);

		registrarButton.addActionListener(this::registrarUsuario);

		setVisible(true);
	}

	private void registrarUsuario(ActionEvent e) {
		String usuario = usuarioField.getText();
		String password = new String(passwordField.getPassword());

		// Validación de campos vacíos
		if (usuario.isEmpty() || password.isEmpty()) {
			mensajeLabel.setText("Usuario y contraseña no pueden estar vacíos.");
			return;
		}

		// Cifrado de contraseña con SHA-256
		String passwordHash = hashPassword(password);

		try (Connection conn = ConexionDB.conectar();
				PreparedStatement stmt = conn
						.prepareStatement("INSERT INTO usuarios (username, password) VALUES (?, ?)")) {

			if (conn == null) {
				mensajeLabel.setText("Error de conexión.");
				return;
			}

			stmt.setString(1, usuario);
			stmt.setString(2, passwordHash);
			stmt.executeUpdate();

			mensajeLabel.setText("¡Registro exitoso!");

			// Esperar un segundo y abrir la ventana de Login
			SwingUtilities.invokeLater(() -> {
				new Login(); // Abre nuevamente la pantalla de Login
				dispose(); // Cierra la ventana de Registro
			});

		} catch (SQLException ex) {
			mensajeLabel.setText("Error: Usuario ya existe.");
			ex.printStackTrace();
		}
	}

	private String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes());
			return Base64.getEncoder().encodeToString(hash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		new Registro();
	}
}