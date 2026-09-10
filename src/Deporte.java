import java.util.Objects;

public class Deporte {
    private String nombre;
    private String descripcion;
    private Boolean seJuegaConPelota;
    private double largoCancha;
    private double anchoCancha;

    public  Deporte(String nombre, String descripcion, Boolean seJuegaConPelota, double largoCancha, double anchoCancha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.seJuegaConPelota = seJuegaConPelota;
        this.largoCancha = largoCancha;
        this.anchoCancha = anchoCancha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getSeJuegaConPelota() {
        return seJuegaConPelota;
    }

    public void setSeJuegaConPelota(Boolean seJuegaConPelota) {
        this.seJuegaConPelota = seJuegaConPelota;
    }

    public double getAnchoCancha() {
        return anchoCancha;
    }

    public void setAnchoCancha(double anchoCancha) {
        this.anchoCancha = anchoCancha;
    }

    public double getLargoCancha() {
        return largoCancha;
    }

    public void setLargoCancha(double largoCancha) {
        this.largoCancha = largoCancha;
    }

    public double calcularAreaCancha() {
        return largoCancha * anchoCancha;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Deporte)) {
            return false;
        }
        Deporte otro = (Deporte) obj;
        return this.nombre.equalsIgnoreCase(otro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nombre.toLowerCase());
    }

    @Override
    public String toString() {
        return "Deporte: [Nombre: " +this.nombre+ ", Descripcion: " +this.descripcion+ ", Se juega con pelota: " +this.seJuegaConPelota+ ", Largo de la cancha: " +this.largoCancha+ "m, Ancho de la cancha: " +this.anchoCancha+ "m ]";
    }
}
