package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Artiestennamen {
    private static final Path PATH = Path.of("/data/albumsartists.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.map(regel -> regel.substring(regel.indexOf(',') + 1))
                    .distinct()
                    .sorted()
                    .forEach(artiest -> System.out.println(artiest));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
