package ud09HerenciaEnJava;

class ej06cine {
    String titulo;
    int duracion;
    int edadMinima;
    String director;

    public ej06cine(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
}

class Espectador {
    String nombre;
    int edad;
    double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
}

class Asiento {
    int fila;
    char columna;
    boolean ocupado;

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }
}

class Cine {
    ej06cine ej06cine;
    double precioEntrada;
    Asiento[][] asientos;

    public Cine(ej06cine ej06cine, double precioEntrada, int filas, int columnas) {
        this.ej06cine = ej06cine;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = new Asiento(filas - i, (char) ('A' + j));
            }
        }
    }

    public void mostrarAsientos() {
        System.out.println("\nEstado de los asientos:");
        for (Asiento[] fila : asientos) {
            for (Asiento asiento : fila) {
                System.out.print((asiento.ocupado ? "[X] " : "[" + asiento.fila + asiento.columna + "] "));
            }
            System.out.println();
        }
    }

    public void sentarEspectador(Espectador espectador, int fila, char columna) {
        if (espectador.edad < ej06cine.edadMinima || espectador.dinero < precioEntrada) {
            System.out.println(espectador.nombre + " no puede entrar a ver la película.");
            return;
        }

        for (Asiento[] filaArr : asientos) {
            for (Asiento asiento : filaArr) {
                if (asiento.fila == fila && asiento.columna == columna) {
                    if (!asiento.ocupado) {
                        asiento.ocupado = true;
                        System.out.println(espectador.nombre + " se ha sentado en el asiento " + asiento.fila + asiento.columna);
                    } else {
                        System.out.println("El asiento está ocupado, intenta con otro.");
                    }
                    return;
                }
            }
        }
        System.out.println("El asiento elegido no existe.");
    }
}

