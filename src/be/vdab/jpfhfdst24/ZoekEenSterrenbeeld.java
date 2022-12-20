package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ZoekEenSterrenbeeld {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");
    public static void main(String[] args) {
        System.out.println("Geef een woord in:");
        var scanner = new Scanner(System.in);
        var woord = scanner.next().toLowerCase();
        try (var stream = Files.lines(PATH)) {
            stream.filter(beeld -> beeld.toLowerCase().contains(woord))
                    .forEach(beeldMetWoord -> System.out.println(beeldMetWoord));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
