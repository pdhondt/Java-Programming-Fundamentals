package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class CountMain {
    public static void main(String[] args) {
        System.out.println(Stream.of("sla", "wortel", "kool", "biet").count());
    }
}
