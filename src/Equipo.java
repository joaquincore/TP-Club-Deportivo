import java.util.Arrays;
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
        this.capacidadMaxima=maxJugadores;
        this.jugadores = new Jugador[maxJugadores];
        this.cantidadActual = 0;
    }

    public boolean agregarJugador(Jugador jugador) {
        if (cantidadActual < capacidadMaxima) {
            jugadores[cantidadActual] = jugador;
            cantidadActual++;
            return true;
        }
        System.out.println("Error: El equipo está lleno.");
        return false;
    }

    public void mostrarPlantilla() {
        System.out.println("--- Equipo: " + nombre + " (" + deporte + ") ---");
        System.out.println("Entrenador: " + (entrenador != null ? entrenador.getNombre() : "Sin asignar"));
        System.out.println("Jugadores inscriptos (" + cantidadActual + "/" + capacidadMaxima + "):");
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println("- " + jugadores[i].toString());
        }
    }

    public void cambiarEntrenador(Entrenador nuevoEntrenador) {
        this.entrenador = nuevoEntrenador;
        System.out.println("Nuevo entrenador asignado a " + nombre + ": " + nuevoEntrenador.getNombre());
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Deporte getDeporte() { return deporte; }
    public void setDeporte(Deporte deporte) { this.deporte = deporte; }

    public Entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }

    public Jugador[] getJugadores() { return jugadores; }

    @Override
    public String toString() {
        return "Equipo{nombre='" + nombre + "', deporte='" + deporte + "', entrenador=" + entrenador.getNombre() + "}";
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
