package be.vdab.jpfhfdst17;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JPFhfdst17 {
    public static void main(String[] args) {
        var totaalF = 0.0F;
        for (var i = 0; i < 1000; i++) {
            totaalF += 0.01F;
        }
        System.out.println("Som met floats: " + totaalF);

        var totaalD = 0.0;
        for (var i = 0; i < 1000; i++) {
            totaalD += 0.01;
        }
        System.out.println("Som met doubles: " + totaalD);

        //Om van een int, long of double een object van de class BigDecimal te maken, gebruik je
        //de static method valueOf() (is performanter dan de constructor)
        var geluksGetal = BigDecimal.valueOf(7);
        var grootGetal = BigDecimal.valueOf(7123459L);
        var increment = BigDecimal.valueOf(0.01);

        //Om van een string met een decimale waarde een BigDecimal object te maken, moet je
        //wel de constructor gebruiken
        var piString = "3.141592653";
        var pi = new BigDecimal(piString);

        var zero = BigDecimal.ZERO;
        var one = BigDecimal.ONE;
        var ten = BigDecimal.TEN;

        var eenBigDecimal = BigDecimal.valueOf(2.365);
        System.out.println(eenBigDecimal.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(eenBigDecimal.setScale(2, RoundingMode.HALF_UP));

        var totaalBD = BigDecimal.ZERO;
        var incremBD = BigDecimal.valueOf(0.01);

        for (var i = 0; i < 1000; i++) {
            totaalBD = totaalBD.add(incremBD);
        }
        System.out.println("Som met BigDecimals: " + totaalBD);

    }
}
