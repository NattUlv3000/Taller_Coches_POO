package modelo;

import interfaces.Mantenible;

public class Coche extends Vehiculo implements Mantenible {
    private int numeroPuertas;

    public Coche(String matricula, String marca, String modelo, int kilometros, int numeroPuertas) {
        super(matricula, marca, modelo, kilometros);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche: " + getMarca() + " " + getModelo()
                        + " | Matrícula: " + getMatricula()
                        + " | Puertas: " + numeroPuertas
        );
    }

    @Override
    public double calcularMantenimiento() {
        return 150.0;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del coche " + getMatricula());
    }

    @Override
    public boolean necesitaMantenimiento() {
        return getKilometros() >= 15000;
    }
}