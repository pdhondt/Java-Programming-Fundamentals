package be.vdab.jpfhfdst13;

// voorbeeld van een private method = niet-abstracte method die enkel
// in de interface zelf gebruikt kan worden
public interface Rekenmachine {

    default void toonAlleEvenNummers(int... nummers) {
        int som = 0;
        for (var nummer : nummers) {
            if (nummer % 2 == 0) {
                som += nummer;
            }
        }
        toonSom(som);
    }

    default void toonAlleOnevenNummers(int... nummers) {
        int som = 0;
        for (var nummer : nummers) {
            if (nummer % 2 != 0) {
                som += nummer;
            }
        }
        toonSom(som);
    }

    private void toonSom(int som) {
        System.out.println("De som = " + som);
    }

}
