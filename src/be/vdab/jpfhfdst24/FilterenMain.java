package be.vdab.jpfhfdst24;

import java.util.stream.Stream;

public class FilterenMain {
    public static void main(String[] args) {
        //var groenten = Stream.of("sla", "wortel", "kool", "biet");
        //var stream = groenten.filter(groente -> groente.length() == 4);
        //stream.forEach(groenteMet4Letters -> System.out.println(groenteMet4Letters));
        //kortere notatie
        Stream.of("sla", "wortel", "kool", "biet")
                .filter(groente -> groente.length() == 4)
                .forEach(groenteMet4Letters -> System.out.println(groenteMet4Letters));
    }
}
