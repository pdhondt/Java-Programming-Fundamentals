package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class Klinkers {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Geef een zin in:");
        var zin = scanner.nextLine().toLowerCase();
        int aantalKlinkers = 0;

        for (var i = 0; i < zin.length(); i++) {
            var letter = zin.charAt(i);
            if (("aeiou").indexOf(letter) > -1) {
                aantalKlinkers++;
            }
            // Andere manier
            /*if (zin.charAt(i) == 'a' || zin.charAt(i) == 'e' || zin.charAt(i) == 'i' || zin.charAt(i) == 'o' || zin.charAt(i) == 'u') {
                aantalKlinkers++;
            }*/
        }
        System.out.println("Het aantal klinkers in de zin \"" + zin + "\" bedraagt " + aantalKlinkers);
    }
}
