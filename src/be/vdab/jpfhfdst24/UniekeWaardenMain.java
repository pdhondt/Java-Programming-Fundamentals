package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class UniekeWaardenMain {
    public static void main(String[] args) {
        Stream.of("sla", "kool", "wortel", "biet", "sla")
                .distinct()
                .forEach(groente -> System.out.println(groente));
    }
}
