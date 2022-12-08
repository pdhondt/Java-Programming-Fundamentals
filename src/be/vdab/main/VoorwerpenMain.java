package be.vdab.main;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class VoorwerpenMain {
    public static void main(String[] args) {
        float totaleWinst = 0.0F;
        var voorwerpen = new Voorwerp[6];
        voorwerpen[0] = new Boekenrek();
        voorwerpen[1] = new Boekenrek(180, 90, 350.0F);
        try {
            voorwerpen[2] = new Leesboek();
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage() + ": " + ex.getFoutIsbnNummer());
        }
        try {
            voorwerpen[3] = new Leesboek("The Hobbit", "JRR Tolkien", 35.0F, "Fantasy", "978-3-16-148410-0", "Prequel Lord of the Rings");
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage() + ": " + ex.getFoutIsbnNummer());
        }
        try {
            voorwerpen[4] = new Woordenboek();
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage() + ": " + ex.getFoutIsbnNummer());
        }
        try {
            voorwerpen[5] = new Woordenboek("Woordenboek Spaans", "El traductor", 23.0F, "Studieboeken", "", "Spaans");
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage() + ": " + ex.getFoutIsbnNummer());
        }
        for (var voorwerp : voorwerpen) {
            if (voorwerp != null) {
                System.out.println("\nGegevens via toString() method:");
                System.out.println(voorwerp);
                voorwerp.gegevensTonen();
                totaleWinst += voorwerp.winstBerekenen();
            }
        }
        System.out.println("\nDe totale winst bedraagt: " + totaleWinst);
    }
}

