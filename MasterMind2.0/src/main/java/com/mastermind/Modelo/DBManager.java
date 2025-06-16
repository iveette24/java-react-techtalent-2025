package com.mastermind.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	 private Connection conn;
	    public DBManager() throws SQLException {
	    	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    	}catch (ClassNotFoundException e) {
	    		System.out.println("No se encontro el driver MySQL");
	    		e.printStackTrace();
	    	}
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/masterminddb2", "root", "");
	       System.out.println("Conexion a MySQL exitosa");
	    }

	    public int registrarUsuario(String nombre) throws SQLException {
	        // try-with-resources para liberar recursos automáticamente
	        try (PreparedStatement ps = conn.prepareStatement(
	                "INSERT IGNORE INTO usuarios(nombre) VALUES (?)", Statement.RETURN_GENERATED_KEYS)) {
	            ps.setString(1, nombre);
	            ps.executeUpdate();
	            try (ResultSet rs = ps.getGeneratedKeys()) {
	                if (rs.next()) return rs.getInt(1);
	            }
	        }
	        // Si ya existe, obtener su id
	        try (PreparedStatement ps = conn.prepareStatement("SELECT id FROM usuarios WHERE nombre = ?")) {
	            ps.setString(1, nombre);
	            try (ResultSet rs = ps.executeQuery()) {
	                if (rs.next()) return rs.getInt(1);
	            }
	        }
	        return -1;
	    }

	    public void guardarPartida(int usuarioId, String combinacion, int intentos, int tiempo) throws SQLException {
	        try (PreparedStatement ps = conn.prepareStatement(
	                "INSERT INTO partidas(usuario_id, combinacion, intentos, tiempo_segundos) VALUES (?, ?, ?, ?)")) {
	            ps.setInt(1, usuarioId);
	            ps.setString(2, combinacion);
	            ps.setInt(3, intentos);
	            ps.setInt(4, tiempo);
	            ps.executeUpdate();
	        }
	    }

	    public ResultSet obtenerRanking() throws SQLException {
	        return conn.createStatement().executeQuery(
	            "SELECT u.nombre, MIN(p.intentos) AS mejor_intentos, MIN(p.tiempo_segundos) AS mejor_tiempo " +
	            "FROM partidas p JOIN usuarios u ON p.usuario_id = u.id " +
	            "GROUP BY usuario_id ORDER BY mejor_intentos ASC, mejor_tiempo ASC LIMIT 10"
	        );
	    }

	    // Buenas prácticas: método para cerrar la conexión cuando termines
	    public void close() {
	        try {
	            if (conn != null && !conn.isClosed())
	                conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
