package be.vdab.jpfhfdst19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class JPFhfdst19LocalDate {
    public static void main(String[] args) {
        var vandaag = LocalDate.now();
        System.out.println(vandaag);
        var beginEuro = LocalDate.of(2002, 1, 1);
        System.out.println(beginEuro);
        var eindeBelgischeFrank = LocalDate.of(2001, Month.DECEMBER, 31);
        System.out.println(eindeBelgischeFrank);

        //Onderdelen van een LocalDate object opvragen
        System.out.println(eindeBelgischeFrank.getDayOfMonth());
        System.out.println(eindeBelgischeFrank.getDayOfYear());
        System.out.println(eindeBelgischeFrank.getDayOfWeek());
        System.out.println(eindeBelgischeFrank.getMonthValue());
        System.out.println(eindeBelgischeFrank.getMonth());
        System.out.println(eindeBelgischeFrank.lengthOfMonth());
        System.out.println(eindeBelgischeFrank.getYear());
        System.out.println(eindeBelgischeFrank.isLeapYear());
        System.out.println();

        //LocalDate objecten vergelijken
        var vandaag2 = LocalDate.now();
        var heden = LocalDate.now();
        System.out.println(vandaag2.equals(heden));
        var beginEuro2 = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println(beginEuro2.compareTo(heden));
        System.out.println(heden.compareTo(beginEuro2));
        System.out.println(heden.isAfter(beginEuro2));
        var dagenTussen = ChronoUnit.DAYS.between(beginEuro2, heden);
        System.out.println(dagenTussen);
        var jarenTussen = ChronoUnit.YEARS.between(beginEuro2, heden);
        System.out.println(jarenTussen);

        var period = Period.between(beginEuro2, vandaag2);
        System.out.println("De euro is " + period.getYears() + " jaar, " +
                period.getMonths() + " maand en " + period.getDays() + " dagen geleden ingevoerd.");
        System.out.println();

        //Berekeningen op een LocalDate
        var eindeBelgischeFrank2 = LocalDate.of(2001, 12, 31);
        var beginEuro3 = eindeBelgischeFrank2.plusDays(1);
        System.out.println(beginEuro3);
        System.out.println(beginEuro3.plusMonths(1));
        System.out.println(beginEuro3.minusDays(1));
        var vandaag3 = LocalDate.now();
        var adjuster = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        var volgendeWoensdag = vandaag3.with(adjuster);
        System.out.println(volgendeWoensdag);
        System.out.println();

        //een LocalDate opmaken
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(beginEuro.format(formatter));
        formatter = DateTimeFormatter.ofPattern("E d MMMM yyyy");
        System.out.println(beginEuro.format(formatter));

        //string omzetten naar LocalDate
        var formatter2 = DateTimeFormatter.ofPattern("d/M/yyyy");
        var scanner = new Scanner(System.in);
        System.out.print("datum (dag/maand/jaar):");
        var datumAlsString = scanner.next();
        var datum = LocalDate.parse(datumAlsString, formatter2);
        System.out.println(datum);

    }
}
