package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class RekenaarMain {
    public static void main(String[] args) {

        var expressie1 = "17 + 38 * 2 - 22";
        var rekenaar1 = new Rekenaar(expressie1);
        System.out.println("\nHet resultaat van " + expressie1 + " is " + rekenaar1.berekenResultaat());
        System.out.println(rekenaar1);

        var expressie2 = "";
        rekenaar1.setExpressie(expressie2);
        System.out.println("\nHet resultaat van " + expressie2 + " is " + rekenaar1.berekenResultaat());
        System.out.println(rekenaar1);

        var expressie3 = "8 * 8 - 8 + 8 / 8";
        rekenaar1.setExpressie(expressie3);
        System.out.println("\nHet resultaat van " + expressie3 + " is " + rekenaar1.berekenResultaat());
        System.out.println(rekenaar1);

        System.out.println("\nGeef een rekenkundige expressie in:");
        var scanner = new Scanner(System.in);
        var expressie4 = scanner.nextLine();
        rekenaar1.setExpressie(expressie4);
        System.out.println("\nHet resultaat van " + expressie4 + " is " + rekenaar1.berekenResultaat());
        System.out.println(rekenaar1);
    }
}
