package be.vdab.jpfhfdst08;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {

        var waarnemer = new Waarnemer();

        var scanner = new Scanner(System.in);
        System.out.println("Geef een temperatuur in (999 om te stoppen): ");
        var temperatuur = scanner.nextInt();

        while (temperatuur != 999) {
            waarnemer.registreerTemp(temperatuur);
            System.out.println("Geef een temperatuur in (999 om te stoppen): ");
            temperatuur = scanner.nextInt();
        }

        System.out.println("Het aantal ingegeven temperaturen is " + waarnemer.getAantalWaarnemingen());
        System.out.println("De hoogste temperatuur is " + waarnemer.getMaxTemp() + "° Celsius");
        System.out.println("De laagste temperatuur is " + waarnemer.getMinTemp() + "° Celsius");
        System.out.println("De gemiddelde temperatuur bedraagt " + waarnemer.getAvgTemp() + "° Celsius");

    }
}
