package be.vdab.jpfhfdst24;

import java.util.ArrayList;
import java.util.List;

public class KleinsteOppervlakte {
    public static void main(String[] args) {
        List<Rechthoek> rechthoeken = new ArrayList<>();
        rechthoeken.add(new Rechthoek(6, 5));
        rechthoeken.add(new Rechthoek(7, 8));
        rechthoeken.add(new Rechthoek(12, 23));
        rechthoeken.add(new Rechthoek(10, 3));
        var oppervlaktes = rechthoeken.stream().mapToInt(rechthoek -> rechthoek.getOppervlakte());
        oppervlaktes.min().ifPresent(kleinste -> {
            System.out.println(kleinste);
            /*for (var rechthoek : rechthoeken) {
                if (kleinste == rechthoek.getOppervlakte()) {
                    System.out.println(rechthoek);
                }
            }*/
            rechthoeken.stream()
                    .filter(rechthoek -> rechthoek.getOppervlakte() == kleinste)
                    .forEach(rechthoek -> System.out.println(rechthoek));
        });
    }
}
