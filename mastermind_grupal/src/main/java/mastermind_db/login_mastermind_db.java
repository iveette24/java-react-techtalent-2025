package mastermind_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login_mastermind_db {
	public static boolean autenticar(String usuario, String password) {
		Connection conn = mastermind_db.conectar();
		if (conn == null)
			return false;

		try {
			String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, usuario);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			return rs.next();
		} catch (SQLException e) {
			System.out.println("Error en autenticación: " + e.getMessage());
			return false;
		}
	}
}
