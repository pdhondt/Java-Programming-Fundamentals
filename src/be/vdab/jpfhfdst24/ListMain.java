package be.vdab.jpfhfdst24;

import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        var groenten = List.of("tomaat", "sla", "uit", "prei");
        groenten.stream().forEach(groente -> System.out.println(groente));
    }
}
