package com.iesam.features.personalContratado.domain;

import java.util.ArrayList;

public class GetJugadoresUseCase {
    private final JugadorRepository jugadorRepository;

    public GetJugadoresUseCase(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    public ArrayList<Jugador> obtain() {
        return jugadorRepository.obtainJugadores();
    }
}
