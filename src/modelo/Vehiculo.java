package modelo;

import interfaces.Mantenible;

//Clase abstracta base de la que parten el resto y heredan
public abstract class Vehiculo implements Mantenible {

    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;

    public Vehiculo(String matricula, String marca, String modelo, int kilometros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    //Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    //Metodos genericos
    public abstract void mostrarInformacion();

    public abstract double calcularMantenimiento();

}