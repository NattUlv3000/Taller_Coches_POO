import modelo.Camion;
import modelo.Cliente;
import modelo.Coche;
import modelo.Moto;
import modelo.Reparacion;
import modelo.Vehiculo;
import servicios.Taller;

public class Main {
    /**
     * Punto de entrada principal de la aplicación.
     *
     * @param args argumentos recibidos desde la línea de comandos.
     */
    public static void main(String[] args) {

        // Crear el taller
        Taller taller = new Taller("Taller Motor Plus");

        // Crear vehículos
        Coche coche = new Coche("1234ABC", "Toyota", "Corolla", 18000, 5);
        Moto moto = new Moto("5678DEF", "Yamaha", "MT-07", 8000, true);

        Camion camion = new Camion("9012GHI", "Volvo", "FH16", 25000, 20);

        // Crear cliente
        Cliente cliente = new Cliente("Carlos García", "600123123", "carlos@email.com");

        // Asignar vehículos al cliente
        cliente.agregarVehiculo(coche);
        cliente.agregarVehiculo(moto);

        // Registrar vehículos en el taller
        taller.registrarVehiculo(coche);
        taller.registrarVehiculo(moto);
        taller.registrarVehiculo(camion);

        // Mostrar información de los vehículos del cliente
        System.out.println("\n=== CLIENTE ===");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        cliente.mostrarVehiculos();

        // Mostrar todos los vehículos del taller
        taller.mostrarVehiculos();

        // Mostrar costes de mantenimiento
        taller.mostrarCostesMantenimiento();

        // Comprobar mantenimiento
        System.out.println("\n=== MANTENIMIENTO ===");

        comprobarMantenimiento(coche);
        comprobarMantenimiento(moto);
        comprobarMantenimiento(camion);

        // Crear reparaciones
        Reparacion reparacionCoche = new Reparacion(coche, "Cambio de aceite y filtros", 180.50);
        Reparacion reparacionCamion = new Reparacion(camion, "Revisión de frenos", 450.00);

        // Registrar reparaciones
        taller.registrarReparacion(reparacionCoche);
        taller.registrarReparacion(reparacionCamion);

        // Mostrar reparaciones
        taller.mostrarReparaciones();
    }

    private static void comprobarMantenimiento(Vehiculo vehiculo) {

        if (vehiculo.necesitaMantenimiento()) {
            System.out.println(
            vehiculo.getMarca() + " " + vehiculo.getModelo() + " necesita mantenimiento.");

            // Polimorfismo: se ejecuta la implementación
            // correspondiente al tipo real de vehículo.
            vehiculo.mostrarInformacion();

        } else {
            System.out.println(
                vehiculo.getMarca() + " "+ vehiculo.getModelo() + " no necesita mantenimiento."
            );
        }
    }
}
