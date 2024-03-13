package com.iesam.features.personalContratado.domain;

public class Personal {
    private final String id;
    private final String nombre;
    private final String apellidos;
    private final String fechaNacimiento;

    public Personal(String id, String nombre, String apellidos, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
