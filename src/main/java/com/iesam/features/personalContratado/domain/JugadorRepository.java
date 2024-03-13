package com.iesam.features.personalContratado.domain;

import java.util.ArrayList;

public interface JugadorRepository {

    void saveJugador(Jugador jugador);
    Jugador obtainJugador(String id);
    ArrayList<Jugador> obtainJugadores();
}
