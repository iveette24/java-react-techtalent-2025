package ud09HerenciaEnJava.teoria02;

import ud09HerenciaEnJava.teoria01.ClaseA;

public class ClaseE extends ClaseA {
	public void prova() {
		// metodeDefault(); ❌
		metodeProtegit(); // ✅
		metodePublic(); // ✅
	}
}