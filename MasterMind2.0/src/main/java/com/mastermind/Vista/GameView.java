package com.mastermind.Vista; // Usa minúsculas para paquetes por convención

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameView {
    public static final Color[] COLORES = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLACK};
    public static final String[] COLORES_NOMBRES = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Rosa"};
    
 static String[] mostrarDialogo(JFrame parent, String nombreJ1, String nombreJ2) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4, 10, 10));
        panel.setBackground(new Color(220, 230, 250));
        panel.add(new JLabel(nombreJ1 + ", elige tu combinación secreta:", SwingConstants.CENTER));
        JPanel[] colorPanels = new JPanel[4];
        final int[] seleccion = new int [4];
        
        for (int i = 0; i < 4; i++) {
            final int idx = i;
            colorPanels[i] = new JPanel();
            colorPanels[i].setPreferredSize(new Dimension(40, 40));
            colorPanels[i].setBackground(COLORES[seleccion[i]]);
            colorPanels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            colorPanels[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    Object opcion = JOptionPane.showInputDialog(
                        panel,
                        "Selecciona un color:",
                        "Elige color",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        COLORES_NOMBRES,
                        COLORES_NOMBRES[seleccion[idx]]
                    );
                    if (opcion != null) {
                        for (int j = 0; j < COLORES_NOMBRES.length; j++) {
                            if (COLORES_NOMBRES[j].equals(opcion.toString())) {
                                seleccion[idx] = j;
                                colorPanels[idx].setBackground(COLORES[j]);
                            }
                        }
                    }
                }
            });
            panel.add(colorPanels[i]);
        }

        int result = JOptionPane.showConfirmDialog(
            parent,
            panel,
            "Combinación Secreta",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            String[] coloresSeleccionados = new String[4];
            for (int i = 0; i < 4; i++) {
                coloresSeleccionados[i] = COLORES_NOMBRES[seleccion[i]];
            }
            return coloresSeleccionados;
        } else {
            return null;
        }
    }
}
