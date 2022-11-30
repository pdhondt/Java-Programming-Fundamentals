package be.vdab.jpfhfdst07;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        System.out.println("Hoeveel huisdieren heeft u?");
        var scanner = new Scanner(System.in);
        var aantalHuisdieren = scanner.nextInt();
        switch (aantalHuisdieren) {
            case 0 -> System.out.println("Geen dierenliefhebber?");
            case 1, 2, 3 -> System.out.println("Aantal huisdieren: " + aantalHuisdieren);
            default -> System.out.println("Dat begint stilaan op een kleine dierentuin te lijken...");
        }
    }
}
