package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String telefono;
    private String email;
//Usamos una lista para almacenar los vehiculos
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // metodo con bucle for-each
    public void mostrarVehiculos() {
        System.out.println("Vehículos de " + nombre + ":");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
        }
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}