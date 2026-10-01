package modelo;

import interfaces.Mantenible;

public class Camion extends Vehiculo implements Mantenible {

    private double capacidadCarga;

    public Camion(String matricula, String marca, String modelo, int kilometros, double capacidadCarga) {
        super(matricula, marca, modelo, kilometros);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Camión: " + getMarca() + " " + getModelo()
                        + " | Matrícula: " + getMatricula()
                        + " | Capacidad: " + capacidadCarga + " toneladas"
        );
    }

    @Override
    public double calcularMantenimiento() {
        return 300.0;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del camión " + getMatricula());
    }

    @Override
    public boolean necesitaMantenimiento() {
        return getKilometros() >= 20000;
    }
}