package ud09HerenciaEnJava.teoria01;

public class ClaseB {
	public void prova() {
		ClaseA a = new ClaseA();
		// a.metodePrivat(); //❌
		a.metodeDefault(); // ✅
		a.metodeProtegit(); // ✅
		a.metodePublic(); // ✅
	}
}