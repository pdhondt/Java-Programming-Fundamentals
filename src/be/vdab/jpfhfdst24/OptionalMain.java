package be.vdab.jpfhfdst24;

import java.util.Optional;

public class OptionalMain {
    private static Optional<Integer> eersteCijfer(String string) {
        for (int index = 0; index != string.length(); index++) {
            var teken = string.charAt(index);
            if (Character.isDigit(teken)) {
                return Optional.of(Character.getNumericValue(teken));
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        /*
        var optioneelCijfer = eersteCijfer("all4you");
        if (optioneelCijfer.isPresent()) {
            System.out.println(optioneelCijfer.get() * 10);
        }
        optioneelCijfer = eersteCijfer("wrong");
        if (optioneelCijfer.isPresent()) {
            System.out.println(optioneelCijfer.get() * 10);
        }
        */

        // korter via lambda's
        eersteCijfer("all4you").ifPresent(cijfer -> System.out.println(cijfer * 10));
        eersteCijfer("wrong").ifPresent(cijfer -> System.out.println(cijfer * 10));

    }
}
