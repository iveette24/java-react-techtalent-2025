package view;

import javax.swing.*;
import java.awt.*;

public class ClienteView extends JFrame {
    public JTextField txtNombre, txtApellido, txtDireccion, txtDNI, txtFecha;
    public JButton btnAgregar, btnListar;
    public JTextArea txtAreaResultado;

    public ClienteView() {
        setTitle("Gestión de Clientes");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtDireccion = new JTextField();
        txtDNI = new JTextField();
        txtFecha = new JTextField();
        txtAreaResultado = new JTextArea();

        btnAgregar = new JButton("Agregar Cliente");
        btnListar = new JButton("Listar Clientes");

        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellido:"));
        add(txtApellido);
        add(new JLabel("Dirección:"));
        add(txtDireccion);
        add(new JLabel("DNI:"));
        add(txtDNI);
        add(new JLabel("Fecha:"));
        add(txtFecha);
        add(btnAgregar);
        add(btnListar);
        add(new JLabel("Resultados:"));
        add(new JScrollPane(txtAreaResultado));
    }
}
