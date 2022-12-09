package be.vdab.jpfhfdst20;

import java.util.ArrayList;

public class VBArrayList {

    public static void main(String[] args) {
        var al = new ArrayList<String>();
        al.add("fiets");
        al.add(null);
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen");
        al.add("boom");
        al.add("aap");

        System.out.println("Het 4e element is: " + al.get(3));

        System.out.println("De index van het eerste voorkomen van citroen is " + al.indexOf("citroen"));
        System.out.println("De index van het laatste voorkomen van citroen is " + al.lastIndexOf("citroen"));

        System.out.println("Voorbeeld van een ArrayList:");
        for (var woord : al) {
            System.out.println(woord);
        }

        //Collectie doorlopen met een iterator
        System.out.println("\nWeergave m.b.v. iterator");
        for (var i = al.iterator(); i.hasNext();) {
            var woord = i.next();
            System.out.println(woord);
        }
        System.out.println();

        //element toevoegen
        al.add(3, "test");
        for (var woord : al) {
            System.out.println(woord);
        }

    }
}
