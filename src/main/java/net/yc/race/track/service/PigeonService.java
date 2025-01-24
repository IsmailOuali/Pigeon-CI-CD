package net.yc.race.track.service;

import net.yc.race.track.model.Pigeon;

import java.util.List;
import java.util.Optional;


public interface PigeonService {

     String savePigeon(Pigeon pigeon, Long userId);
     Optional<Pigeon> findPigeonById(Long pigeonId);
     String generateUniqueBadge(Pigeon pigeon);
     List<Pigeon> findPigeons();
     String deletePigeonById(Long id);
}
