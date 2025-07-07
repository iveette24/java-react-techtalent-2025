package AppMain;

import controller.ClienteController;
import model.DAOCliente;
import model.Cliente;
import view.ClienteView;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ud22_videoclub", "root", "");
            ClienteView vista = new ClienteView();
            DAOCliente dao = new DAOCliente(conn);
            ClienteController controlador = new ClienteController(vista, dao);
            vista.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}
