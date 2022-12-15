package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PuntMain {
    public static void main(String[] args) {
        try (var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("/data/punt.ser")))) {
            stream.writeObject(new Punt(10, 20));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
