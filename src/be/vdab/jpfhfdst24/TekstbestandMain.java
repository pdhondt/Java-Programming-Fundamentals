package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TekstbestandMain {
    private static final Path PATH = Path.of("/data/languages.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.forEach(regel -> System.out.println(regel));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
