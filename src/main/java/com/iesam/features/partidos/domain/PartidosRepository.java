package com.iesam.features.partidos.domain;

public interface PartidosRepository {
    void savePartidos();
    Partidos obtainPartidos(String id);
}
