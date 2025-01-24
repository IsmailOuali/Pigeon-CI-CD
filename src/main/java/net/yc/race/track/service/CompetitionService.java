package net.yc.race.track.service;

import net.yc.race.track.model.Competition;

import java.util.List;
import java.util.Optional;


public interface CompetitionService {
         String saveCompetition(Competition competition, Long seasonId);
         double calculateDistance(String gps1, String gps2);
         String updatePigeonToCompetition(Competition competition, Long pigeonId);
         List<Competition> findCompetitions();
         Optional<Competition> findCompetitionById(Long id);
         String deleteCompetitionById(Long id);
}
