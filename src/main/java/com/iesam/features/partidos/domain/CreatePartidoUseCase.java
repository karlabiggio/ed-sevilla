package com.iesam.features.partidos.domain;

import com.iesam.features.club.domain.ClubRepository;

public class CreatePartidoUseCase {
    private final PartidosRepository partidosRepository;

    public CreatePartidoUseCase(PartidosRepository partidosRepository) {
        this.partidosRepository = partidosRepository;
    }

    public void save(Partidos partidos) {
        partidosRepository.savePartidos();
    }
}
