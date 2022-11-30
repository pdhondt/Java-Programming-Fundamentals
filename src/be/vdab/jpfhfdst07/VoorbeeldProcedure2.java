package be.vdab.jpfhfdst07;

import java.util.Arrays;

public class VoorbeeldProcedure2 {
    public static void main(String[] args) {

        var getallen = new int[50];

        // GENEREREN van 50 willekeurige getallen
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }

        // Toon ONGESORTEERD resultaat
        toonTabel(getallen, "Ongesorteerd");

        // SORTEREN van de 50 getallen
        Arrays.sort(getallen);

        // Toon GESORTEERD resultaat
        toonTabel(getallen, "Gesorteerd");

    } // einde main

    private static void toonTabel(int[] teTonenTabel, String titel) {
        System.out.println("\n" + titel);
        for (var getal : teTonenTabel) {
            System.out.print(getal + "\t");
        }
    }
} // einde class VoorbeeldProcedure2
