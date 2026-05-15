package co.edu.uniquindio;
import java.time.LocalDate;

public abstract class Persona {

    private final String nombre;
    private final String apellidos;
    private final String documento;
    private final LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
