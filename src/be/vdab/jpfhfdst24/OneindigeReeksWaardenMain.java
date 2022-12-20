package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class OneindigeReeksWaardenMain {
    public static void main(String[] args) {
        Stream.iterate(1, vorigGetal -> vorigGetal + 2).limit(10).forEach(onevenGetal -> System.out.println(onevenGetal));
    }
}
