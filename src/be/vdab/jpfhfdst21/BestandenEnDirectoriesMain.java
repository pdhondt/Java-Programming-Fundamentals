package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class BestandenEnDirectoriesMain {
    public static void main(String[] args) {
        var afbeeldingen = Path.of("/data/afbeeldingen");
        System.out.println(afbeeldingen);
        System.out.println(afbeeldingen.getParent());
        var huidigeDirectory = Path.of("waarBevindIkMijNu");
        System.out.println(huidigeDirectory.toAbsolutePath());
        System.out.println(huidigeDirectory.toAbsolutePath().getParent());

        System.out.println(Files.exists(Path.of("/data")));

        var data = Path.of("/data");
        System.out.println(Files.isDirectory(data));
        System.out.println(Files.isRegularFile(data));

        try {
            Files.createDirectory(Path.of("/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.move(Path.of("/data/afbeeldingen"), Path.of("/data/images"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.delete(Path.of("/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println(Files.size(Path.of("/data/images/duimop.jpg")));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.copy(Path.of("/data/images/duimop.jpg"), Path.of("/data/images/thumbup.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.move(Path.of("/data/images/thumbup.jpg"), Path.of("/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.delete(Path.of("/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        /*
        System.out.println("\n*** Volledig bestand inlezen ***");
        try {
            var regels = Files.readAllLines(Path.of("/data/insecten1.csv"));
            for (var regel : regels) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        */

        /*
        System.out.println("\n*** Bestand in blokken inlezen ***");
        try {
            var reader = Files.newBufferedReader(Path.of("/data/insecten1.csv"));
            try {
                //kortere schrijfwijze
                String regel;
                while ((regel = reader.readLine()) != null) {
                    System.out.println(regel);
                //var regel = reader.readLine();
                //while (regel != null) {
                    //System.out.println(regel);
                    //regel = reader.readLine();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                reader.close();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        */

        System.out.println("\nNog korter geschreven via Try with resources");
        try (var reader = Files.newBufferedReader(Path.of("/data/insecten1.csv"))) {
                for (String regel; (regel = reader.readLine()) != null;) {
                    System.out.println(regel);
                }
            } catch (IOException ex) {
                System.out.println(ex);
        }

        try (var writer = Files.newBufferedWriter(Path.of("/data/naam.txt"))) {
            writer.write("Peter");
            writer.write("\nLeo");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        var scanner = new Scanner(System.in);
        System.out.println("Geef getallen in.  Tik 0 om te stoppen:");
        try (var writer = new PrintWriter(Files.newBufferedWriter(Path.of("/data/getallen.txt")))) {
            for (int getal; (getal = scanner.nextInt()) != 0;) {
                writer.println(getal);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (var scanner2 = new Scanner(Files.newBufferedReader(Path.of("/data/getallen.txt")))) {
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextInt());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (var input = Files.newInputStream(Path.of("/data/images/duimop.jpg"));
            var output = Files.newOutputStream(Path.of("/data/images/thumbup.jpg"))) {
                for (int eenByte; (eenByte = input.read()) != -1;) {
                    output.write(eenByte);
                }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (var stream = Files.newDirectoryStream(Path.of("/data"))) {
            for (var path : stream) {
                System.out.print(path);
                System.out.println(Files.isDirectory(path) ? ":directory" : ":bestand");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
