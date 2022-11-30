package be.vdab.jpfhfdst05;

import java.util.Scanner;

public class Invoer {
    public static void main(String[] args) {
        System.out.print("Geef een getal: ");
        var scanner = new Scanner(System.in);
        var getal = scanner.nextInt();
        System.out.print("Geef een lijn tekst in: ");
        scanner.skip("\n");
        String tekst = scanner.nextLine();
        System.out.println(getal);
        System.out.println(tekst);
    }
}
