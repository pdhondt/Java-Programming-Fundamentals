package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class JPFhfdst12 {

    public static void main(String[] args) {

        // var tekst = new String ("abc");
        var tekst = "abc";
        System.out.println(tekst);
        tekst += "def";
        System.out.println(tekst);
        tekst = "\nEn hier \t zitten de \"aanhalingstekens\" dan.\n";
        System.out.println(tekst);

        /*var bedrijf = "VDAB";
        var scanner = new Scanner(System.in);
        System.out.println("Geef een bedrijf in:");
        var invoerBedrijf = scanner.next();
        System.out.println(invoerBedrijf.equals(bedrijf));
        System.out.println("Via equalsIgnoreCase(): " + invoerBedrijf.equalsIgnoreCase(bedrijf));*/

        var tekst1 = "xyz";
        var tekst2 = "xyz";
        var tekst3 = new String("xyz");
        System.out.println("\nTekst 1 en 2 met == " + (tekst1 == tekst2));
        System.out.println("Tekst 1 en 2 met equals " + tekst1.equals(tekst2));
        System.out.println("Tekst 1 en 3 met == " + (tekst1 == tekst3));
        System.out.println("Tekst 1 en 3 met == " + tekst1.equals(tekst3));

        var tekst4 = "klm";
        var tekst5 = "abcdefghi";
        var tekst6 = "uvwxyz";
        var tekst7 = "defg";
        var tekst8 = "x";
        System.out.println("\ntekst1 compareTo() tekst4 " + tekst1.compareTo(tekst4));
        System.out.println("tekst1 compareTo() tekst2 " + tekst1.compareTo(tekst2));
        System.out.println("tekst1 compareTo() tekst5 " + tekst1.compareTo(tekst5));
        System.out.println("tekst1 compareTo() tekst6 " + tekst1.compareTo(tekst6));
        System.out.println("tekst1 compareTo() tekst7 " + tekst1.compareTo(tekst7));
        System.out.println("tekst5 compareTo() tekst6 " + tekst5.compareTo(tekst6));
        System.out.println("tekst5 compareTo() tekst8 " + tekst5.compareTo(tekst8) + "\n");

        // Strings wijzigen
        // Strings zijn immutable, de methods geven dus een nieuwe string terug, ze wijzigen de bestaande string niet
        // Je bewaart het resultaat in een nieuwe referentievariabele, of we gebruiken dezelfde variabele,
        // en bewaren hier de nieuwe referentie in
        var woord = "hallo";
        System.out.println(woord.replace('a', 'e'));
        System.out.println(woord);
        var woordGewijzigd = (woord.replace('h', 'k'));
        System.out.println(woordGewijzigd);
        woord = woord.replace('a', 'o');
        System.out.println(woord);

        var woord2 = "Hallo";
        woord2 = woord2.toLowerCase();
        System.out.println("\n" + woord2);
        System.out.println(woord2.toUpperCase());
        System.out.println(woord2);

        var zinMetWhitespaces = "   Hallo mevrouw      ";
        System.out.println("\n---- " + zinMetWhitespaces + " ----");
        System.out.println("---- " + zinMetWhitespaces.trim() + " ----");

        var zinZonderIndent = "hallo mevrouw";
        System.out.println("\n" + zinZonderIndent);
        System.out.println(zinZonderIndent.indent(1));
        System.out.println(zinZonderIndent.indent(2));
        System.out.println(zinZonderIndent.indent(3));

        // Strings onderzoeken
        var joinVoorbeeld = String.join(" | ", "This", "is", "a", "joined", "string");
        System.out.println("\n" + joinVoorbeeld);

        var legeString = "";
        System.out.println("\n" + legeString.isEmpty());
        System.out.println(zinZonderIndent.substring(1, 9));
        System.out.println(woord2.charAt(2));
        System.out.println(zinZonderIndent.indexOf("o"));
        System.out.println(zinZonderIndent.lastIndexOf("o") + "\n");

        // Strings opsplitsen
        var tekst9 = "Dit is een stukje tekst";
        var stukjes = tekst9.split(" ");
        for (var stukje : stukjes) {
            System.out.println(stukje);
        }

        System.out.println();
        var tekst10 = "Dit is nog een stukje tekst";
        var tekst10AlsArray = tekst10.split(" ", 3);
        for (var element : tekst10AlsArray) {
            System.out.println(element);
        }
        System.out.println();

        // Strings: conversie van en naar primitive types
        // Hiervoor wordt gebruik gemaakt van WRAPPERCLASSES

        // String naar primitive type
        var tekst11 = "5.0";
        var temperatuur = Double.parseDouble(tekst11);
        System.out.println(temperatuur);

        tekst11 = "7";
        var geluksgetal = Integer.parseInt(tekst11);
        System.out.println(geluksgetal);
        System.out.println();

        // Primitive type naar String
        var temp = 5.0;
        var tekst12 = String.valueOf(temp);
        System.out.println(tekst12);

        var luckyNumber = 8;
        tekst12 = String.valueOf(luckyNumber);
        System.out.println(tekst12);
        System.out.println();

        // StringBuilder class
        var naam = new StringBuilder("Eddy");
        System.out.println(naam);
        System.out.println(naam.length());

        naam.append(' ');
        naam.append("Wally");
        naam.append(" is de nr 1");
        System.out.println(naam);
        naam.insert(0, "De grote ");
        System.out.println(naam);
        naam.delete(0, 9);
        System.out.println(naam);
        System.out.println(naam.length());

        var naam2 = new StringBuffer("De_Ronde_Van_Vlaanderen");
        for (var teller = 0; teller < naam2.length(); teller++) {
            if (naam2.charAt(teller) == '_') {
                naam2.setCharAt(teller, ' ');
            }
        }
        System.out.println(naam2);
        System.out.println();

        // Text Blocks
        var voorTekstBlokken = "{\r\n   \"Opleiding\": \"Java Ontwikkelaar\" \r\n   \"Cursus\": \"Java Programming Fundamentals\"  \r\n}";
        var metTekstBlokken = """
                {
                    "Opleiding": "Java Ontwikkelaar"
                    "Cursus": "Java Programming Fundamentals"
                }
                """;
        System.out.println(voorTekstBlokken);
        System.out.println(metTekstBlokken);
    }
}
