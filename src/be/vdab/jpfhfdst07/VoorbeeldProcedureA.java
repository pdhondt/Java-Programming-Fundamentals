package be.vdab.jpfhfdst07;

import java.util.Arrays;

public class VoorbeeldProcedureA {
    public static void main(String[] args) {
        var getallen = new int[50];

        // GENEREREN van 50 willekeurige getallen
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }

        // Toon ONGESORTEERD resultaat
        System.out.println("Ongesorteerd");
        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
        System.out.println("");

        // SORTEREN van de 50 getallen
        Arrays.sort(getallen);

        // Toon GESORTEERD resultaat = HERHALING VAN CODE!!
        System.out.println("Gesorteerd");
        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
    }
}
