package com.iesam.features.personalContratado.domain;

public class Entrenador extends Personal{
    private final String estrategia;

    public Entrenador(String id, String nombre, String apellidos, String fechaNacimiento, String estrategia) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
}
