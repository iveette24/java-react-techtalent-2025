// AppMain.java
package com.mastermind.Main;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import com.mastermind.Controlador.MastermindController;
import com.mastermind.Modelo.DBManager;
import com.mastermind.Modelo.MastermindModel;
import com.mastermind.Vista.GameView;
import com.mastermind.Vista.MastermindView;

public class AppMain {
    public static void main(String[] args) {
    	
    	  javax.swing.SwingUtilities.invokeLater(() -> {
              try {
                  DBManager db = new DBManager();

                  // Solicitar nombre de usuario antes de iniciar el juego
                  String usuario = null;
                  while (usuario == null || usuario.trim().isEmpty()) {
                      usuario = JOptionPane.showInputDialog(null, "Ingresa tu nombre de usuario:", "Usuario Mastermind", JOptionPane.QUESTION_MESSAGE);
                      if (usuario == null) System.exit(0);
                  }
                  int userId = db.registrarUsuario(usuario);

                  MastermindModel modelo = new MastermindModel();
                  MastermindView vista = new MastermindView();
                  new MastermindController(modelo, vista, db, userId); // Nueva versión de controlador

              } catch (SQLException e) {
                  JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                  e.printStackTrace();
              }
          });
    }
}
