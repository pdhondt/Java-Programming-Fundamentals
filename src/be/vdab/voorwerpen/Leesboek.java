package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;

public class Leesboek extends Boek {
    private String onderwerp;
    private static final float WINSTMARGE = 1.5F;

    public Leesboek() throws Isbn13Exception {
        this("Leesboek Java", "O Reilly", 10.5F, "genre studie", "978-1-78280-808-4", "onderwerp Informatica");
    }

    public Leesboek(String titel, String auteur, float aankoopPrijs, String genre, String isbn13, String onderwerp) throws Isbn13Exception {
        super(titel, auteur, aankoopPrijs, genre, isbn13);
        setOnderwerp(onderwerp);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public final void setOnderwerp(String onderwerp) {
        if (onderwerp != null && !onderwerp.isEmpty()) {
            this.onderwerp = onderwerp;
        }
    }

    public float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + onderwerp + " ; " + WINSTMARGE;
    }

    @Override
    public float winstBerekenen() {
        return super.getAankoopPrijs() * WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Onderwerp: " + onderwerp);
        System.out.println("Winstmarge: " + WINSTMARGE);
        System.out.println("Winst: " + winstBerekenen());
    }
}
