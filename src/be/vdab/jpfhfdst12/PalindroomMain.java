package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class PalindroomMain {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Geef een woord in:");
        var invoer = scanner.next();
        var palindroom = new Palindroom(new StringBuffer(invoer));
        System.out.println("Het ingevoerde woord is " + palindroom.getWoord());
        System.out.println("Het ingevoerde woord omgekeerd is " + palindroom.getWoordOmgekeerd());
        if (palindroom.isPalindroom(false)) {
            System.out.println("Dit is een palindroom");
        } else if (palindroom.isPalindroom(true)) {
            System.out.println("Zonder rekening te houden met de hoofdletters is dit een palindroom");
        } else {
            System.out.println("Geen palindroom!");
        }
    }
}
