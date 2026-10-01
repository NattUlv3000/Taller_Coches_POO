package servicios;

import modelo.Reparacion;
import modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Taller {

    private String nombre;

    private List<Vehiculo> vehiculos;
    private List<Reparacion> reparaciones;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
        this.reparaciones = new ArrayList<>();
    }

    /**
     * Registra un vehículo en el taller.
     *
     * @param vehiculo vehículo que se desea registrar.
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo.getMatricula());
    }

    public void registrarReparacion(Reparacion reparacion) {
        reparaciones.add(reparacion);
        System.out.println("Reparación registrada.");
    }

    public void mostrarVehiculos() {
        System.out.println("\n=== VEHÍCULOS DEL TALLER ===");

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
        }
    }

    public void mostrarCostesMantenimiento() {
        System.out.println("\n=== COSTES DE MANTENIMIENTO ===");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(
                vehiculo.getMarca() + " " + vehiculo.getModelo() + " → " + vehiculo.calcularMantenimiento() + " €");
        }
    }

    public void mostrarReparaciones() {
        System.out.println("\n=== REPARACIONES ===");

        for (Reparacion reparacion : reparaciones) {
            reparacion.mostrarReparacion();
        }
    }

    public String getNombre() {
        return nombre;
    }
}