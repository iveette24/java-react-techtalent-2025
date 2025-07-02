package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexionBD {
	Connection conectar = null;
	String usuario = "root";
	String contrasenia = "";
	String bd = "clientesCrud";
	String ip= "localhost";
	String puerto = "3306";
	String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
	
	public Connection estableceConexion(){
		
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
	JOptionPane.showMessageDialog(null, "La conexión se ha realizado con éxito");
	} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos, erro: "+ e.toString());
	}
	return conectar;
}
	}
	