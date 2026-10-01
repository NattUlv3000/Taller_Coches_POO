# Taller_Coches_POO

Proyecto de Java orientado a demostrar conceptos de Programación Orientada a Objetos (POO) avanzada mediante la simulación de un taller de vehículos.

## Tecnologías

- Java 21
- Maven
- IntelliJ IDEA

## Conceptos de POO

El proyecto utiliza:

- Encapsulación
- Herencia
- Clases abstractas
- Polimorfismo
- Interfaces
- Implementación de interfaces
- Sobrescritura de métodos (`@Override`)
- Composición y relaciones entre objetos

## Estructura del proyecto

```text
src/
├── Main.java
├── modelo/
│   ├── Vehiculo.java
│   ├── Coche.java
│   ├── Moto.java
│   ├── Camion.java
│   ├── Cliente.java
│   └── Reparacion.java
├── interfaces/
│   └── Mantenible.java
└── servicios/
    └── Taller.java