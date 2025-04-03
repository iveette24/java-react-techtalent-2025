package ud08POOenJavaEjercicios;

public class ej01personaApp {

	public static void main(String[] args) {

		ej01persona Persona = new ej01persona();
		ej01persona Persona1 = new ej01persona("Mario", 27, 'H');
		ej01persona Persona2 = new ej01persona("Ivette", 19, "49315995Q", 'M', 58, 1.58);

		Persona.pordefecto();
		Persona1.pordefecto();
		Persona2.pordefecto();

	}

}
