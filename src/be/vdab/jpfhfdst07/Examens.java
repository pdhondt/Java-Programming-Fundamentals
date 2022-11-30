package be.vdab.jpfhfdst07;

import java.util.Scanner;

public class Examens {
    public static void main(String[] args) {

        var wiskunde = geefPunten("wiskunde");
        var informatica = geefPunten("informatica");
        var boekhouden = geefPunten("boekhouden");

        var boekhoudenEnInformatica = boekhouden + informatica;

        if (wiskunde >= 6 && boekhoudenEnInformatica >= 12) {
            System.out.println("Student is geslaagd");
        } else {
            if (wiskunde < 6) {
                System.out.println("Student is niet geslaagd voor " +
                        "wiskunde");
            }
            if (boekhoudenEnInformatica < 12) {
                System.out.println("Student is niet geslaagd voor " +
                        "boekhouden en informatica samen");
            }
        }
    } // einde main

    private static int geefPunten(String vak) {
        System.out.println("Geef de punten voor " + vak + " (op 10)");
        var scanner = new Scanner(System.in);
        var punten = scanner.nextInt();

        while (punten < 0 || punten > 10) {
            System.out.println("Punten gaan op 10, " +
                    "dus gelieve een cijfer tussen 0 en 10 in te geven aub");
            punten = scanner.nextInt();
        }
        return punten;
    } // einde functie geefPunten()
} // einde class Examens
