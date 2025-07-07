	package mejiasDiego.UD22.MVC.CRUD;
	
	/*
	**
	 * Author: Diego Mejias
	 * Version: 1.0
	 * GitHub Repository: https://github.com/MejiasDiego/MVC_CRUD_mejiasDiego
	 * 
	 * This is the main class of the application.
	 * It serves as the entry point of the program, initializing and launching the application.
	 */
	 
	import views.formCliente;
	public class App 
	
	{
	    public static void main( String[] args )
	    {
	    	formCliente objetoGestor = new formCliente();
	    	objetoGestor.setVisible(true);
	    }
	}
