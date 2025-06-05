package mastermind_db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class main extends JFrame {
    private static final int LONGITUD_CODIGO = 4;
    private static final Color[] COLORES_DISPONIBLES = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.MAGENTA};

    private JButton[] botonesCodigoSecreto;
    private JButton[] botonesIntento;
    private JButton verificarButton;
    private JLabel resultadoLabel;
    private JTextArea historialIntentos;

    private Color[] codigoSecreto = new Color[LONGITUD_CODIGO];
    private boolean seleccionandoCodigo = true;
    private ArrayList<Color[]> historial;

    public main() {
        setTitle("MasterMind - Dos Jugadores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLayout(new FlowLayout());

        historial = new ArrayList<>();

        JLabel instrucciones = new JLabel("Jugador 1: Selecciona el código secreto.");
        add(instrucciones);

        botonesCodigoSecreto = new JButton[LONGITUD_CODIGO];
        for (int i = 0; i < LONGITUD_CODIGO; i++) {
            botonesCodigoSecreto[i] = new JButton();
            botonesCodigoSecreto[i].setBackground(Color.WHITE);
            botonesCodigoSecreto[i].setPreferredSize(new Dimension(50, 50));
            int index = i;
            botonesCodigoSecreto[i].addActionListener(e -> cambiarColor(index, true));
            add(botonesCodigoSecreto[i]);
        }

        JButton confirmarCodigoButton = new JButton("Confirmar Código");
        add(confirmarCodigoButton);
        confirmarCodigoButton.addActionListener(e -> iniciarTurnoJugador2());

        resultadoLabel = new JLabel(" ");
        add(resultadoLabel);
        
        setVisible(true);
    }

    private void iniciarTurnoJugador2() {
        seleccionandoCodigo = false;
        getContentPane().removeAll();
        setLayout(new FlowLayout());

        JLabel instrucciones = new JLabel("Jugador 2: Adivina el código.");
        add(instrucciones);

        botonesIntento = new JButton[LONGITUD_CODIGO];
        for (int i = 0; i < LONGITUD_CODIGO; i++) {
            botonesIntento[i] = new JButton();
            botonesIntento[i].setBackground(Color.WHITE);
            botonesIntento[i].setPreferredSize(new Dimension(50, 50));
            int index = i;
            botonesIntento[i].addActionListener(e -> cambiarColor(index, false));
            add(botonesIntento[i]);
        }

        verificarButton = new JButton("Verificar Intento");
        add(verificarButton);
        verificarButton.addActionListener(e -> verificarIntento());

        historialIntentos = new JTextArea(10, 30);
        historialIntentos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historialIntentos);
        add(scrollPane);

        resultadoLabel = new JLabel(" ");
        add(resultadoLabel);

        revalidate();
        repaint();
    }

    private void cambiarColor(int index, boolean esCodigoSecreto) {
        JButton boton = esCodigoSecreto ? botonesCodigoSecreto[index] : botonesIntento[index];
        Color actual = boton.getBackground();
        int nuevoIndice = (getColorIndex(actual) + 1) % COLORES_DISPONIBLES.length;
        boton.setBackground(COLORES_DISPONIBLES[nuevoIndice]);
        
        if (esCodigoSecreto) {
            codigoSecreto[index] = COLORES_DISPONIBLES[nuevoIndice];
        }
    }

    private int getColorIndex(Color color) {
        for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {
            if (COLORES_DISPONIBLES[i].equals(color)) {
                return i;
            }
        }
        return 0;
    }

    private void verificarIntento() {
        Color[] intentoUsuario = new Color[LONGITUD_CODIGO];
        for (int i = 0; i < LONGITUD_CODIGO; i++) {
            intentoUsuario[i] = botonesIntento[i].getBackground();
        }

        historial.add(intentoUsuario);
        actualizarHistorial();

        int correctos = 0;
        for (int i = 0; i < LONGITUD_CODIGO; i++) {
            if (intentoUsuario[i].equals(codigoSecreto[i])) {
                correctos++;
            }
        }

        if (correctos == LONGITUD_CODIGO) {
            resultadoLabel.setText("¡Jugador 2 ha ganado! Código correcto.");
        } else {
            resultadoLabel.setText("Correctos en posición exacta: " + correctos);
        }
    }

    private void actualizarHistorial() {
        historialIntentos.setText("Intentos anteriores:\n");
        for (Color[] intento : historial) {
            for (Color color : intento) {
                historialIntentos.append(getColorName(color) + " ");
            }
            historialIntentos.append("\n");
        }
    }

    private String getColorName(Color color) {
        if (color.equals(Color.RED)) return "Rojo";
        if (color.equals(Color.BLUE)) return "Azul";
        if (color.equals(Color.GREEN)) return "Verde";
        if (color.equals(Color.YELLOW)) return "Amarillo";
        if (color.equals(Color.ORANGE)) return "Naranja";
        if (color.equals(Color.MAGENTA)) return "Magenta";
        return "Desconocido";
    }

    public static void main(String[] args) {
        new main();
    }
}
