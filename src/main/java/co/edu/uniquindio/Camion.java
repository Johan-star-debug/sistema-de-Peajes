package co.edu.uniquindio;
public class Camion extends Vehiculo {

    private int ejes;
    private double capacidadCarga;

    public Camion(String placa, Conductor conductor,
                  int ejes, double capacidadCarga) {
        super(placa, conductor);
        this.ejes = ejes;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPeaje() {
        double valor = ejes * 7000;

        if (capacidadCarga > 10) {
            valor *= 1.10;
        }

        return valor;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
