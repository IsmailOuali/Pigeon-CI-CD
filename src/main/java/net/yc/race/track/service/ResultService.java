package net.yc.race.track.service;

import net.yc.race.track.model.Result;

import java.util.List;

public interface ResultService {
     List<Result> showResult(Long competitionId);
     String saveResult(Result result);
     double calculateDistance(String gps1, String gps2);
     List<Result> findResults();
     String deleteResultById(Long id);
     String exportResultsToPdf(Long competitionId, String outputPath);

}
