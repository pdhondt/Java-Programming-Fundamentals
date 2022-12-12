package be.vdab.main;

import be.vdab.jpfhfdst20.Land;
import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class LandMain {
    public static void main(String[] args) {
        var alLanden = new ArrayList<Land>();
        var totaalBevolkingsDichtheid = BigDecimal.ZERO;
        try {
            alLanden.add(new Land("BE", "België", "Brussel", BigInteger.valueOf(11631136L), BigDecimal.valueOf(30528.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("LU", "Luxemburg", "Luxemburg", BigInteger.valueOf(645397L), BigDecimal.valueOf(2586.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("NL", "Nederland", "Amsterdam", BigInteger.valueOf(17590672L), BigDecimal.valueOf(41540.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("FR", "Frankrijk", "Parijs", BigInteger.valueOf(67842582L), BigDecimal.valueOf(633186.6)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("DE", "Duitsland", "Berlijn", BigInteger.valueOf(83237124L), BigDecimal.valueOf(357376.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("ES", "Spanje", "Madrid", BigInteger.valueOf(47432805L), BigDecimal.valueOf(505944.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("IT", "Italië", "Rome", BigInteger.valueOf(58983122L), BigDecimal.valueOf(302073.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("AT", "Oostenrijk", "Wenen", BigInteger.valueOf(8978929L), BigDecimal.valueOf(83879.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("HR", "Kroatië", "Zagreb", BigInteger.valueOf(3879074L), BigDecimal.valueOf(56594.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            alLanden.add(new Land("EL", "Griekenland", "Athene", BigInteger.valueOf(10603810L), BigDecimal.valueOf(132049.0)));
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }

        for (var land : alLanden) {
            if (land != null) {
                totaalBevolkingsDichtheid = totaalBevolkingsDichtheid.add(land.getBevolkingsDichtheid());
                System.out.println("\nGegevens van " + land.getLandNaam());
                System.out.println("Landcode: " + land.getLandCode());
                System.out.println("Hoofdstad: " + land.getHoofdstad());
                System.out.println("Aantal inwoners: " + land.getAantalInwoners() + " miljoen");
                System.out.println("Oppervlakte: " + land.getOppervlakte() + " km2");
                System.out.println("Bevolkingsdichtheid: " + land.getBevolkingsDichtheid() + " inwoners per vierkante kilometer");
            }
        }

        var gemBevolkingsDichtheid = totaalBevolkingsDichtheid.divide(new BigDecimal(alLanden.size()), 2, RoundingMode.HALF_UP);
        System.out.println("\nDe gemiddelde bevolkingsdichtheid bedraagt " + gemBevolkingsDichtheid + " inwoners per vierkante kilometer");

        var absoluutVerschil = BigDecimal.valueOf(Double.MAX_VALUE);
        var dichtstBijGemBevDichtheid = "";
        for (var land : alLanden) {
            var verschil = land.getBevolkingsDichtheid().subtract(gemBevolkingsDichtheid);
            if (verschil.abs().compareTo(absoluutVerschil) < 0) {
                absoluutVerschil =  verschil.abs();
                dichtstBijGemBevDichtheid = land.getLandNaam();
            }
        }

        System.out.println("\nHet land dat het dichtst aanleunt bij de gemiddelde bevolkingsdichtheid is " + dichtstBijGemBevDichtheid);

    }
}
