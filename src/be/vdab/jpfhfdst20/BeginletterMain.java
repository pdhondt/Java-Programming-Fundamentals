package be.vdab.jpfhfdst20;

import java.util.HashMap;

public class BeginletterMain {
    public static void main(String[] args) {

        var woorden = new String[] {"Probeer", "uit", "te", "vissen", "hoeveel", "woorden", "er", "met", "een", "bepaalde",
            "beginletter", "starten", "door", "gebruik", "te", "maken", "van", "een", "HashMap"};

        var hmWoorden = new HashMap<Character, Integer>();
        for (var woord : woorden) {
            var eersteLetter = woord.toLowerCase().charAt(0);
            var aantal = hmWoorden.get(eersteLetter);
            aantal = (aantal == null) ? 1 : ++aantal;
            hmWoorden.put(eersteLetter, aantal);
        }

        //Andere manier om het aantal letters te tellen in de HashMap --> via de containsKey() Method
        /*for (var woord : woorden) {
            if (!hmWoorden.containsKey(woord.toLowerCase().charAt(0))) {
                hmWoorden.put(woord.toLowerCase().charAt(0), 1);
            } else {
                hmWoorden.put(woord.toLowerCase().charAt(0), hmWoorden.get(woord.toLowerCase().charAt(0)) + 1);
            }
        }*/

        System.out.println("\ntoString() method van HashMap");
        System.out.println(hmWoorden);

        System.out.println("\n*** Aantal woorden per letter ***");
        for (var letter : hmWoorden.keySet()) {
            System.out.println("Aantal woorden dat begint met de letter " + letter + " is: " + hmWoorden.get(letter));
        }

        System.out.println("\nDe grootte van de HashMap is " + hmWoorden.size());

        System.out.println("\nIs de hashMap leeg? " + hmWoorden.isEmpty());

        System.out.println("\n*** Set van de keys ***");
        for (var letter : hmWoorden.keySet()) {
            System.out.println(letter);
        }

        System.out.println("\n*** Collection van de values ***");
        for (var aantal : hmWoorden.values()) {
            System.out.println(aantal);
        }

        System.out.println("\n*** Set van de entries ***");
        for (var entry : hmWoorden.entrySet()) {
            System.out.println(entry);
        }

    }
}
