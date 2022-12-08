package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;

public class Woordenboek extends Boek {
    private String taal;
    private static final float WINSTMARGE = 1.75F;

    public Woordenboek() throws Isbn13Exception {
        this("Woordenboek Nederlands", "Van Dale", 25.8F, "verklarend woordenboek", "978-1-2345-6789-7", "taal Nederlands");
    }

    public Woordenboek(String titel, String auteur, float aankoopPrijs, String genre, String isbn13, String taal) throws Isbn13Exception {
        super(titel, auteur, aankoopPrijs, genre, isbn13);
        setTaal(taal);
    }

    public String getTaal() {
        return taal;
    }

    public final void setTaal(String taal) {
        if (taal != null && !taal.isEmpty()) {
            this.taal = taal;
        }
    }

    public float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + taal + " ; " + WINSTMARGE;
    }

    @Override
    public float winstBerekenen() {
        return super.getAankoopPrijs() * WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Taal: " + taal);
        System.out.println("Winstmarge: " + WINSTMARGE);
        System.out.println("Winst: " + winstBerekenen());
    }
}
