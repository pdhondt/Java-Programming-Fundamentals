package be.vdab.jpfhfdst24;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToStringMain {
    public static void main(String[] args) {
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .collect(Collectors.joining(", "))
        );
    }
}
