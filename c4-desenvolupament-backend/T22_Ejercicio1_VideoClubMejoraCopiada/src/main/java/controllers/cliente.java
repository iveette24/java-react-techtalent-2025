
package controllers;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import models.conexionBD;

public class cliente {

	// Atributos
	int id;
	String nombreCliente;
	String apellidoCliente;
	String direcciónCliente;
	int DNI;
	String fechaCliente;

	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getDirecciónCliente() {
		return direcciónCliente;
	}

	public void setDirecciónCliente(String direcciónCliente) {
		this.direcciónCliente = direcciónCliente;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}

	public String getFechaCliente() {
		return fechaCliente;
	}

	public void setFechaCliente(String fechaCliente) {
		this.fechaCliente = fechaCliente;
	}

	// Métodos
	public void insertarCliente(JTextField paramNombre, JTextField paramApellido, JTextField paraDireccion,
			JTextField paramDNI, JTextField paramFecha) {

		setNombreCliente(paramNombre.getText());
		setApellidoCliente(paramApellido.getText());
		setDirecciónCliente(paraDireccion.getText());
		try {
			int dni = Integer.parseInt(paramDNI.getText());
			setDNI(dni);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El DNI ingresado no es un número válido");
			return;
		}
		setFechaCliente(paramFecha.getText());

		conexionBD objetoConexion = new conexionBD();

		String consulta = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?)";

		try (Connection con = objetoConexion.estableceConexion();
				PreparedStatement ps = con.prepareStatement(consulta)) {
			ps.setString(1, getNombreCliente());
			ps.setString(2, getApellidoCliente());
			ps.setString(3, getDirecciónCliente());
			ps.setInt(4, getDNI());
			ps.setString(5, getFechaCliente());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se insertó correctamente el cliente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se insertó correctamente el cliente, error: " + e.getMessage());
		}
	}

	public void MostrarCliente(JTable paramMostrarClientes) {
		conexionBD objetoConexion = new conexionBD();
		DefaultTableModel modelo = new DefaultTableModel();
		TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
		paramMostrarClientes.setRowSorter(OrdenarTabla);

		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Dirección");
		modelo.addColumn("DNI");
		modelo.addColumn("Fecha");

		paramMostrarClientes.setModel(modelo);
		String sql = "SELECT * FROM cliente";
		String[] datos = new String[6];

		try (Connection con = objetoConexion.estableceConexion();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql)) {
			while (rs.next()) {
				datos[0] = rs.getString("id");
				datos[1] = rs.getString("nombre");
				datos[2] = rs.getString("apellido");
				datos[3] = rs.getString("direccion");
				datos[4] = rs.getString("dni");
				datos[5] = rs.getString("fecha");
				modelo.addRow(datos);
			}
			paramMostrarClientes.setModel(modelo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.getMessage());
		}
	}

	public void eliminarCliente(int idCliente) {
		conexionBD objetoConexion = new conexionBD();
		String consulta = "DELETE FROM cliente WHERE id = ?";

		try (Connection con = objetoConexion.estableceConexion();
				PreparedStatement ps = con.prepareStatement(consulta)) {
			ps.setInt(1, idCliente);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se eliminó correctamente el cliente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente, error: " + e.getMessage());
		}
	}

	public void SeleccionarCliente(JTable tablaCliente, JTextField paramNombre, JTextField paramApellido,
			JTextField paraDireccion, JTextField paramDNI, JTextField paramFecha, JTextField paramID) {

		try {
			int fila = tablaCliente.getSelectedRow();

			if (fila >= 0) {
				paramID.setText(tablaCliente.getValueAt(fila, 0).toString());
				paramNombre.setText(tablaCliente.getValueAt(fila, 1).toString());
				paramApellido.setText(tablaCliente.getValueAt(fila, 2).toString());
				paraDireccion.setText(tablaCliente.getValueAt(fila, 3).toString());
				paramDNI.setText(tablaCliente.getValueAt(fila, 4).toString());
				paramFecha.setText(tablaCliente.getValueAt(fila, 5).toString());
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.getMessage());
		}
	}

	public void ModificarCliente(JTable tablaCliente, JTextField paramNombre, JTextField paramApellido,
			JTextField paraDireccion, JTextField paramDNI, JTextField paramFecha, JTextField paramID) {

		conexionBD objetoConexion = new conexionBD();

		try {
			int idCliente = Integer.parseInt(paramID.getText());
			String consulta = "UPDATE cliente SET nombre=?, apellido=?, direccion=?, dni=?, fecha=? WHERE id=?";

			try (Connection con = objetoConexion.estableceConexion();
					PreparedStatement ps = con.prepareStatement(consulta)) {
				ps.setString(1, paramNombre.getText());
				ps.setString(2, paramApellido.getText());
				ps.setString(3, paraDireccion.getText());
				ps.setInt(4, Integer.parseInt(paramDNI.getText()));
				ps.setString(5, paramFecha.getText());
				ps.setInt(6, idCliente);

				int filasActualizadas = ps.executeUpdate();

				if (filasActualizadas > 0) {
					JOptionPane.showMessageDialog(null, "Cliente modificado correctamente");
				} else {
					JOptionPane.showMessageDialog(null, "No se pudo modificar el cliente");
				}

				MostrarCliente(tablaCliente);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al modificar el cliente: " + e.getMessage());
		}
	}
}
