package co.edu.uniquindio;
public class Carro extends Vehiculo {

    private boolean electrico;
    private boolean servicioPublico;

    public Carro(String placa, Conductor conductor,
                 boolean electrico, boolean servicioPublico) {
        super(placa, conductor);
        this.electrico = electrico;
        this.servicioPublico = servicioPublico;
    }

    @Override
    public double calcularPeaje() {
        double valor = 10000;

        if (electrico) {
            valor *= 0.80;
        }

        if (servicioPublico) {
            valor *= 1.15;
        }

        return valor;
    }
}