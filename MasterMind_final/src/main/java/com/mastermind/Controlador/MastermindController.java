package com.mastermind.Controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.mastermind.Modelo.DBManager;
import com.mastermind.Modelo.MastermindModel;
import com.mastermind.Vista.GameView;
import com.mastermind.Vista.MastermindView;

public class MastermindController {
    private MastermindModel modelo;
    private MastermindView vista;
    private DBManager db;
    private int intentos = 0;
    private int userId;
    private long tiempoInicio;
    private int intentosMax = 15;

    // CORREGIDO: el constructor debe estar DENTRO de la clase, y las llaves correctas
    public MastermindController(MastermindModel modelo, MastermindView vista2, DBManager db, int userId) {
        this.modelo = modelo;
        this.vista = vista2;
        this.userId = userId;
        this.db = db;
        this.tiempoInicio = System.currentTimeMillis(); // CORREGIDO: inicia tiempo

        vista.setOnReiniciarListener(() -> {
            modelo.generarCombinacionAleatoria();
            intentos = 0;
            tiempoInicio = System.currentTimeMillis();
        });

        // Solo necesitas UN addActionListener, no dos
        this.vista.probarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                probarCombinacion();
            }
        });
    }
    public MastermindController(MastermindModel modelo, MastermindView vista) {
    	this.vista = vista;
    	this.modelo = modelo;
    }

    // Separa la lógica en un método propio para claridad
    private void probarCombinacion() {
        if (intentos >= intentosMax) {
        	JOptionPane.showMessageDialog(vista, "Has alcanzado el numero maximo de intentos");
        	vista.probarBtn.setEnabled(false);
        	return;
        }
    	String[] intento = vista.getIntentoUsuario();
        int[] resultado = modelo.comprobarIntento(intento);
        intentos++;

        vista.agregarAlHistorialVisual(intento, resultado[0], resultado[1]);
//        vista.agregarAlHistorial("Intento " + intentos + ": " +
//                String.join(", ", intento) +
//                " --> " + resultado[0] + " bien colocados, " + resultado[1] + " solo color");
        if (resultado[0] == 4) {
            long tiempoFin = System.currentTimeMillis();
            int tiempoSegundos = (int)((tiempoFin - tiempoInicio) / 1000);

            JOptionPane.showMessageDialog(vista, "¡Felicidades! Has adivinado la combinación secreta en " +
                    intentos + " intentos y " + tiempoSegundos + " segundos");

            vista.probarBtn.setEnabled(false);

            // Guardar Partida en la base de datos
            try {
                db.guardarPartida(userId, String.join(",", modelo.getCombinacionSecreta()), intentos, tiempoSegundos);
                mostrarRanking();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "No se pudo guardar la partida en la base de datos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }else if (intentos == intentosMax) {
        	long tiempoFin = System.currentTimeMillis();
            int tiempoSegundos = (int)((tiempoFin - tiempoInicio) / 1000);

            JOptionPane.showMessageDialog(vista, "¡Has alcanzado el número máximo de intentos (" + intentosMax + ")!\nLa combinación era: " + String.join(", ", modelo.getCombinacionSecreta()));
            vista.probarBtn.setEnabled(false);

            // Guardar partida aunque no haya ganado
            try {
                db.guardarPartida(userId, String.join(",", modelo.getCombinacionSecreta()), intentos, tiempoSegundos);
                mostrarRanking();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "No se pudo guardar la partida en la base de datos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }

    private void mostrarRanking() {
        try {
            ResultSet rs = db.obtenerRanking();
            StringBuilder sb = new StringBuilder();
            sb.append("🏆 RANKING 🏆\n\n");
            int pos = 1;

            while (rs.next()) {
                sb.append(pos++)
                  .append(". ")
                  .append(rs.getString("nombre")) 
                  .append(" - Intentos: ")
                  .append(rs.getInt("mejor_intentos")) 
                  .append(" - Tiempo: ")
                  .append(rs.getInt("mejor_tiempo")) 
                  .append(" s\n");
            }
            JOptionPane.showMessageDialog(vista, sb.toString(), "Ranking Mastermind", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "No se pudo recuperar el ranking", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}





