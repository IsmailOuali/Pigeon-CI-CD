package net.yc.race.track.service;

import net.yc.race.track.model.Season;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface SeasonService {
     Season saveSeason(Season season);
     Optional<Season> findSeasonById(Long id);
     List<Map<String, Object>> getBreederRankings(Long seasonId);
     List<Season> findSeasons();
     String deleteSeasonById(Long id);
}
