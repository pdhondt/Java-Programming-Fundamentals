package be.vdab.jpfhfdst24;

import java.util.ArrayList;
import java.util.Scanner;

public class OnevenGetallen {
    public static void main(String[] args) {
        System.out.println("Geef getallen in (0 om te stoppen):");
        var scanner = new Scanner(System.in);
        var getallen = new ArrayList<Integer>();
        for (int getal; (getal = scanner.nextInt()) != 0;) {
            getallen.add(getal);
        }
        getallen.stream()
                .filter(getal -> !(getal % 2 == 0))
                .sorted((getal1, getal2) -> getal2 - getal1)
                .forEach(getal -> System.out.println(getal));

    }
}
