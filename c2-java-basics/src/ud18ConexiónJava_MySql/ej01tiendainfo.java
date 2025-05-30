package ud18ConexiónJava_MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ej01tiendainfo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ud18_ej01_tiendainfo";
		String user = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

			// Crear tabla FABRICANTES
			stmt.executeUpdate(
					"CREATE TABLE FABRICANTES (" + "Codigo INT AUTO_INCREMENT PRIMARY KEY, " + "Nombre NVARCHAR(100))");

			// Crear tabla ARTICULOS
			stmt.executeUpdate("CREATE TABLE ARTICULOS (" + "Codigo INT AUTO_INCREMENT PRIMARY KEY, "
					+ "Nombre NVARCHAR(100), " + "Precio INT, " + "Fabricante INT, "
					+ "FOREIGN KEY (Fabricante) REFERENCES FABRICANTES(Codigo))");

			// Insertar registros en FABRICANTES
			stmt.executeUpdate(
					"INSERT INTO FABRICANTES (Nombre) VALUES ('Sony'), ('Samsung'), ('Apple'), ('LG'), ('Dell')");

			// Insertar registros en ARTICULOS
			stmt.executeUpdate("INSERT INTO ARTICULOS (Nombre, Precio, Fabricante) VALUES " + "('Smartphone', 800, 4), "
					+ "('Televisor', 1200, 2), " + "('Laptop', 1500, 1), " + "('Monitor', 300, 3), "
					+ "('Teclado', 50, 5)");

			System.out.println("Base de datos creada y registros insertados correctamente.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
