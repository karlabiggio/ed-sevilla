package com.iesam.features.personalContratado.domain;

public class CreateJugadorUseCase {
    private final JugadorRepository jugadorRepository;

    public CreateJugadorUseCase(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    public void save(Jugador jugador) {
        jugadorRepository.saveJugador(jugador);
    }

}
