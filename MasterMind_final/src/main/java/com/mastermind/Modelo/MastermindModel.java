package com.mastermind.Modelo;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

public class MastermindModel {
    public static final String[] COLORES = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Rosa"};
    public static final Color[] COLORES_VISUALES = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLACK};
    private String[] combinacionSecreta;

    public MastermindModel() {
        generarCombinacionAleatoria();
    }
    public String usuarios() {
    	String usuario = JOptionPane.showInputDialog("Ingresa el nombre del usuario");
    	return usuario;
    }
    

    public void generarCombinacionAleatoria() {
        Random rand = new Random();
        combinacionSecreta = new String[4];
        for (int i = 0; i < 4; i++) {
            int id = rand.nextInt(COLORES.length);
            combinacionSecreta[i] = COLORES[id];
        }
    }

    public String[] getCombinacionSecreta() {
        return combinacionSecreta;
    }

    public int[] comprobarIntento(String[] intento) {
        int exactos = 0;
        int color = 0;
        boolean[] usadosSecreta = new boolean[4];
        boolean[] usadosIntento = new boolean[4];

        // Exactos
        for (int i = 0; i < 4; i++) {
            if (combinacionSecreta[i].equals(intento[i])) {
                exactos++;
                usadosSecreta[i] = usadosIntento[i] = true;
            }
        }
        // Colores correctos pero posición incorrecta
        for (int i = 0; i < 4; i++) {
            if (!usadosSecreta[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!usadosIntento[j] && combinacionSecreta[i].equals(intento[j])) {
                        color++;
                        usadosSecreta[i] = usadosIntento[j] = true;
                        break;
                    }
                }
            }
        }
        return new int[]{exactos, color};
    }
}
