package com.iesam.features.club.domain;

public class GetClubUseCase {

    private final ClubRepository clubRepository;

    public GetClubUseCase(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    public Club execute(String id) {
       return clubRepository.obtainClub(id);
    }
}
