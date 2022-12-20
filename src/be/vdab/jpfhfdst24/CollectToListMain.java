package be.vdab.jpfhfdst24;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToListMain {
    public static List<String> gesorteerdeGroenten() {
    //public static Set<String> gesorteerdeGroenten() {
        return Stream.of("sla", "wortel", "kool", "biet")
                .sorted()
                .collect(Collectors.toList());
                //.collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(gesorteerdeGroenten());
    }
}
