package be.vdab.gastenboek;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager {

    public void schrijfNaarBestand(Gastenboek gastenboek) {
        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(Path.of("/data/gastenboek.ser")))) {
            outputStream.writeObject(gastenboek);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public Gastenboek leesUitBestand() {
        var gastenboek = new Gastenboek();
        try (var inputStream = new ObjectInputStream(Files.newInputStream(Path.of("/data/gastenboek.ser")))) {
            gastenboek = (Gastenboek) inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
        return gastenboek;
    }
}
