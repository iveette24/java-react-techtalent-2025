package model;

import java.sql.*;
import java.util.ArrayList;

public class DAOCliente {
    private Connection conn;

    public DAOCliente(Connection conn) {
        this.conn = conn;
    }

    public void insertar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, cliente.getNombre());
        stmt.setString(2, cliente.getApellido());
        stmt.setString(3, cliente.getDireccion());
        stmt.setString(4, cliente.getDni());
        stmt.setString(5, cliente.getFecha());
        stmt.executeUpdate();
    }

    public ArrayList<Cliente> listar() throws SQLException {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Cliente cli = new Cliente(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("direccion"),
                rs.getString("dni"),
                rs.getString("fecha")
            );
            lista.add(cli);
        }
        return lista;
    }

    // Puedes añadir métodos para actualizar y borrar también 😄
}
