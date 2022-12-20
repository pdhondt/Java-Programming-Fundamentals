package be.vdab.jpfhfdst24;

import java.util.LinkedHashSet;

public class SetMain {
    public static void main(String[] args) {
        var heiligeGetallen = new LinkedHashSet<Integer>();
        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);
        heiligeGetallen.stream().forEach(getal -> System.out.println(getal));
    }
}
