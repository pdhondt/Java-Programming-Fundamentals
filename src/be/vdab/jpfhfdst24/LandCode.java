package be.vdab.jpfhfdst24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class LandCode {

    private static Optional<String> zoekLandOpCode(String landCode) {
        try (var reader = Files.newBufferedReader(Path.of("/data/landcodes.txt"))) {
            for (String regel; (regel = reader.readLine()) != null;) {
                var onderdelen = regel.split(" ");
                if (onderdelen[0].equals(landCode)) {
                    return Optional.of(onderdelen[1]);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        zoekLandOpCode("BE").ifPresent(land -> System.out.println(land));
        zoekLandOpCode("NL").ifPresent(land -> System.out.println(land));
        zoekLandOpCode("ES").ifPresent(land -> System.out.println(land));
        zoekLandOpCode("XX").ifPresent(land -> System.out.println(land));
        System.out.println(zoekLandOpCode("XX").orElse("Code niet gevonden"));
    }
}
