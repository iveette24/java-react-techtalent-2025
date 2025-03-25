package ud09HerenciaEnJava.teoria02;

import ud09HerenciaEnJava.teoria01.ClaseA;

public class Main {
	public static void main(String[] args) {
		ClaseA a = new ClaseA();
		// a.metodeDefault(); ❌
		// a.metodeProtegit(); ❌
		a.metodePublic(); // ✅
	}
}