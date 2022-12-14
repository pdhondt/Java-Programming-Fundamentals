package be.vdab.jpfhfdst20;

import java.util.TreeMap;

public class VBTreeMap {
    public static void main(String[] args) {
        var landen = new TreeMap<String, String>();
        landen.put("B", "België");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");

        var eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        var vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met de code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        System.out.println("\n*** View van de Keys ***");
        for (var eenLandCode : landen.keySet()) {
            System.out.println(eenLandCode);
        }

        System.out.println("\n*** View van de Keys met bijhorende value-waarde ***");
        for (var eenLandCode : landen.keySet()) {
            System.out.println(eenLandCode + " heeft als landnaam: " + landen.get(eenLandCode));
        }

        System.out.println("\n*** View van de Values ***");
        for (var eenLandNaam : landen.values()) {
            System.out.println(eenLandNaam);
        }

        System.out.println("\n*** View van de Key-Value-paren ***");
        for (var eenLandEntry : landen.entrySet()) {
            System.out.println(eenLandEntry);
        }
    }
}
