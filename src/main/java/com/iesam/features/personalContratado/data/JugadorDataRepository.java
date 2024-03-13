package com.iesam.features.personalContratado.data;

import com.iesam.features.personalContratado.data.JugadorFileLocalDataSource.JugadorFileLocalDataSource;
import com.iesam.features.personalContratado.domain.Jugador;

public class JugadorDataRepository {

    public JugadorFileLocalDataSource jugadorFileLocalDataSource;

    public JugadorDataRepository(JugadorFileLocalDataSource jugadorFileLocalDataSource) {
        this.jugadorFileLocalDataSource = jugadorFileLocalDataSource;
    }
    public void save(Jugador jugador) {
        jugadorFileLocalDataSource.save(jugador);
    }
    public Jugador obtain(String id) {
        return jugadorFileLocalDataSource.obtain(id);
    }
}
