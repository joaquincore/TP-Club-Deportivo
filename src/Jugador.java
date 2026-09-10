import java.util.Objects;

public class Jugador extends Persona {
    private Deporte deporte;
    private Categoria categoria;
    private int nroCamiseta;
    private int partidosJugados;

    public Jugador(String nombre, String fechaNacimiento, String dni, Deporte deporte, Categoria categoria, int nroCamiseta) {
        super(nombre, fechaNacimiento, dni);
        this.deporte = deporte;
        this.categoria = categoria;
        this.nroCamiseta = nroCamiseta;
        this.partidosJugados = 0;
    }

    @Override
    public String obtenerRol() {
        if (deporte != null) {
            return "Jugador de " + deporte.getNombre();
        } else {
            return "Jugador sin deporte asignado";
        }
    }

    public void jugarPartido() {
        this.partidosJugados++;
        System.out.println(getNombre() + " (#" + nroCamiseta + ") jugo un partido. Total acumulado: " + partidosJugados);
    }

    public void entrenar() {
        System.out.println(getNombre() + " esta realizando la rutina de entrenamiento en categoria " + categoria + ".");
    }


    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jugador)) {
            return false;
        }
        Jugador jugador = (Jugador) obj;
        return this.getNombre().equals(jugador.getNombre());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "Jugador [" + obtenerRol() + ", Categoria: " + categoria +
                ", Dorsal: #" + nroCamiseta + ", Partidos: " + partidosJugados + "]";
    }
}