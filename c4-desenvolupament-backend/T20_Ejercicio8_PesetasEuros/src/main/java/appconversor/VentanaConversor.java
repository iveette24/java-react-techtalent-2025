package appconversor;

import javax.swing.*; // Importa la librería Swing para crear interfaces gráficas
import java.awt.*; // Importa herramientas de diseño y distribución de componentes
import java.awt.event.*; // Importa los manejadores de eventos (clics, teclado, etc.)

public class VentanaConversor extends JFrame {
	
	// Campo de texto donde el usuario escribirá la cantidad a convertir
    private JTextField campoCantidad;

    // Etiqueta donde se mostrará el resultado de la conversión
    private JLabel etiquetaResultado;

    // Botones de tipo radio para seleccionar la dirección de conversión
    private JRadioButton eurosAPts, ptsAEuros;

    // Botones para convertir y borrar
    private JButton botonConvertir, botonBorrar;

    // Constante con la tasa de cambio oficial: 1€ = 166.386 pesetas
    private final double TASA_CAMBIO = 166.386;

    // Constructor que configura y muestra la ventana gráfica
    public VentanaConversor() {
        super("Conversor Euros ⇆ Pesetas"); // Título de la ventana

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setSize(400, 200); // Tamaño inicial de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(new GridLayout(5, 1, 10, 5)); // Organiza los componentes en 5 filas y 1 columna con espacios

        // Crea el campo de entrada de texto
        campoCantidad = new JTextField();
        // Añade una etiqueta encima para indicar al usuario qué hacer
        add(new JLabel("Introduce cantidad:", SwingConstants.CENTER));
        // Añade el campo donde se escribirá la cantidad
        add(campoCantidad);

        // Crea los botones radio para elegir el tipo de conversión
        eurosAPts = new JRadioButton("Euros a Pesetas", true); // Seleccionado por defecto
        ptsAEuros = new JRadioButton("Pesetas a Euros");

        // Agrupa los botones radio para que solo se pueda seleccionar uno
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(eurosAPts);
        grupo.add(ptsAEuros);

        // Añade los radio buttons en un panel
        JPanel panelRadios = new JPanel();
        panelRadios.add(eurosAPts);
        panelRadios.add(ptsAEuros);
        add(panelRadios); // Añade el panel a la ventana

        // Crea y añade la etiqueta donde se mostrará el resultado
        etiquetaResultado = new JLabel(" ", SwingConstants.CENTER); // Empieza vacía
        add(etiquetaResultado);

        // Crea los botones "Convertir" y "Borrar" dentro de otro panel
        JPanel panelBotones = new JPanel();
        botonConvertir = new JButton("Convertir");
        botonBorrar = new JButton("Borrar");
        panelBotones.add(botonConvertir);
        panelBotones.add(botonBorrar);
        add(panelBotones); // Añade el panel a la ventana

        // Cuando se hace clic en "Convertir", se llama al método convertir()
        botonConvertir.addActionListener(e -> convertir());

        // Cuando se hace clic en "Borrar", se limpian los campos de entrada y resultado
        botonBorrar.addActionListener(e -> {
            campoCantidad.setText(""); // Borra el texto introducido
            etiquetaResultado.setText(" "); // Borra el resultado
        });

        // Si el usuario pulsa Enter en el campo de entrada, también se hace la conversión
        campoCantidad.addActionListener(e -> convertir());

        // Muestra la ventana en pantalla
        setVisible(true);
    }

    // Método que realiza la conversión y muestra el resultado
    private void convertir() {
        String texto = campoCantidad.getText().trim(); // Obtiene el texto del campo, sin espacios extra

        try {
            double valor = Double.parseDouble(texto); // Intenta convertir el texto en número
            double resultado;

            // Si se eligió Euros a Pesetas
            if (eurosAPts.isSelected()) {
                resultado = valor * TASA_CAMBIO;
                // Muestra el resultado en formato con dos decimales
                etiquetaResultado.setText(String.format("%.2f € = %.2f pts", valor, resultado));
            } else {
                // Si se eligió Pesetas a Euros
                resultado = valor / TASA_CAMBIO;
                etiquetaResultado.setText(String.format("%.2f pts = %.2f €", valor, resultado));
            }
        } catch (NumberFormatException ex) {
            // Si el texto introducido no es un número válido, muestra una ventana de error
            JOptionPane.showMessageDialog(
                this,
                "Por favor, introduce un número válido.", // Mensaje al usuario
                "Error de formato", // Título del mensaje
                JOptionPane.ERROR_MESSAGE // Icono de error
            );
        }
    }

    // Método principal que lanza la aplicación
    public static void main(String[] args) {
        // Asegura que la ventana se lanza correctamente en el hilo gráfico de Swing
        SwingUtilities.invokeLater(() -> new VentanaConversor());
    }
}