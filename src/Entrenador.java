import java.util.Objects;

public class Entrenador extends Persona {
    private String estrategiaFavorita;
    private int añosExperiencia;
    private Categoria categoriaAsignada;

    public Entrenador(String nombre, String fechaNacimiento, String dni, String estrategiaFavorita, int añosExperiencia , Categoria categoriaAsignada) {
        super(nombre, fechaNacimiento, dni);
        this.estrategiaFavorita = estrategiaFavorita;
        this.añosExperiencia =añosExperiencia;
        this.categoriaAsignada = categoriaAsignada;
    }

    @Override
    public String obtenerRol() {
        return "Entrenador de categoría " + categoriaAsignada;
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + getNombre() + " está planificando con estrategia: " + estrategiaFavorita);
    }

    public String getEstrategiaFavorita() { return estrategiaFavorita; }
    public void setEstrategiaFavorita(String estrategia) { this.estrategiaFavorita = estrategia; }

    public int getAñosExperiencia() { return añosExperiencia; }
    public void setAñosExperiencia(int años) { this.añosExperiencia = años; }

    public Categoria getCategoriaAsignada() { return categoriaAsignada; }
    public void setCategoriaAsignada(Categoria categoria) { this.categoriaAsignada = categoria; }

    @Override
    public String toString() {
        return super.toString() + " Entrenador{exp=" + añosExperiencia + ", estrategia='" + estrategiaFavorita + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Entrenador otro = (Entrenador) obj;
        return this.añosExperiencia == otro.añosExperiencia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), añosExperiencia);
    }
}
