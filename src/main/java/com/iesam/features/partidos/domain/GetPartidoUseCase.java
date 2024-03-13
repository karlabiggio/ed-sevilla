package com.iesam.features.partidos.domain;

public class GetPartidoUseCase {
    private final PartidosRepository partidosRepository;

    public GetPartidoUseCase(PartidosRepository partidosRepository) {
        this.partidosRepository = partidosRepository;
    }
    public Partidos obtain(String id) {
        return partidosRepository.obtainPartidos(id);
    }
}
