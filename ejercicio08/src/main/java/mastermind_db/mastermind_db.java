package mastermind_db;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mastermind_db {
	private static final String URL = "jdbc:mysql://localhost:3306/mastermind_db";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static Connection conectar() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Error al conectar con la base de datos: " + e.getMessage());
			return null;
		}
	}
}
