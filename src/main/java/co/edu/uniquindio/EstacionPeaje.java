package co.edu.uniquindio;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje implements Cobrable {

    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<RegistroPeaje> registros;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecaudado = 0;
        this.registros = new ArrayList<>();
    }

    public double cobrarPeaje(Vehiculo vehiculo) {
        double valor = vehiculo.calcularPeaje();

        vehiculo.incrementarPeajesPagados();
        totalRecaudado += valor;

        RegistroPeaje registro = new RegistroPeaje(
                vehiculo,
                this,
                valor,
                LocalDateTime.now()
        );

        registros.add(registro);

        return valor;
    }

    public List<RegistroPeaje> getRegistros() {
        return registros;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String getNombreEntidad() {
        return nombre;
    }
}