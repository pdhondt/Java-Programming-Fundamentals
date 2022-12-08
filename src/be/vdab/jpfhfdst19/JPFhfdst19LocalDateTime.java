package be.vdab.jpfhfdst19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JPFhfdst19LocalDateTime {
    public static void main(String[] args) {
        var nu = LocalDateTime.now();
        System.out.println(nu);
        System.out.println(nu.getDayOfMonth());
        System.out.println(nu.getHour());
        System.out.println();

        var beginEuro = LocalDateTime.of(2002, 1, 1, 0, 0);
        System.out.println(beginEuro);
        System.out.println(nu.isAfter(beginEuro));
        System.out.println(nu.plusDays(1));
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(nu.format(formatter));
    }
}
