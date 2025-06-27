package appbotones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaContadora extends JFrame {
	
	public int contador1 = 0;
	public int contador2 = 0;
	
	public JLabel etiqueta1;
	public JLabel etiqueta2;
	
	public VentanaContadora() {
		super("Contador de clicks");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		//setLayout(new BorderLayout());
		
		JPanel panelEtiquetas = new JPanel(new GridLayout(2, 1));
		etiqueta1 = new JLabel ("Botón 1: "+contador1, SwingConstants.CENTER);
		etiqueta2 = new JLabel ("Botón 2: "+contador2, SwingConstants.CENTER);
		panelEtiquetas.add(etiqueta1);
		panelEtiquetas.add(etiqueta2);
		
		JPanel panelBotones = new JPanel();//new FlowLayout());
		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");
		panelBotones.add(boton1);
		panelBotones.add(boton2);
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador1++;
				etiqueta1.setText("Botón 1: " + contador1);
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2++;
				etiqueta2.setText("Botón 2: " + contador2);
			}
		});
		
		add(panelEtiquetas, BorderLayout.CENTER);
		add(panelBotones, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new VentanaContadora();
	}

}
