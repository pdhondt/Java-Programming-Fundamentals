package be.vdab.jpfhfdst05;

import java.util.Scanner;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        System.out.print("Geef een aantal seconden in: ");
        var scanner = new Scanner(System.in);
        var inputSeconden = scanner.nextInt();
        var aantalUren = inputSeconden / 3600;
        var rest = inputSeconden % 3600;
        var aantalMinuten = rest / 60;
        var aantalSeconden = rest % 60;
        System.out.println("U:" + aantalUren + " M:" + aantalMinuten + " S:" + aantalSeconden);
    }
}
