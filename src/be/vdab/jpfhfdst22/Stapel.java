package be.vdab.jpfhfdst22;

import java.util.concurrent.atomic.AtomicInteger;

public class Stapel {
    //private int aantalPannenkoeken;
    // primitieve types zijn niet thread safe
    // we vervangen int door type AtomicInteger.  De klasse AtomicInteger stelt ook een geheel getal voor,
    // maar is thread safe: meerdere threads mogen deze gelijktijdig wijzigen.
    private final AtomicInteger aantalPannenkoeken = new AtomicInteger();

    public void voegPannenkoekToe() {
        //++aantalPannenkoeken;
        aantalPannenkoeken.incrementAndGet();
    }

    public int getAantalPannenkoeken() {
        //return aantalPannenkoeken;
        return aantalPannenkoeken.intValue();
    }
}
