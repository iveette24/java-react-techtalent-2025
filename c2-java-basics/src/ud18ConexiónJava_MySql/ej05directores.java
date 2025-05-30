package ud18ConexiónJava_MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ej05directores {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ud18_ej05_directores";
		String user = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

			// Crear tabla DESPACHOS
			stmt.executeUpdate("CREATE TABLE DESPACHOS (" + "Numero INT PRIMARY KEY, " + "Capacidad INT)");

			// Crear tabla DIRECTORES
			stmt.executeUpdate("CREATE TABLE DIRECTORES (" + "DNI VARCHAR(8) PRIMARY KEY, " + "NomApels NVARCHAR(255), "
					+ "DNIJefe VARCHAR(8), " + "Despacho INT, "
					+ "FOREIGN KEY (Despacho) REFERENCES DESPACHOS(Numero))");

			// Insertar registros en DESPACHOS
			stmt.executeUpdate("INSERT INTO DESPACHOS (Numero, Capacidad) VALUES "
					+ "(101, 2), (102, 3), (103, 4), (104, 5), (105, 6)");

			// Insertar registros en DIRECTORES
			stmt.executeUpdate("INSERT INTO DIRECTORES (DNI, NomApels, DNIJefe, Despacho) VALUES "
					+ "('12345678', 'Juan Pérez', NULL, 103), " + "('87654321', 'María López', '12345678', 102), "
					+ "('11223344', 'Carlos Fernández', '87654321', 101), "
					+ "('44332211', 'Laura García', '11223344', 105), "
					+ "('55667788', 'David Martín', '44332211', 104)");

			System.out.println("Base de datos creada y registros insertados correctamente.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
