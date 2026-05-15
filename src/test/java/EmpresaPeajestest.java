import co.edu.uniquindio.Camion;
import co.edu.uniquindio.Conductor;
import co.edu.uniquindio.EmpresaPeaje;
import co.edu.uniquindio.EstacionPeaje;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmpresaPeajestest {

    @Test
    public void obtenerCamionesCargaMayor10ToneladasYMasDe5Peajes() {

        EmpresaPeaje empresa = new EmpresaPeaje("Peajes del Quindío");
        EstacionPeaje estacion = new EstacionPeaje("Peaje La Línea", "Quindío");

        empresa.agregarEstacion(estacion);

        Conductor conductor;
        conductor = new Conductor(
                "Pedro",
                "Martinez",
                "999",
                LocalDate.of(1980, 7, 20)
        );

        Camion camion = new Camion("XYZ123", conductor, 4, 12);
        conductor.agregarVehiculo(camion);

        // El camión paga 6 peajes
        for (int i = 0; i < 6; i++) {
            estacion.cobrarPeaje(camion);
        }

        List<Camion> resultado =
                empresa.obtenerCamionesCargaMayor10ToneladasYMasDe5Peajes();

        assertEquals(1, resultado.size());
        assertEquals("XYZ123", resultado.get(0).getPlaca());
    }
}
