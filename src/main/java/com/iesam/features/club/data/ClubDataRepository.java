package com.iesam.features.club.data;

import com.iesam.features.club.data.local.ClubFileLocalDataSource;
import com.iesam.features.club.domain.Club;
import com.iesam.features.club.domain.ClubRepository;

public class ClubDataRepository implements ClubRepository {

    private final ClubFileLocalDataSource clubFileLocalDataSource;

    public ClubDataRepository(ClubFileLocalDataSource clubFileLocalDataSource) {
        this.clubFileLocalDataSource = clubFileLocalDataSource;
    }

    @Override
    public void saveClub(Club club) {
    clubFileLocalDataSource.save(club);
    }

    @Override
    public Club obtainClub(String id) {
        return clubFileLocalDataSource.obtain(id);
    }
}
