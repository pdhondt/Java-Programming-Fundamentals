package be.vdab.jpfhfdst19;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GeboorteDatum {
    public static void main(String[] args) {

        System.out.print("Gelieve uw geboortedatum in te geven (dag/maand/jaar): ");
        var scanner = new Scanner(System.in);
        var geboorteDatumAlsString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        var geboorteDatum = LocalDate.parse(geboorteDatumAlsString, formatter);
        System.out.println(geboorteDatum);
        System.out.println("De dag waarop u geboren bent was een " + geboorteDatum.getDayOfWeek());
        var nu = LocalDate.now();
        System.out.println(nu);
        var period = Period.between(geboorteDatum, nu);
        System.out.println("Uw leeftijd is " + period.getYears());
        //andere manier
        System.out.println("Uw leeftijd is " + ChronoUnit.YEARS.between(geboorteDatum, nu));


    }
}
