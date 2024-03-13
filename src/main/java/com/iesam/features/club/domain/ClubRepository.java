package com.iesam.features.club.domain;

public interface ClubRepository {
    void saveClub(Club club);
    Club obtainClub(String id);

}
