import co.edu.uniquindio.Camion;
import co.edu.uniquindio.Carro;
import co.edu.uniquindio.Conductor;
import co.edu.uniquindio.Moto;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

    @Nested
    class VehiculoTest {

        @Test
        public void calcularPeajeCarroElectrico() {
            Conductor conductor = new Conductor(
                    "Juan",
                    "Perez",
                    "123",
                    LocalDate.of(1990, 1, 1)
            );

            Carro carro = new Carro("ABC123", conductor, true, false);

            assertEquals(8000.0, carro.calcularPeaje(), 0.001);
        }

        @Test
        public void calcularPeajeMotoMayor200cc() {
            Conductor conductor = new Conductor(
                    "Ana",
                    "Lopez",
                    "456",
                    LocalDate.of(1992, 5, 10)
            );

            Moto moto = new Moto("MOT001", conductor, 250);

            assertEquals(7000.0, moto.calcularPeaje(), 0.001);
        }

        @Test
        public void calcularPeajeCamionCargaMayor10() {
            Conductor conductor = new Conductor(
                    "Carlos",
                    "Ramirez",
                    "789",
                    LocalDate.of(1985, 3, 15)
            );

            Camion camion = new Camion("CAM001", conductor, 4, 12);

            assertEquals(30800.0, camion.calcularPeaje(), 0.001);
        }
    }
