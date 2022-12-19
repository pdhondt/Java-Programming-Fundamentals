package be.vdab.gastenboek;

import java.util.Scanner;

public class GastenboekMain {
    public static void main(String[] args) {
        var gastenboekManager = new GastenboekManager();
        var gastenboek = gastenboekManager.leesUitBestand();
        var keuze = maakKeuze();
        while (!keuze.equals("E")) {
            if (keuze.equals("T")) {
                gastenboek = gastenboekManager.leesUitBestand();
                System.out.println(gastenboek);
            }
            if (keuze.equals("S")) {
                var scanner = new Scanner(System.in);
                System.out.println("Geef uw naam in: ");
                var naam = scanner.next();
                scanner.skip("\n");
                System.out.println("Geef het bericht in: ");
                var bericht = scanner.nextLine();
                try {
                    gastenboek.add(new GastenboekEntry(naam, bericht));
                } catch (IllegalArgumentException ex) {
                    System.err.println(ex);
                }

                gastenboekManager.schrijfNaarBestand(gastenboek);
            }
            keuze = maakKeuze();
        }
    }
    private static String maakKeuze() {
        System.out.println("\nOm het gastenboek in te kijken, druk T");
        System.out.println("Om een bericht in het gastenboek te schrijven, druk S");
        System.out.println("Om te eindigen, druk E");
        var scanner = new Scanner(System.in);
        return scanner.next();
    }
}
