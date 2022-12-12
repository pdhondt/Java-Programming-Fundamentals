package be.vdab.jpfhfdst20;

import java.util.TreeSet;

public class VBTreeSet {
    public static void main(String[] args) {
        var ts = new TreeSet<String>();
        ts.add("fiets");
        ts.add("even");
        ts.add("dak");
        ts.add("citroen");
        ts.add("boom");
        ts.add("aap");
        //ts.add(null);
        ts.add("dak");

        System.out.println("Voorbeeld van een TreeSet:");
        for (var woord : ts) {
            System.out.println(woord);
        }

        //Extra methods
        //De klasse TreeSet heeft wel extra methods, omdat deze klasse niet alleen de interface Set, maar ook de
        //interface SortedSet implementeert, en dus de extra methods van SortedSet beschikbaar heeft.  Daarbovenop
        //heeft TreeSet ook nog zijn eigen constructors en methods
        System.out.println("\nExtra methods:");
        System.out.println("Eerste element: " + ts.first());
        System.out.printf("Laatste element: " + ts.last());

    }
}
