package com.iesam.features.partidos.data;

import com.iesam.features.partidos.data.local.PartidoFileLocalDataSource;
import com.iesam.features.partidos.domain.Partidos;

public class PartidoDataRepository {
    private PartidoFileLocalDataSource partidoFileLocalDataSource;

    public PartidoDataRepository(PartidoFileLocalDataSource partidoFileLocalDataSource) {
        this.partidoFileLocalDataSource = partidoFileLocalDataSource;
    }
    public void save(Partidos partidos) {
        partidoFileLocalDataSource.save(partidos);
    }
    public Partidos obtain(String id) {
        return partidoFileLocalDataSource.obtain(id);
    }
}
