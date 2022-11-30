package be.vdab.jpfhfdst07;

import java.util.Scanner;

public class JPFhfdst07 {
    public static void main(String[] args) {
        var a = 5;
        {
            // Dit is een blok binnen het main blok
            var b = 6;
            System.out.println("a is " + a);
            System.out.println("b is " + b);
        }
        System.out.println("a is " + a);
        // Volgende lijn geeft een foutmelding aangezien de variabele b
        // niet gekend is buiten het blok hierboven
        // System.out.println("b is " + b);

        var getal1 = 6;
        int getal2;
        if (getal1 % 2 == 0) {
            System.out.println("Het getal " + getal1 + " is even.");
            getal2 = getal1 * 3;
        } else {
            System.out.println("Het getal " + getal1 + " is oneven.");
        }

        var c = 5;
        var d = 7;
        var grootste = c < d ? d : c;
        System.out.println("grootste is " + grootste);

        /*System.out.println("Geef een keuze in van 1 tot 3: ");
        var scanner = new Scanner(System.in);
        var menuKeuze = scanner.nextInt();
        switch (menuKeuze) {
            case 1:
                System.out.println("Keuze 1");
                break;
            case 2:
                System.out.println("Keuze 2");
                break;
            case 3:
                System.out.println("Keuze 3");
                break;
            default:
                System.out.println("Geen keuze 1 tot 3 ingegeven");
                break;
        }*/

        /*boolean isWeekend;
        System.out.println("Geef een willekeurige dag in: ");
        var scanner2 = new Scanner(System.in);
        var dag = scanner2.next();
        switch (dag) {
            case "maandag":
            case "dinsdag":
            case "woensdag":
            case "donderdag":
            case "vrijdag":
                isWeekend = false;
                break;
            case "zaterdag":
            case "zondag":
                isWeekend = true;
                break;
            default:
                throw new IllegalArgumentException(dag + " bestaat niet");
        }
        System.out.println(isWeekend ? dag + " is weekend" : dag + " is een werkdag");*/

        /*System.out.println("Geef een willekeurige dag in: ");
        var scanner3 = new Scanner(System.in);
        var dag2 = scanner3.next();
        boolean isWeekend2 = switch (dag2) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" -> false;
            case "zaterdag", "zondag" -> true;
            default -> throw new IllegalArgumentException(dag2 + " bestaat niet");
        };
        System.out.println(isWeekend2 ? dag2 + " is weekend" : dag2 + " is een werkdag");*/

        System.out.println("Geef een willekeurige dag in: ");
        var scanner4 = new Scanner(System.in);
        var dag3 = scanner4.next();
        switch (dag3) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" ->
                    System.out.println(dag3 + " is een werkdag");
            case "zaterdag", "zondag" -> System.out.println(dag3 + " is weekend");
            default -> throw new IllegalArgumentException(dag3 + " bestaat niet");
        }

        var teller = 1;
        while (teller <= 10) {
            System.out.println(teller);
            teller++;
        }

        var teller2 = 15;
        do {
            System.out.println(teller2);
            teller2++;
        }
        while (teller2 <= 10);

        for (var teller3 = 0; teller3 <= 8; teller3++) {
            System.out.println(teller3);
        }

        var getallen = new int[5];
        for (var teller4 = 0; teller4 < getallen.length; teller4++) {
            getallen[teller4] = teller4 + 20;
        }
        for (var getal : getallen) {
            System.out.println(getal);
        }

    }
}
