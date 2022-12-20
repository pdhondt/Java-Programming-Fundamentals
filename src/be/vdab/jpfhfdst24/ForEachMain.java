package be.vdab.jpfhfdst24;

import java.util.Arrays;

public class ForEachMain {
    public static void main(String[] args) {
        var groenten = new String[] {"tomaat", "sla", "ui", "prei"};
        //var stream = Arrays.stream(groenten);
        //stream.forEach(groente -> System.out.println(groente));
        //korter
        Arrays.stream(groenten).forEach(groente -> System.out.println(groente));
    }
}
