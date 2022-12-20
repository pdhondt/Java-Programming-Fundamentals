package be.vdab.jpfhfdst24;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapMain {
    public static void main(String[] args) {
        var groentenPerLengte = Stream.of("sla", "kool", "wortel", "biet")
                .collect(Collectors.groupingBy(groente -> groente.length()));
        groentenPerLengte.entrySet().stream()
                .forEach(entry -> {
                    System.out.print(entry.getKey() + " ");
                    entry.getValue().stream()
                            .forEach(groente -> System.out.print(groente + " "));
                    System.out.println();
                });
    }
}
