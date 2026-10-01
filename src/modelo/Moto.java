package modelo;

import interfaces.Mantenible;

public class Moto extends Vehiculo implements Mantenible {

    private boolean tieneBaul;

    public Moto(String matricula, String marca, String modelo, int kilometros, boolean tieneBaul) {
        super(matricula, marca, modelo, kilometros);
        this.tieneBaul = tieneBaul;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto: " + getMarca() + " " + getModelo()
                        + " | Matrícula: " + getMatricula()
                        + " | Baúl: " + (tieneBaul ? "Sí" : "No")
        );
    }

    @Override
    public double calcularMantenimiento() {
        return 90.0;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println(
                "Realizando mantenimiento de la moto " + getMatricula()
        );
    }

    @Override
    public boolean necesitaMantenimiento() {
        return getKilometros() >= 10000;
    }
}