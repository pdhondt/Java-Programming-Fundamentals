package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class TransformerenMain {
    public static void main(String[] args) {
        Stream.of("sla", "wortel", "kool", "biet")
                .map(groente -> groente.length())
                .forEach(lengte -> System.out.println(lengte));
    }
}
