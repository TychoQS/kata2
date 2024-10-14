package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Tycho\\Documents\\title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        Map<Integer, Integer> stats = new HashMap<>();
        for (Title title : titles) {
            stats.put(title.getYear(), stats.getOrDefault(title.getYear(), 0) + 1);
        }
        StatsDisplayer histogramStatsDisplayer = new HistogramStatsDisplayer(new FromMapHistogramElementBuilder(stats));
        histogramStatsDisplayer.displayStats();
    }
}
