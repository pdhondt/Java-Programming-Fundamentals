package be.vdab.jpfhfdst24;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class ReduceMain {
    public static void main(String[] args) {
        // eerste (en meest algemene) versie
        System.out.println(
                Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                        .reduce(BigDecimal.ZERO, (vorigeSom, getal) -> vorigeSom.add(getal))
        );

        // tweede versie, met enkel lambda als parameter
        Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .reduce((vorigeSom, getal) -> vorigeSom.add(getal))
                .ifPresent(som -> System.out.println(som));

    }
}
