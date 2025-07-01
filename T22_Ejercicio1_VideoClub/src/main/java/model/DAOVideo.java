package model;

import java.sql.*;
import java.util.ArrayList;

public class DAOVideo {
    private Connection conn;

    public DAOVideo(Connection conn) {
        this.conn = conn;
    }

    // Método para insertar video
    public void insertar(Video video) throws SQLException {
        if (video.getTitle().isEmpty() || video.getDirector().isEmpty()) {
            throw new IllegalArgumentException("Título y Director no pueden estar vacíos");
        }

        String sql = "INSERT INTO videos (title, director, cli_id) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, video.getTitle());
        stmt.setString(2, video.getDirector());
        stmt.setInt(3, video.getCli_id());
        stmt.executeUpdate();
    }

    // Método para listar todos los videos
    public ArrayList<Video> listar() throws SQLException {
        ArrayList<Video> lista = new ArrayList<>();
        String sql = "SELECT * FROM videos";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Video v = new Video(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("director"),
                rs.getInt("cli_id")
            );
            lista.add(v);
        }
        return lista;
    }

    // Puedes agregar métodos como actualizar(), eliminar(), buscarPorId() más adelante
}
