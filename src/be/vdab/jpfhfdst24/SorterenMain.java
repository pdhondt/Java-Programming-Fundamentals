package be.vdab.jpfhfdst24;

import java.util.Comparator;
import java.util.stream.Stream;

public class SorterenMain {

    /*public static void main(String[] args) {
        Stream.of("sla", "wortel", "kool", "biet")
                //.sorted()
                .sorted((groente1, groente2) -> groente1.length() - groente2.length())
                .forEach(groente -> System.out.println(groente));
    }*/

    public static void main(String[] args) {
        Comparator<String> comparator = (groente1, groente2) -> groente1.length() - groente2.length();
        comparator = comparator.thenComparing((groente1, groente2) -> groente1.compareTo(groente2));
        Stream.of("sla", "wortel", "kool", "biet")
                .sorted(comparator)
                .forEach(groente -> System.out.println(groente));
    }

    /*public static void main(String[] args) {
        Stream.of("sla", "wortel", "kool", "biet")
                .filter(groente -> groente.length() == 4)
                .sorted()
                .forEach(groente -> System.out.println(groente));
    }*/

}
