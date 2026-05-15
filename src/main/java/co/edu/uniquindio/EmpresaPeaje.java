package co.edu.uniquindio;
import java.util.ArrayList;
import java.util.List;

public class EmpresaPeaje {

    private String nombre;
    private List<EstacionPeaje> estaciones;
    private List<Recaudador> recaudadores;

    public EmpresaPeaje(String nombre) {
        this.nombre = nombre;
        estaciones = new ArrayList<>();
        recaudadores = new ArrayList<>();
    }

    public void agregarEstacion(EstacionPeaje estacion) {
        estaciones.add(estacion);
    }

    public void agregarRecaudador(Recaudador recaudador) {
        recaudadores.add(recaudador);
    }

    public List<Camion> obtenerCamionesCargaMayor10ToneladasYMasDe5Peajes() {
        List<Camion> resultado = new ArrayList<>();

        for (EstacionPeaje estacion : estaciones) {
            for (RegistroPeaje registro : estacion.getRegistros()) {
                Vehiculo vehiculo = registro.getVehiculo();

                if (vehiculo instanceof Camion camion) {
                    if (camion.getCapacidadCarga() > 10 &&
                            camion.getNumeroPeajesPagados() > 5 &&
                            !resultado.contains(camion)) {
                        resultado.add(camion);
                    }
                }
            }
        }

        return resultado;
    }

    public List<EstacionPeaje> getEstaciones() {
        return estaciones;
    }

    public List<Recaudador> getRecaudadores() {
        return recaudadores;
    }

    public String getNombre() {
        return nombre;
    }
}