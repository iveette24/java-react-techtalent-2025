package controller;

import model.Video;
import model.DAOVideo;
import view.VideoView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VideoController implements ActionListener {
    private VideoView vista;
    private DAOVideo dao;

    public VideoController(VideoView vista, DAOVideo dao) {
        this.vista = vista;
        this.dao = dao;

        // Asignar eventos de botones
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnListar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregar) {
            String titulo = vista.txtTitulo.getText().trim();
            String director = vista.txtDirector.getText().trim();
            String cliIdStr = vista.txtCliId.getText().trim();

            if (titulo.isEmpty() || director.isEmpty() || cliIdStr.isEmpty()) {
                vista.txtAreaResultado.setText("Todos los campos son obligatorios.");
                return;
            }

            try {
                int cliId = Integer.parseInt(cliIdStr);
                Video video = new Video(0, titulo, director, cliId);
                dao.insertar(video);
                vista.txtAreaResultado.setText("🎉 Video agregado correctamente.");
            } catch (NumberFormatException ex) {
                vista.txtAreaResultado.setText("El ID del cliente debe ser un número.");
            } catch (Exception ex) {
                vista.txtAreaResultado.setText("Error al insertar: " + ex.getMessage());
            }
        }

        if (e.getSource() == vista.btnListar) {
            try {
                ArrayList<Video> lista = dao.listar();
                if (lista.isEmpty()) {
                    vista.txtAreaResultado.setText("No hay videos registrados.");
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Video v : lista) {
                        sb.append(v.toString()).append("\n");
                    }
                    vista.txtAreaResultado.setText(sb.toString());
                }
            } catch (Exception ex) {
                vista.txtAreaResultado.setText("Error al listar videos: " + ex.getMessage());
            }
        }
    }
}
