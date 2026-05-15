package co.edu.uniquindio;
public abstract class Vehiculo {

    private String placa;
    private int numeroPeajesPagados;
    private Conductor conductor;

    public Vehiculo(String placa, Conductor conductor) {
        this.placa = placa;
        this.conductor = conductor;
        this.numeroPeajesPagados = 0;
    }

    public abstract double calcularPeaje();

    public void incrementarPeajesPagados() {
        numeroPeajesPagados++;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumeroPeajesPagados() {
        return numeroPeajesPagados;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
