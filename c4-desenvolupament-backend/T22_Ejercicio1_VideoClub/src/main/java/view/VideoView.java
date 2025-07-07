package view;

import javax.swing.*;
import java.awt.*;

public class VideoView extends JFrame {
    public JTextField txtTitulo, txtDirector, txtCliId;
    public JButton btnAgregar, btnListar;
    public JTextArea txtAreaResultado;

    public VideoView() {
        setTitle("Gestión de Videos");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        txtTitulo = new JTextField();
        txtDirector = new JTextField();
        txtCliId = new JTextField();
        txtAreaResultado = new JTextArea();

        btnAgregar = new JButton("Agregar Video");
        btnListar = new JButton("Listar Videos");

        add(new JLabel("Título:"));
        add(txtTitulo);
        add(new JLabel("Director:"));
        add(txtDirector);
        add(new JLabel("ID Cliente (cli_id):"));
        add(txtCliId);
        add(btnAgregar);
        add(btnListar);
        add(new JLabel("Resultados:"));
        add(new JScrollPane(txtAreaResultado));
    }
}
