package modelo;

import java.time.LocalDate;

public class Reparacion {

    private Vehiculo vehiculo;
    private String descripcion;
    private double coste;
    private LocalDate fecha;

    //Constructor
    public Reparacion(Vehiculo vehiculo, String descripcion, double coste) {
        this.vehiculo = vehiculo;
        this.descripcion = descripcion;
        this.coste = coste;
        this.fecha = LocalDate.now();
    }
    //Metodo donde detallamos la reparacion
    public void mostrarReparacion() {
        System.out.println("----- Reparación -----");
        System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("Descripción: " + descripcion);
        System.out.println("Coste: " + coste + " €");
        System.out.println("Fecha: " + fecha);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCoste() {
        return coste;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}