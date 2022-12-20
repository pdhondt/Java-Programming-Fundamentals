package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ArtiestenEnHunAlbums {
    private static final Path PATH = Path.of("/data/albumsartists.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.collect(Collectors.groupingBy(regel -> regel.substring(regel.indexOf(',') + 1)))
                    .entrySet()
                    .stream()
                    .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                    .forEach(entry -> {
                        System.out.println(entry.getKey() + ":");
                        entry.getValue().stream()
                                .sorted()//((album1, album2) -> album1.compareTo(album2))
                                .forEach(value -> System.out.println("\t" + value.substring(0, value.indexOf(','))));
                                /*.map(regel -> regel.substring(0, regel.indexOf(',')))
                                .sorted()
                                .forEach(album -> System.out.println("\t" + album));*/
                    });
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
