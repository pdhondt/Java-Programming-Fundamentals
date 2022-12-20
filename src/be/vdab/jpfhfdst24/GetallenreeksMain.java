package be.vdab.jpfhfdst24;

import java.util.stream.IntStream;

public class GetallenreeksMain {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(getal -> System.out.println(getal));
        IntStream.range(1, 10).forEach(getal -> System.out.println(getal));
    }
}
