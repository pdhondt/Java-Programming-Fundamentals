package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class AnyMatchMain {
    public static void main(String[] args) {
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .anyMatch(groente -> groente.length() == 4));
    }
}
