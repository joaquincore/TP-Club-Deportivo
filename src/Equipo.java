import java.util.Objects;

public class Equipo {
    private String nombre;
    private Deporte deporte;
    private Entrenador entrenador;
    private Jugador[] jugadores;
    private int cantidadActual;
    private int capacidadMaxima;

    public Equipo(String nombre, Deporte deporte, Entrenador entrenador, int maxJugadores) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.entrenador = entrenador;
        this.capacidadMaxima = maxJugadores;
        this.jugadores = new Jugador[maxJugadores];
        this.cantidadActual = 0;
    }

    public boolean agregarJugador(Jugador jugador) {
        if (jugador != null && deporte != null && jugador.getDeporte() != null) {
            if (!this.deporte.equals(jugador.getDeporte())) {
                System.out.println("Error: El deporte del jugador no coincide con el del equipo.");
                return false;
            }
        }

        if (cantidadActual < capacidadMaxima) {
            jugadores[cantidadActual] = jugador;
            cantidadActual++;
            return true;
        } else {
            System.out.println("Error: El equipo esta lleno.");
            return false;
        }
    }

    public void mostrarPlantilla() {
        String nombreDeporte;
        if (deporte != null) {
            nombreDeporte = deporte.getNombre();
        } else {
            nombreDeporte = "Sin deporte";
        }

        String nombreEntrenador;
        if (entrenador != null) {
            nombreEntrenador = entrenador.getNombre();
        } else {
            nombreEntrenador = "Sin asignar";
        }

        System.out.println("--- Equipo: " + nombre + " (" + nombreDeporte + ") ---");
        System.out.println("Entrenador: " + nombreEntrenador);
        System.out.println("Jugadores inscriptos (" + cantidadActual + "/" + capacidadMaxima + "):");
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println("- " + jugadores[i].toString());
        }
    }

    public void cambiarEntrenador(Entrenador nuevoEntrenador) {
        this.entrenador = nuevoEntrenador;
        if (nuevoEntrenador != null) {
            System.out.println("Nuevo entrenador asignado a " + nombre + ": " + nuevoEntrenador.getNombre());
        } else {
            System.out.println("Entrenador desasignado de " + nombre);
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Deporte getDeporte() { return deporte; }
    public void setDeporte(Deporte deporte) { this.deporte = deporte; }

    public Entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }

    public Jugador[] getJugadores() { return jugadores; }
    public int getCantidadActual() { return cantidadActual; }
    public int getCapacidadMaxima() { return capacidadMaxima; }

    @Override
    public String toString() {
        String nombreEntrenador;
        if (entrenador != null) {
            nombreEntrenador = entrenador.getNombre();
        } else {
            nombreEntrenador = "Sin asignar";
        }
        return "Equipo{nombre='" + nombre + "', deporte='" + deporte + "', entrenador=" + nombreEntrenador + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Equipo otro = (Equipo) obj;
        return Objects.equals(this.nombre, otro.nombre) && Objects.equals(this.deporte, otro.deporte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, deporte);
    }
}