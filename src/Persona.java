import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private String fechaNacimiento;
    private String dni;

    public Persona(String nombre, String fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public abstract String obtenerRol();

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " DNI: " + dni + " (" + obtenerRol() + ")");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dni='" + dni + "', fechaNacimiento='" + fechaNacimiento + "'}";
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
        Persona otra = (Persona) obj;
        return Objects.equals(this.dni, otra.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}