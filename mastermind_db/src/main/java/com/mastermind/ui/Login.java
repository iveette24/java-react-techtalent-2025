package com.mastermind.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mastermind.db.ConexionDB;

public class Login extends JFrame {
	private JTextField usuarioField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private JLabel mensajeLabel;

	public Login() {
		setTitle("Login - MasterMind");
		setSize(300, 200);
		setLayout(new FlowLayout());

		add(new JLabel("Usuario:"));
		usuarioField = new JTextField(15);
		add(usuarioField);

		add(new JLabel("Contraseña:"));
		passwordField = new JPasswordField(15);
		add(passwordField);

		loginButton = new JButton("Iniciar sesión");
		add(loginButton);

		JButton registroButton = new JButton("Registrarse");
		add(registroButton);

		mensajeLabel = new JLabel(" ");
		add(mensajeLabel);

		registroButton.addActionListener(e -> {
			new Registro(); // Abre la ventana de registro
			dispose(); // Cierra la ventana de login
		});

		loginButton.addActionListener(e -> autenticarUsuario());

		setVisible(true);
	}

	private void autenticarUsuario() {
		String usuario = usuarioField.getText();
		String password = new String(passwordField.getPassword());

		// Validación de campos vacíos
		if (usuario.isEmpty() || password.isEmpty()) {
			mensajeLabel.setText("Usuario y contraseña no pueden estar vacíos.");
			return;
		}

		try (Connection conn = ConexionDB.conectar();
				PreparedStatement stmt = conn
						.prepareStatement("SELECT * FROM usuarios WHERE username = ? AND password = ?")) {

			if (conn == null) {
				mensajeLabel.setText("Error de conexión.");
				return;
			}

			stmt.setString(1, usuario);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				mensajeLabel.setText("¡Login exitoso!");

				// Abrir pantalla de selección de jugador
				SwingUtilities.invokeLater(() -> new main());

				dispose(); // Cerrar la ventana de login
			} else {
				mensajeLabel.setText("Usuario o contraseña incorrectos.");
			}
		} catch (Exception e) {
			mensajeLabel.setText("Error en autenticación.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Login();
	}
}