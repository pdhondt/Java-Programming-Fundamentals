package be.vdab.jpfhfdst19;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class JPFhfdst19LocalTime {
    public static void main(String[] args) {
        var nu = LocalTime.now();
        System.out.println(nu);
        var middag = LocalTime.of(12, 0);
        System.out.println(middag);
        System.out.println();

        //onderdelen van een LocalTime object opvragen
        System.out.println(nu.getHour());
        System.out.println(nu.getMinute());
        System.out.println(nu.getSecond());
        System.out.println(nu.getNano());
        System.out.println();

        //LocalTime objecten vergelijken
        System.out.println(nu);
        var ietsLater = LocalTime.now();
        System.out.println(ietsLater);
        System.out.println(nu.equals(ietsLater));
        var straks = LocalTime.of(22, 58);
        System.out.println(nu.compareTo(straks));
        System.out.println(nu.isBefore(straks));
        var minutenTussen = ChronoUnit.MINUTES.between(nu, straks);
        System.out.println(minutenTussen);
        System.out.println();

        //berekeningen op een LocalTime
        var juistVoorMiddag = LocalTime.of(11, 59);
        var preciesMiddag = juistVoorMiddag.plusMinutes(1);
        System.out.println(preciesMiddag);
        System.out.println();

        //LocalTime opmaken
        var nogEensMiddag = LocalTime.of(12, 0);
        var formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(nogEensMiddag.format(formatter));
        formatter = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(nogEensMiddag.format(formatter));
        System.out.println();

        //string omzetten naar LocalTime
        formatter = DateTimeFormatter.ofPattern("H:m");
        var scanner = new Scanner(System.in);
        System.out.print("tijd (uren:minuten):");
        var tijdAlsString = scanner.next();
        var tijd = LocalTime.parse(tijdAlsString, formatter);
        System.out.println(tijd);

    }
}
