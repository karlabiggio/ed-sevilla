package com.iesam.features.personalContratado.domain;

public class GetJugadorUseCase {
    private final JugadorRepository jugadorRepository;

    public GetJugadorUseCase(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    public Jugador obtain(String id) {
        return jugadorRepository.obtainJugador(id);
    }
}
