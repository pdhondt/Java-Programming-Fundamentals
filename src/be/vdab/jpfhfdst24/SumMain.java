package be.vdab.jpfhfdst24;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumMain {
    public static void main(String[] args) {
        var stream = IntStream.of(1, 3, 4, 7);
        System.out.println(stream.sum());

        var stream2 = IntStream.of(1, 3, 4, 7);
        stream2.min().ifPresent(kleinste -> System.out.println(kleinste));

        var stream3 = IntStream.of(1, 3, 4, 7);
        stream3.max().ifPresent(grootste -> System.out.println(grootste));

        var stream4 = IntStream.of(1, 3, 4, 7);
        stream4.average().ifPresent(gemiddelde -> System.out.println(gemiddelde));

        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .mapToInt(groente -> groente.length())
                        .sum()
        );
    }
}
