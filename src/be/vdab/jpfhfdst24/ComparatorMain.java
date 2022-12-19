package be.vdab.jpfhfdst24;

import java.util.Arrays;

public class ComparatorMain {
    public static void main(String[] args) {
        var groenten = new String[] {"tomaat", "sla", "ui", "prei"};
        Arrays.sort(groenten, (groente1, groente2) -> -groente1.compareTo(groente2));
        //Arrays.sort(groenten, (groente1, groente2) -> -(groente1.length() - groente2.length()));
        System.out.println(Arrays.toString(groenten));
    }
}
