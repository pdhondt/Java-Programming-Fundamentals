package be.vdab.jpfhfdst20;

import java.util.ArrayList;
import java.util.TreeSet;

public class TienKamperMain {
    public static void main(String[] args) {
        var alTienkampers = new ArrayList<TienKamper>();
        alTienkampers.add(new TienKamper("Hans Van Alphen", 8200));
        alTienkampers.add(new TienKamper("Thomas Van Der Plaetsen", 8157));
        alTienkampers.add(new TienKamper("Frédéric Xhonneux", 8142));
        alTienkampers.add(new TienKamper("François Gourmet", 7955));

        System.out.println("\nTienkampers opgeslagen in een ArrayList Collection (volgorde van toevoegen):");
        for (var atleet : alTienkampers) {
            System.out.println(atleet);
        }

        var tsTienkampers = new TreeSet<TienKamper>();
        tsTienkampers.add(new TienKamper("Hans Van Alphen", 8200));
        tsTienkampers.add(new TienKamper("Thomas Van Der Plaetsen", 8157));
        tsTienkampers.add(new TienKamper("Frédéric Xhonneux", 8142));
        tsTienkampers.add(new TienKamper("François Gourmet", 7955));

        System.out.println("\nTienkampers opgeslagen in een TreeSet Collection (gesorteerd op naam):");
        for (var atleet : tsTienkampers) {
            System.out.println(atleet);
        }
    }
}
