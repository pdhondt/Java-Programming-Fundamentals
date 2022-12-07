package be.vdab;

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
        voorwerpen[2] = new Leesboek();
        voorwerpen[3] = new Leesboek("The Hobbit", "JRR Tolkien", 35.0F, "Fantasy", "Prequel Lord of the Rings");
        voorwerpen[4] = new Woordenboek();
        voorwerpen[5] = new Woordenboek("Woordenboek Spaans", "El traductor", 23.0F, "Studieboeken", "Spaans");
        for (var voorwerp : voorwerpen) {
            System.out.println("\nGegevens via toString() method:");
            System.out.println(voorwerp);
            voorwerp.gegevensTonen();
            totaleWinst += voorwerp.winstBerekenen();
        }
        System.out.println("\nDe totale winst bedraagt: " + totaleWinst);
    }
}

