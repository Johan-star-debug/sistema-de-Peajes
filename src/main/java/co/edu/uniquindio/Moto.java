package co.edu.uniquindio;
public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String placa, Conductor conductor, int cilindraje) {
        super(placa, conductor);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPeaje() {
        double valor = 5000;

        if (cilindraje > 200) {
            valor += 2000;
        }

        return valor;
    }
}
