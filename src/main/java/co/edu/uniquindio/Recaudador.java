package co.edu.uniquindio;
import java.time.LocalDate;

public class Recaudador extends Persona implements Cobrable {

    private double sueldoMensual;

    public Recaudador(String nombre, String apellidos, String documento,
                      LocalDate fechaNacimiento, double sueldoMensual) {
        super(nombre, apellidos, documento, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String getNombreEntidad() {
        return getNombre() + " " + getApellidos();
    }
}