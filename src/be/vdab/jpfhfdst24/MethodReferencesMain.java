package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class MethodReferencesMain {
    private static String omgekeerd(StringBuilder builder) {
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        Stream.of("repel", "lepel")
                //.map(naam -> new StringBuilder(naam))
                .map(StringBuilder::new)
                //.map(naam -> omgekeerd(naam))
                .map(MethodReferencesMain::omgekeerd)
                //.map(naam -> naam.toLowerCase())
                .map(String::toLowerCase)
                //.forEach(naam -> System.out.println(naam));
                .forEach(System.out::println);

    }
}
