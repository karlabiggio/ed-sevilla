package com.iesam.features.partidos.domain;

import com.iesam.features.arbitros.Arbitro;
import com.iesam.features.club.domain.Club;

public class Partidos {
    private final String idUnico;
    private final Club clubLocal;
    private final Club clubVisitante;
    private final Arbitro arbitro;
    private final String resultado;
    private final String fechaPartido;

    public Partidos(String idUnico, Club clubLocal, Club clubVisitante, Arbitro arbitro, String resultado, String fechaPartido) {
        this.idUnico = idUnico;
        this.clubLocal = clubLocal;
        this.clubVisitante = clubVisitante;
        this.arbitro = arbitro;
        this.resultado = resultado;
        this.fechaPartido = fechaPartido;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public Club getClubLocal() {
        return clubLocal;
    }

    public Club getClubVisitante() {
        return clubVisitante;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public String getResultado() {
        return resultado;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }
}
