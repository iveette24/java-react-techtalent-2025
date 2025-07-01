package controller;

import model.*;
import view.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.ArrayList;

public class ClienteController implements ActionListener {
    private ClienteView vista;
    private DAOCliente dao;

    public ClienteController(ClienteView vista, DAOCliente dao) {
        this.vista = vista;
        this.dao = dao;

        vista.btnAgregar.addActionListener(this);
        vista.btnListar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregar) {
            Cliente cliente = new Cliente();
            cliente.setNombre(vista.txtNombre.getText());
            cliente.setApellido(vista.txtApellido.getText());
            cliente.setDireccion(vista.txtDireccion.getText());
            cliente.setDni(vista.txtDNI.getText().trim());
            cliente.setFecha(vista.txtFecha.getText());
            try {
                dao.insertar(cliente);
                vista.txtAreaResultado.setText("Cliente insertado correctamente.");
            } catch (Exception ex) {
                vista.txtAreaResultado.setText("Error al insertar cliente: " + ex.getMessage());
            }
        } else if (e.getSource() == vista.btnListar) {
            try {
                ArrayList<Cliente> lista = dao.listar();
                StringBuilder sb = new StringBuilder();
                for (Cliente c : lista) {
                    sb.append(c.toString()).append("\n");
                }
                vista.txtAreaResultado.setText(sb.toString());
            } catch (Exception ex) {
                vista.txtAreaResultado.setText("Error al listar clientes: " + ex.getMessage());
            }
        }
    }
}
