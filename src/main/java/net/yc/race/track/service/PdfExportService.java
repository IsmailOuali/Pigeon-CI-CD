package net.yc.race.track.service;

import com.itextpdf.text.*;
import net.yc.race.track.model.Result;

import java.io.IOException;
import java.util.List;

public interface PdfExportService {

     void exportResultsToPdf(List<Result> results, String outputPath)throws DocumentException, IOException;

}
 
