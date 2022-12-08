package be.vdab.util;

public class Isbn13Exception extends Exception {
    private String foutIsbnNummer;
    public Isbn13Exception() {

    }

    public Isbn13Exception(String omschrijving, String foutIsbnNummer) {
        super(omschrijving);
        this.foutIsbnNummer = foutIsbnNummer;
    }

    public String getFoutIsbnNummer() {
        return foutIsbnNummer;
    }
}
