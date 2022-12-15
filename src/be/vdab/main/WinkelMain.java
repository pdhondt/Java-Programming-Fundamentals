package be.vdab.main;

import be.vdab.winkel.Catalogus;
import be.vdab.winkel.Mandje;

public class WinkelMain {
    public static void main(String[] args) {

        var catalogus = new Catalogus();
        var mandje = new Mandje();
        var i = 1;
        for (var product : catalogus.getProducten()) {
            if (i % 2 == 1) {
                mandje.add(product, i);
            }
            i++;
        }

        System.out.println("\nDe inhoud van uw mandje is:");
        for (var artikel : mandje.getInhoud().entrySet()) {
            System.out.println(artikel.getKey().getOmschrijving() + " (prijs: " + artikel.getKey().getPrijs() + "€), aantal stuks: " + artikel.getValue());
        }

        System.out.println();
        System.out.println("Het totaal te betalen bedrag is " + mandje.getTotalePrijs() + "€");

        mandje.clear();

        System.out.println("\nDe inhoud van uw mandje is:");
        for (var artikel : mandje.getInhoud().entrySet()) {
            System.out.println(artikel.getKey().getOmschrijving() + " (prijs: " + artikel.getKey().getPrijs() + "€), aantal stuks: " + artikel.getValue());
        }

    }
}
