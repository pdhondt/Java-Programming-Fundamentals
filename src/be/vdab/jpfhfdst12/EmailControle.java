package be.vdab.jpfhfdst12;

public class EmailControle {
    public static void main(String[] args) {
        var email1 = "kamiel.kafka@praag.be";
        var email2 = "kamiel@kafka@praag.be";
        var email3 = "kamiel.kafka@";
        var email4 = "kamiel.kafka@praag";
        var email5 = "xyz";

        System.out.println("\nControle van: " + email1);
        controleer(email1);
        System.out.println("\nControle van: " + email2);
        controleer(email2);
        System.out.println("\nControle van: " + email3);
        controleer(email3);
        System.out.println("\nControle van: " + email4);
        controleer(email4);
        System.out.println("\nControle van: " + email5);
        controleer(email5);
    }

    private static void controleer(String s) {
        var antw = "";
        var lengte = s.length();
        if (lengte < 4) {
            antw += "e-mail adres is te kort\n";
        }

        var plaats = s.indexOf('@'); // @ mag maar 1 keer voorkomen
        if (plaats < 0) {
            antw += "Er moet een @ in het adres voorkomen.\n";
        }
        if (plaats == 0 || plaats == (--lengte)) {
            antw += "Een @ mag niet in de eerste of de laatste positie staan.\n";
        }
        if (plaats >= 0 && plaats != s.lastIndexOf('@')) {
            antw += "Er mag maar één @ voorkomen.\n";
        }
        if (s.lastIndexOf('.') < s.lastIndexOf('@')) {
            antw += "Na de @ moet er nog minstens één punt volgen.\n";
        }
        if (antw.length() == 0) {
            antw += "Alle controles zijn goed bevonden.\n";
        }
        System.out.println(antw);
    }
}
