package be.vdab.jpfhfdst24;

import java.util.LinkedHashMap;

public class MapMain {
    public static void main(String[] args) {
        var talen = new LinkedHashMap<String, String>();
        talen.put("NL", "Nederlands");
        talen.put("FR", "Frans");
        talen.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " +
                entry.getValue()));
    }
}
