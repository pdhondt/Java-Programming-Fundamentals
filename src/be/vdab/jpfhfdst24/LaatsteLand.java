package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LaatsteLand {
    private static final Path PATH = Path.of("/data/landcodes.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.map(regel -> regel.substring(regel.indexOf(' ') + 1))
                    .max((land1, land2) -> land1.compareTo(land2))
                    .ifPresent(laatste -> System.out.println(laatste));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
