package co.edu.uniquindio;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EmpresaPeaje empresa = new EmpresaPeaje("Peajes del Quindío");

        EstacionPeaje estacion = new EstacionPeaje("Peaje La Línea", "Quindío");
        empresa.agregarEstacion(estacion);

        Conductor conductor = new Conductor(
                "Juan",
                "Pérez",
                "123456",
                LocalDate.of(1990, 5, 10)
        );

        Camion camion = new Camion("ABC123", conductor, 4, 12);
        conductor.agregarVehiculo(camion);

        // El camión paga 6 peajes
        for (int i = 0; i < 6; i++) {
            double valor = estacion.cobrarPeaje(camion);
            System.out.println("Peaje cobrado: $" + valor);
        }

        // Consultar camiones con carga > 10 y más de 5 peajes
        System.out.println("Camiones encontrados: " +
                empresa.obtenerCamionesCargaMayor10ToneladasYMasDe5Peajes().size());

        // Total recaudado
        System.out.println("Total recaudado: $" +
                estacion.getTotalRecaudado());
    }
}