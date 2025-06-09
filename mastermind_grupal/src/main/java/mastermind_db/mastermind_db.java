package mastermind_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mastermind_db {
    private static final String URL = "jdbc:mysql://localhost:3306/mastermind_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {
        try {
            // Cargar manualmente el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión y devolverla
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
        return null;
    }
}