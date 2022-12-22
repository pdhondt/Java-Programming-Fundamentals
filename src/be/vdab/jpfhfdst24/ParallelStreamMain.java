package be.vdab.jpfhfdst24;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreamMain {
    private static void zonderParallel(long aantalWaarden) {
        var random = new Random();
        var voor = System.nanoTime();
        Stream.generate(() -> BigDecimal.valueOf(random.nextDouble()))
                .limit(aantalWaarden)
                .filter(getal -> getal.remainder(BigDecimal.valueOf(2))
                .compareTo(BigDecimal.ZERO) == 0)
                .max((vorigGrootste, getal) -> vorigGrootste.compareTo(getal));
        System.out.println(String.format("%,16d:%,16d zonder parallel",
                aantalWaarden, System.nanoTime() - voor));
    }

    private static void metParallel(int aantalWaarden) {
        var random = new Random();
        var voor = System.nanoTime();
        Stream.generate(() -> BigDecimal.valueOf(random.nextDouble()))
                .parallel()
                .limit(aantalWaarden)
                .filter(getal -> getal.remainder(BigDecimal.valueOf(2))
                        .compareTo(BigDecimal.ZERO) == 0)
                .max((vorigGrootste, getal) -> vorigGrootste.compareTo(getal));
        System.out.println(String.format("%,16d:%,16d met parallel",
                aantalWaarden, System.nanoTime() - voor));
    }

    public static void main(String[] args) {
        Stream.of(10, 100, 1_000, 10_000, 100_000, 1_000_000, 10_000_000)
                .forEach(aantalWaarden -> {zonderParallel(aantalWaarden); metParallel(aantalWaarden);});
        System.out.println("the end");
    }
}
