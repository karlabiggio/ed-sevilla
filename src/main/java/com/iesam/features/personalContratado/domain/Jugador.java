package com.iesam.features.personalContratado.domain;

public class Jugador extends Personal{
    private final String demarcacion;

    public Jugador(String id, String nombre, String apellidos, String fechaNacimiento, String demarcacion) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
}
