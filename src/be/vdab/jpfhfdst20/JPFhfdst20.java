package be.vdab.jpfhfdst20;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class JPFhfdst20 {
    public static void main(String[] args) {
        var tekst = "auto";
        System.out.println(tekst + ", hashcode: " + tekst.hashCode());

        tekst = "huis";
        System.out.println(tekst + ", hashcode: " + tekst.hashCode());

        System.out.println("\nNatuurlijke volgorde");
        var fruit = new TreeSet<String>();
        fruit.addAll(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        for (var stukFruit : fruit) {
            System.out.println(stukFruit + " ");
        }

        System.out.println("\nEigen volgorde via aparte Comparator klasse");
        var fruit2 = new TreeSet<String>(new DescendingComparator());
        fruit2.addAll(List.of("Banaan", "Appel", "Peer", "Aardbei", "Druif"));
        for (var stukFruit : fruit2) {
            System.out.println(stukFruit + " ");
        }

        System.out.println("\nEigen Comparator klasse kan ook gebruikt worden met een List");
        var fruit3 = new ArrayList<String>();
        fruit3.add("Banaan");
        fruit3.add("Appel");
        fruit3.add("Peer");
        fruit3.add("Aardbei");
        fruit3.add("Druif");
        fruit3.sort(new DescendingComparator());
        for (var stukFruit : fruit3) {
            System.out.println(stukFruit + " ");
        }

    }
}
