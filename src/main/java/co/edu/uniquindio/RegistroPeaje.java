package co.edu.uniquindio;
import java.time.LocalDateTime;

public class RegistroPeaje {

    private Vehiculo vehiculo;
    private Cobrable cobrable;
    private double valorCobrado;
    private LocalDateTime fechaHora;

    public RegistroPeaje(Vehiculo vehiculo, Cobrable cobrable,
                         double valorCobrado, LocalDateTime fechaHora) {
        this.vehiculo = vehiculo;
        this.cobrable = cobrable;
        this.valorCobrado = valorCobrado;
        this.fechaHora = fechaHora;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cobrable getCobrable() {
        return cobrable;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
