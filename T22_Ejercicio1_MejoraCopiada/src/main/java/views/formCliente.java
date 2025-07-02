package views;

/**
 * Author: Diego Mejias
 * Version: 1.0
 * GitHub Repository: https://github.com/MejiasDiego/MVC_CRUD_mejiasDiego
 * 
 * This class represents the client form view in the MVC architecture.
 * It includes the GUI components and layout for managing client data.
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.FlowLayout;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllers.cliente;
import models.conexionBD;

import javax.swing.border.BevelBorder;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldDNI;
	private JTextField textField_1Apellido;
	private JTextField textField_3Nombre;
	private JTextField textField_4Dirección;
	private JTextField textField_2Fecha;
	private JTextField textFieldId;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formCliente frame = new formCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public formCliente() {
		setTitle("GESTOR DE CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 452, SpringLayout.NORTH, contentPane);
		panel.setBorder(new TitledBorder(null, "Datos Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 210, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -15, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, contentPane);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("APELLIDO");
		sl_panel.putConstraint(SpringLayout.NORTH, lblApellido, 24, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblApellido, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblApellido, -344, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblApellido, -107, SpringLayout.EAST, panel);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		sl_panel.putConstraint(SpringLayout.WEST, lblDni, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblDni);
		
		JLabel lblFecha = new JLabel("FECHA");
		sl_panel.putConstraint(SpringLayout.WEST, lblFecha, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblFecha);
		
		textFieldDNI = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblDni, 3, SpringLayout.NORTH, textFieldDNI);
		sl_panel.putConstraint(SpringLayout.EAST, lblDni, -51, SpringLayout.WEST, textFieldDNI);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldDNI, -14, SpringLayout.EAST, panel);
		panel.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		textField_1Apellido = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1Apellido, 58, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textFieldDNI, 0, SpringLayout.WEST, textField_1Apellido);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1Apellido, 18, SpringLayout.EAST, lblApellido);
		sl_panel.putConstraint(SpringLayout.EAST, textField_1Apellido, -14, SpringLayout.EAST, panel);
		textField_1Apellido.setColumns(10);
		panel.add(textField_1Apellido);
		
		textField_3Nombre = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, textField_3Nombre, 93, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_3Nombre, -14, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.NORTH, textField_3Nombre);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textField_3Nombre);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3Nombre, 15, SpringLayout.NORTH, panel);
		textField_3Nombre.setColumns(10);
		panel.add(textField_3Nombre);
		
		textField_4Dirección = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4Dirección, 98, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldDNI, 23, SpringLayout.SOUTH, textField_4Dirección);
		sl_panel.putConstraint(SpringLayout.EAST, textField_4Dirección, -14, SpringLayout.EAST, panel);
		textField_4Dirección.setColumns(10);
		panel.add(textField_4Dirección);
		
		textField_2Fecha = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblFecha, 3, SpringLayout.NORTH, textField_2Fecha);
		sl_panel.putConstraint(SpringLayout.EAST, lblFecha, -24, SpringLayout.WEST, textField_2Fecha);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2Fecha, 25, SpringLayout.SOUTH, textFieldDNI);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2Fecha, 0, SpringLayout.WEST, textFieldDNI);
		sl_panel.putConstraint(SpringLayout.EAST, textField_2Fecha, 0, SpringLayout.EAST, textFieldDNI);
		textField_2Fecha.setColumns(10);
		panel.add(textField_2Fecha);
		
		JButton btnGuardar = new JButton("Guardar");
		sl_panel.putConstraint(SpringLayout.WEST, btnGuardar, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnGuardar, -14, SpringLayout.EAST, panel);
		btnGuardar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de guardar este cliente?", "Confirmar Guardar Cliente", JOptionPane.YES_NO_OPTION);
		        if (confirmacion == JOptionPane.YES_OPTION) {
		            cliente objetoCliente = new cliente();
		            objetoCliente.insertarCliente(textField_3Nombre, textField_1Apellido, textField_4Dirección, textFieldDNI, textField_2Fecha);
		            objetoCliente.MostrarCliente(table);
		        }
		    }
		});
		
		sl_panel.putConstraint(SpringLayout.SOUTH, btnGuardar, -117, SpringLayout.SOUTH, panel);
		panel.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnModificar, 19, SpringLayout.SOUTH, btnGuardar);
		sl_panel.putConstraint(SpringLayout.WEST, btnModificar, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnModificar, -16, SpringLayout.EAST, panel);
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		sl_panel.putConstraint(SpringLayout.NORTH, btnEliminar, 367, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnEliminar, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnEliminar, -14, SpringLayout.EAST, panel);
		panel.add(btnEliminar);
		
		JLabel lblId = new JLabel("ID");
		sl_panel.putConstraint(SpringLayout.WEST, lblId, 10, SpringLayout.WEST, panel);
		panel.add(lblId);
		
		textFieldId = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, textFieldId, 73, SpringLayout.EAST, lblId);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldId, -14, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblId, 3, SpringLayout.NORTH, textFieldId);
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldId, 23, SpringLayout.SOUTH, textField_2Fecha);
		textFieldId.setColumns(10);
		panel.add(textFieldId);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -92, SpringLayout.SOUTH, contentPane);
		panel_1.setBorder(new TitledBorder(null, "Lista Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_panel_1.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, scrollPane, 333, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, scrollPane, -6, SpringLayout.EAST, panel_1);
		scrollPane.setViewportBorder(null);
		panel_1.add(scrollPane);
		
		table = new JTable();
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
			
		));
		cliente objetoCliente = new cliente();
		objetoCliente.MostrarCliente(table);;
		
		JLabel lblDireccin = new JLabel("DIRECCIÓN");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDireccin, 101, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textField_4Dirección, 6, SpringLayout.EAST, lblDireccin);
		panel.add(lblDireccin);
		sl_panel.putConstraint(SpringLayout.WEST, lblDireccin, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblDireccin, -6, SpringLayout.WEST, textField_1Apellido);
		
		textFieldId.setEditable(false); // Hacer el campo ID no editable

		// Ajustar la asignación de campos en el método actionPerformed del botón "Eliminar"
		btnEliminar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int filaSeleccionada = table.getSelectedRow();
		        if (filaSeleccionada != -1) {
		            int idCliente = Integer.parseInt(table.getValueAt(filaSeleccionada, 0).toString());
		            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este cliente?", "Confirmar Eliminar Cliente", JOptionPane.YES_NO_OPTION);
		            if (confirmacion == JOptionPane.YES_OPTION) {
		                cliente objetoCliente = new cliente();
		                objetoCliente.eliminarCliente(idCliente);
		                objetoCliente.MostrarCliente(table);
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione un cliente para eliminar.");
		        }
		    }
		});

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent event) {
		        if (!event.getValueIsAdjusting()) {
		            cliente objetoCliente = new cliente();
		            objetoCliente.SeleccionarCliente(table, textFieldId, textField_3Nombre, textField_1Apellido, textField_4Dirección, textFieldDNI, textField_2Fecha);
		        }
		    }
		});
		btnModificar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de modificar este cliente?", "Confirmar Modificar Cliente", JOptionPane.YES_NO_OPTION);
		        if (confirmacion == JOptionPane.YES_OPTION) {
		            cliente objetoCliente = new cliente();
		            objetoCliente.ModificarCliente(table, textField_3Nombre, textField_1Apellido, textField_4Dirección, textFieldDNI, textField_2Fecha, textFieldId);
		            objetoCliente.MostrarCliente(table);
		        }
		    }
		});


	}
	
	
	
}


