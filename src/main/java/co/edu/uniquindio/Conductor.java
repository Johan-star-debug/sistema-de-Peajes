package co.edu.uniquindio;
        import java.time.LocalDate;
        import java.util.ArrayList;
        import java.util.List;

        public record Conductor(
        String nombre, String apellidos, String documento, LocalDate fechaNacimiento, List<Vehiculo> vehiculos
) {

    // Constructor compacto para inicializar la lista de vehículos
    public Conductor {
        if (vehiculos == null) {
            vehiculos = new ArrayList<>();
        }
    }

    // Constructor de conveniencia (sin enviar la lista)
    public Conductor(String nombre,
                     String apellidos,
                     String documento,
                     LocalDate fechaNacimiento) {
        this(nombre, apellidos, documento, fechaNacimiento, new ArrayList<>());
    }

    // Método para agregar un vehículo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
}