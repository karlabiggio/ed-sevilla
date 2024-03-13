package com.iesam.features.club.domain;

public class CreateClubUseCase {

    private final ClubRepository clubRepository;

    public CreateClubUseCase(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    public void execute(Club club) {
        clubRepository.saveClub(club);
    }
}
